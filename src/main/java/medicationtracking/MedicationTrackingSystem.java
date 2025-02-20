package medicationtracking;

import java.util.ArrayList;
import java.util.List;

// MedicationTrackingSystem class manages the lists and operations for the pharmacy system
public class MedicationTrackingSystem {
    // List to store all patients
    private List<Patient> patients = new ArrayList<>();
    
    // List to store all doctors
    private List<Doctor> doctors = new ArrayList<>();
    
    // List to store all medications
    private List<Medication> medications = new ArrayList<>();

    // Adding a new patient to the system
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added: " + patient.getName());
    }

    // Deleting a patient by ID
    public void deletePatient(String patientId) {
        // Loop through the list and remove the patient with the matching ID
        patients.removeIf(patient -> patient.getId().equals(patientId));
        System.out.println("Patient deleted with ID: " + patientId);
    }

    // Adding a new doctor to the system
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added: " + doctor.getName());
    }

    // Deleting a doctor by ID
    public void deleteDoctor(String doctorId) {
        // Loop through the list and remove the doctor with the matching ID
        doctors.removeIf(doctor -> doctor.getId().equals(doctorId));
        System.out.println("Doctor deleted with ID: " + doctorId);
    }

    // Adding a new medication to the system
    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication added: " + medication.getName());
    }

    // Deleting a medication by ID
    public void deleteMedication(String medicationId) {
        // Loop through the list and remove the medication with the matching ID
        medications.removeIf(medication -> medication.getId().equals(medicationId));
        System.out.println("Medication deleted with ID: " + medicationId);
    }

    // Display all patients in the system
    public void displayAllPatients() {
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    // Display all doctors in the system
    public void displayAllDoctors() {
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    // Display all medications in the system
    public void displayAllMedications() {
        System.out.println("Medications:");
        for (Medication medication : medications) {
            System.out.println(medication);
        }
    }
}
