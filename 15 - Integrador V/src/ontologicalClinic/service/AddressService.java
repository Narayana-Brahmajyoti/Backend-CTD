package ontologicalClinic.service;

import ontologicalClinic.dao.IDao;
import ontologicalClinic.model.Address;

public class AddressService {
    private IDao<Address> addressIDao;

    public AddressService(IDao<Address> addressIDao) {
        this.addressIDao = addressIDao;
    }

    public Address save(Address address){
        return addressIDao.save(address);
    }

    public Address search(int id){
        return addressIDao.search(id);
    }

    public void delete(int id){
        addressIDao.delete(id);
    }

    public Address edit(Address address){
        return addressIDao.edit(address);
    }
}
