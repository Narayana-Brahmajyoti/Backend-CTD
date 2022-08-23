package test;

import ontologicalClinic.dao.ConfiguracaoJDBC;
import ontologicalClinic.dao.impl.AddressDaoImpl;
import ontologicalClinic.dao.impl.PatientDaoImpl;
import ontologicalClinic.model.Address;
import ontologicalClinic.model.Patient;
import ontologicalClinic.service.AddressService;
import ontologicalClinic.service.PatientService;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.Date;

class PatientServiceTest {
    ConfiguracaoJDBC configuracaoJDBC = new ConfiguracaoJDBC();
    private PatientService patientService = new PatientService(new PatientDaoImpl(configuracaoJDBC));
    private AddressService addressService = new AddressService(new AddressDaoImpl(configuracaoJDBC));

    @Test
    public void testes() throws SQLException {
        configuracaoJDBC.reset();

        patientService.save(new Patient("Felipe", "Oliveira", "MG-456.456", new Date(),addressService.save(new Address("Rua rio douro", "456", "Contagem", "Novo Riacho")).getId()));
        patientService.save(new Patient("Amanda", "Martins", "SP-875.6985", new Date(),addressService.save(new Address("Rua rio paraopeba", "8789", "Betim", "Riacho das Pedras")).getId()));
        patientService.save(new Patient("Ardalla", "Felipe", "DF-125.658", new Date(),addressService.save(new Address("Rua rio doce", "4598", "Belo Horizonte", "Santa cruz")).getId()));

        int id = patientService.save(new Patient("Carla", "Pereira", "SP-132.756", new Date(),addressService.save(new Address("Rua carangola", "1104", "Belo Horizonte", "Santo Antonio")).getId())).getId();

        System.out.println(patientService.search(id).toString());


        patientService.delete(id);

        patientService.search(id);

        System.out.println(patientService.search(1).toString());
        System.out.println(patientService.search(2).toString());
        System.out.println(patientService.search(3).toString());
        System.out.println(addressService.search(1).toString());
        System.out.println(addressService.search(2).toString());
        System.out.println(addressService.search(3).toString());
    }
}