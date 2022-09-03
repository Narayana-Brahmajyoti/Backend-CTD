package ontologicalClinic.dao.impl;

import ontologicalClinic.dao.ConfiguracaoJDBC;
import ontologicalClinic.dao.IDao;
import ontologicalClinic.model.Address;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressDaoImpl implements IDao<Address>{
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(AddressDaoImpl.class);

    public AddressDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Address save(Address address) {
        log.debug("Adding new address");
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO address(street,number,city,district) VALUES('%s','%s','%s','%s')",
                address.getStreet(),address.getNumber(),address.getCity(),address.getDistrict());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                address.setId(resultSet.getInt(1));

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public Address search(int id) {
        log.debug("Looking for address " + id);
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("SELECT * FROM address WHERE id='%s'",
                id);
        Address address = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                address = new Address(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                );
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }

    @Override
    public void delete(int id) {
        log.debug("Excluding address " + id);
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("DELETE FROM address where id='%s'",
                id);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Address edit(Address address) {
        log.debug("Editing the address " + address.getId());
        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("UPDATE address SET street='%s',number='%s',city='%s',district='%s' WHERE id='%s'",
                address.getStreet(),address.getNumber(),address.getCity(),address.getDistrict(),address.getId());
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }
}
