package medicationtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * MedicationTrackingSystem class manages the lists and operations 
 * for the medication tracking system.
 * It allows adding, deleting, displaying, searching, and editing 
 * patients, doctors, medications, and prescriptions.
 */
public class MedicationTrackingSystem {

    // === Data Storage ===
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Medication> medications = new ArrayList<>();
    private List<Prescription> prescriptions = new ArrayList<>();

    // ============================================================
    // === Patient Management Methods ===
    // ============================================================

    /**
     * Adds a new patient to the system.
     * @param patient The patient to add.
     */
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    /**
     * Deletes a patient by ID.
     * @param patientId The ID of the patient to delete.
     */
    public void deletePatient(String patientId) {
        patients.removeIf(patient -> patient.getId().equals(patientId));
        System.out.println("Patient deleted successfully!");
    }

    /**
     * Displays all patients in the system.
     */
    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            patients.forEach(System.out::println);
        }
    }

    /**
     * Searches for a patient by name.
     * @param name The name of the patient to search for.
     */
    public void searchPatientByName(String name) {
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
     * Edits a patient's details.
     * @param patientId The ID of the patient to edit.
     * @param newName The new name of the patient.
     * @param newAge The new age of the patient.
     * @param newPhoneNumber The new phone number of the patient.
     */
    public void editPatient(String patientId, String newName, int newAge, String newPhoneNumber) {
        for (Patient patient : patients) {
            if (patient.getId().equals(patientId)) {
                patient.setName(newName);
                patient.setAge(newAge);
                patient.setPhoneNumber(newPhoneNumber);
                System.out.println("Patient details updated successfully!");
                return;
            }
        }
        System.out.println("No patient found with ID: " + patientId);
    }

    // ============================================================
    // === Doctor Management Methods ===
    // ============================================================

    /**
     * Adds a new doctor to the system.
     * @param doctor The doctor to add.
     */
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    /**
     * Deletes a doctor by ID.
     * @param doctorId The ID of the doctor to delete.
     */
    public void deleteDoctor(String doctorId) {
        doctors.removeIf(doctor -> doctor.getId().equals(doctorId));
        System.out.println("Doctor deleted successfully!");
    }

    /**
     * Displays all doctors in the system.
     */
    public void displayAllDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            doctors.forEach(System.out::println);
        }
    }

    /**
     * Searches for a doctor by name.
     * @param name The name of the doctor to search for.
     */
    public void searchDoctorByName(String name) {
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
     * Edits a doctor's details.
     * @param doctorId The ID of the doctor to edit.
     * @param newName The new name of the doctor.
     * @param newSpecialization The new specialization of the doctor.
     */
    public void editDoctor(String doctorId, String newName, String newSpecialization) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(doctorId)) {
                doctor.setName(newName);
                doctor.setSpecialization(newSpecialization);
                System.out.println("Doctor details updated successfully!");
                return;
            }
        }
        System.out.println("No doctor found with ID: " + doctorId);
    }

    // ============================================================
    // === Medication Management Methods ===
    // ============================================================

    /**
     * Adds a new medication to the system.
     * @param medication The medication to add.
     */
    public void addMedication(Medication medication) {
        medications.add(medication);
        System.out.println("Medication added successfully!");
    }

    /**
     * Deletes a medication by ID.
     * @param medicationId The ID of the medication to delete.
     */
    public void deleteMedication(String medicationId) {
        medications.removeIf(medication -> medication.getId().equals(medicationId));
        System.out.println("Medication deleted successfully!");
    }

    /**
     * Displays all medications in the system.
     */
    public void displayAllMedications() {
        if (medications.isEmpty()) {
            System.out.println("No medications found.");
        } else {
            medications.forEach(System.out::println);
        }
    }

    /**
     * Searches for a medication by name.
     * @param name The name of the medication to search for.
     */
    public void searchMedicationByName(String name) {
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

    /**
     * Edits a medication's details.
     * @param medicationId The ID of the medication to edit.
     * @param newName The new name of the medication.
     * @param newDosage The new dosage of the medication.
     * @param newQuantity The new quantity of the medication.
     */
    public void editMedication(String medicationId, String newName, int newDosage, int newQuantity) {
        for (Medication medication : medications) {
            if (medication.getId().equals(medicationId)) {
                medication.setName(newName);
                medication.setDosage(newDosage);
                medication.setQuantityInStock(newQuantity);
                System.out.println("Medication details updated successfully!");
                return;
            }
        }
        System.out.println("No medication found with ID: " + medicationId);
    }

    // ============================================================
    // === Prescription Management Methods ===
    // ============================================================

    /**
     * Adds a new prescription to the system.
     * @param prescription The prescription to add.
     */
    public void addPrescription(Prescription prescription) {
        if (prescription == null) {
            System.out.println("Invalid prescription details.");
            return;
        }
        prescriptions.add(prescription);
        System.out.println("Prescription added successfully!");
    }

    /**
     * Deletes a prescription by ID.
     * @param prescriptionId The ID of the prescription to delete.
     */
    public void deletePrescription(String prescriptionId) {
        if (prescriptionId == null || prescriptionId.trim().isEmpty()) {
            System.out.println("Invalid prescription ID.");
            return;
        }
        boolean removed = prescriptions.removeIf(prescription -> prescription.getPrescriptionId().equals(prescriptionId));
        if (removed) {
            System.out.println("Prescription deleted successfully!");
        } else {
            System.out.println("No prescription found with ID: " + prescriptionId);
        }
    }

    /**
     * Displays all prescriptions.
     */
    public void displayAllPrescriptions() {
        System.out.println("\n=== All Prescriptions ===");
        if (prescriptions.isEmpty()) {
            System.out.println("No prescriptions found.");
        } else {
            prescriptions.forEach(System.out::println);
        }
    }
}
