package com.mediscreen.patientInfo.service;

import com.mediscreen.patientInfo.model.Patient;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    /**
     * Find all patients
     *
     * @return a list with all patients
     */
    Iterable<Patient> getAllPatients();

    /**
     * Find patients by first and last name
     *
     * @param firstName of wanted patient
     * @param lastName  of wanted patient
     * @return a list of patients whose first and last name are identical to those sought
     */
    List<Patient> getPatientListByFistNameAndLastName(String firstName, String lastName);

    /**
     * Find a patient by id
     *
     * @param id of wanted patient
     * @return patient found
     */
    Optional<Patient> getPatientById(int id);

    /**
     * Update an existing patient information
     *
     * @param patient to update
     * @return patient with information updated
     */
    Patient updatePatient(Patient patient);
}
