package medicationtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * MedicationTrackingSystem class manages the lists and operations 
 * for the medication tracking system.
 */
public class MedicationTrackingSystem {
    // List to store all patients
    private List<Patient> patients = new ArrayList<>();
    
    // List to store all doctors
    private List<Doctor> doctors = new ArrayList<>();
    
    // List to store all medications
    private List<Medication> medications = new ArrayList<>();

    /**
     * Adds a new patient to the system.
     * @param patient The patient to add.
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient.getName());
    }

    /**
     * Deletes a patient by ID.
     * @param patientId The ID of the patient to delete.
     */
    public void deletePatient(String patientId) {
        // Loop through the list and remove the patient with the matching ID
        patients.removeIf(patient -> patient.getId().equals(patientId));
        System.out.println("Patient deleted with ID: " + patientId);
    }

    /**
     * Adds a new doctor to the system.
     * @param doctor The doctor to add.
     */
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor.getName());
    }

    /**
     * Deletes a doctor by ID.
     * @param doctorId The ID of the doctor to delete.
     */
    public void deleteDoctor(String doctorId) {
        // Loop through the list and remove the doctor with the matching ID
        doctors.removeIf(doctor -> doctor.getId().equals(doctorId));
        System.out.println("Doctor deleted with ID: " + doctorId);
    }

    /**
     * Adds a new medication to the system.
     * @param medication The medication to add.
     */
    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication added: " + medication.getName());
    }

    /**
     * Deletes a medication by ID.
     * @param medicationId The ID of the medication to delete.
     */
    public void deleteMedication(String medicationId) {
        // Loop through the list and remove the medication with the matching ID
        medications.removeIf(medication -> medication.getId().equals(medicationId));
        System.out.println("Medication deleted with ID: " + medicationId);
    }

    /**
     * Displays all patients in the system.
     */
    public void displayAllPatients() {
        System.out.println("\n=== All Patients ===");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    /**
     * Displays all doctors in the system.
     */
    public void displayAllDoctors() {
        System.out.println("\n=== All Doctors ===");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    /**
     * Displays all medications in the system.
     */
    public void displayAllMedications() {
        System.out.println("\n=== All Medications ===");
        for (Medication medication : medications) {
            System.out.println(medication);
        }
    }

    /**
     * Searches for a patient by name (case insensitive).
     * @param name The name of the patient to search for.
     */
    public void searchPatientByName(String name) {
        System.out.println("\n=== Search Results for Patients ===");
        boolean found = false;
        for (Patient patient : patients) {
            if (patient.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(patient);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No patients found with the name: " + name);
        }
    }

    /**
     * Searches for a doctor by name (case insensitive).
     * @param name The name of the doctor to search for.
     */
    public void searchDoctorByName(String name) {
        System.out.println("\n=== Search Results for Doctors ===");
        boolean found = false;
        for (Doctor doctor : doctors) {
            if (doctor.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(doctor);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No doctors found with the name: " + name);
        }
    }

    /**
     * Searches for a medication by name (case insensitive).
     * @param name The name of the medication to search for.
     */
    public void searchMedicationByName(String name) {
        System.out.println("\n=== Search Results for Medications ===");
        boolean found = false;
        for (Medication medication : medications) {
            if (medication.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(medication);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No medications found with the name: " + name);
        }
    }
}
