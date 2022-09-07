package com.example.Checkpoint2.repository;

import com.example.Checkpoint2.entity.Address;
import com.example.Checkpoint2.entity.Patient;

import java.util.HashMap;
import java.util.Map;

public class PatientRepository {

    private static Map<Integer, Patient> patientMap = new HashMap<>();

    private static Integer idPatient = 1;

    public Patient create(Patient patient){
        patient.setId(idPatient++);
        patientMap.put(patient.getId(),patient);
        return patient;
    }

    public Patient getById(Integer id){
        return patientMap.get(id);
    }


}
