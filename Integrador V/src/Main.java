import ontologicalClinic.dao.ConfiguracaoJDBC;
import ontologicalClinic.dao.impl.AddressDaoImpl;
import ontologicalClinic.model.Address;
import ontologicalClinic.model.Patient;
import ontologicalClinic.service.AddressService;

import java.util.Date;

public class Main {

    AddressService addressService =  new AddressService(new AddressDaoImpl(new ConfiguracaoJDBC()));
    //Address address1 = AddressService.save;

//    Address("Rua rio douro", "456", "Contagem", "Novo Riacho");
//    Patient patient1 = new Patient("Felipe", "Oliveira", "MG-456.456", new Date(),address1.getId());
//    Patient patient2 = new patient("Felipe", "Oliveira", "MG-456.456", new Date());
//    Patient patient3 = new patient("Felipe", "Oliveira", "MG-456.456", new Date());
//
//            vice.save(new Patient("Felipe", "Oliveira", "MG-456.456", new Date(),addressService.save(new Address("Rua rio douro", "456", "Contagem", "Novo Riacho")).getId()));
//        patientService.save(new Patient("Amanda", "Martins", "SP-875.6985", new Date(),addressService.save(new Address("Rua rio paraopeba", "8789", "Betim", "Riacho das Pedras")).getId()));
//        patientService.save(new Patient("Ardalla", "Felipe", "DF-125.658", new Date(),addressService.save(new Address("Rua rio doce", "4598", "Belo Horizonte", "Santa cruz")).getId()));

}
