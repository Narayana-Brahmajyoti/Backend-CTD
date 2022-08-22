package ontologicalClinic.service;

import ontologicalClinic.dao.IDao;
import ontologicalClinic.model.Patient;

public class PatientService {
    private IDao<Patient> patientIDao;

    public PatientService(IDao<Patient> patientIDao) {
        this.patientIDao = patientIDao;
    }

    public Patient save(Patient paciente){
        return patientIDao.save(paciente);
    }

    public Patient search(int id){
        return patientIDao.search(id);
    }

    public void delete(int id){
        patientIDao.delete(id);
    }

    public Patient edit(Patient patient){
        return patientIDao.edit(patient);
    }
}
