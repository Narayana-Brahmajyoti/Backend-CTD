package com.example.Checkpoint2.repository;

import com.example.Checkpoint2.entity.AddressEntity;

import java.util.HashMap;
import java.util.Map;

public class AddressRepository {

    private static Map<Integer, Address> addressMap = new HashMap<>();

    private static Integer idAddress = 1;

    public Address create(Address address){
        address.setId(idAddress++);
        addressMap.put(address.getId(),address);
        return address;
    }

    public Address getById(Integer id){
        return addressMap.get(id);
    }
}
