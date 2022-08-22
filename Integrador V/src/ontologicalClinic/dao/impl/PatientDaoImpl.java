package ontologicalClinic.dao.impl;

import ontologicalClinic.dao.ConfiguracaoJDBC;
import ontologicalClinic.dao.IDao;
import ontologicalClinic.model.Patient;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDaoImpl implements IDao<Patient> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(PatientDaoImpl.class);

    public PatientDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Patient save(Patient patient) {
        log.debug("Saving a new patient: " + patient.toString());
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO patient(name,lastName,rg,idAddress) VALUES('%s','%s','%s','%s')",
                patient.getName(),patient.getLastName(),patient.getRg(),patient.getIdAddress());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if(resultSet.next())
                patient.setId(resultSet.getInt(1));
            connection.close();
        } catch(Exception e){
            e.printStackTrace();
        }
        return patient;
    }

    @Override
    public Patient search(int id) {
        log.debug("Looking for patient " + id);
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("SELECT * FROM patient WHERE id='%s'", id);
        Patient patient = null;
        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next())
                patient = new Patient(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDate(5),
                        resultSet.getInt(6)
                );
            if(patient == null){
                throw new Exception("Patient not found!");
            }
        }  catch(Exception e){
            e.printStackTrace();
        }
        return patient;
    }

    @Override
    public void delete(int id) {
        log.debug("Excluding patient" + id);
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("DELETE FROM patient WHERE id='%s'",id);
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.close();
        }  catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Patient edit(Patient patient) {
        log.debug("Updating patient data" + patient.getId());
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("UPDATE patient SET name='%s',lastName='%s',rg='%s',idAddress='%s' WHERE id='%s'",
                patient.getName(),patient.getLastName(),patient.getRg(),patient.getIdAddress(),patient.getId());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.close();
        }  catch(Exception e){
            e.printStackTrace();
        }
        return patient;
    }


}
