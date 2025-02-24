/**Description: This class manages the lists and operations for the medication tracking system.
 * 
 */

package medicationtracking;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

/**
 * MedicationTrackingSystem class manages the lists and operations 
 * for the medication tracking system.
 * It allows adding, deleting, displaying, searching, and editing 
 * patients, doctors, medications, and prescriptions.
 */
public class MedicationTrackingSystem {

    // === Data Storage ===
    private List<Prescription> prescriptions = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Medication> medications = new ArrayList<>();

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

    /**
    * Assigns a patient to a doctor using their IDs.
    * 
    * @param doctorId The unique ID of the doctor.
    * @param patientId The unique ID of the patient.
    * @return True if assignment is successful, false otherwise
    */
    public boolean assignPatientToDoctor(String doctorId, String patientId) {
        Doctor doctor = doctors.stream()
                .filter(d -> d.getId().equals(doctorId))
                .findFirst()
                .orElse(null);
    
        Patient patient = patients.stream()
                .filter(p -> p.getId().equals(patientId))
                .findFirst()
                .orElse(null);
    
        if (doctor == null) {
            System.out.println("Doctor not found.");
            return false;
        }
        if (patient == null) {
            System.out.println("Patient not found.");
            return false;
        }
    
        doctor.getAssignedPatients().add(patient);
        return true;
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

    /**
    * Displays all prescriptions issued by a specific doctor.
    * 
    * @param doctorId The ID of the doctor whose prescriptions should be listed.
    */
    public void displayPrescriptionsByDoctor(String doctorId) {
        System.out.println("\n=== Prescriptions Issued by Doctor: " + doctorId + " ===");

        List<Prescription> doctorPrescriptions = prescriptions.stream()
                .filter(p -> p.getDoctorId().equals(doctorId))
                .collect(Collectors.toList()); // ✅ Collect the filtered prescriptions
    
        if (doctorPrescriptions.isEmpty()) {
            System.out.println("No prescriptions found for doctor with ID: " + doctorId);
        } 
        for (Prescription p : doctorPrescriptions) {
            System.out.println("\nPrescription ID: " + p.getPrescriptionId());
            System.out.println("Patient ID: " + p.getPatientId());
            System.out.println("Medication ID: " + p.getMedicationId());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("Instructions: " + p.getInstructions());
            System.out.println("--------------------------------");
        }
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
 * Restocks all medications in the pharmacy by increasing their quantity.
 * The restock amount is randomly generated between 5 and 15 units per medication.
 */
    public void restockMedications() { // Restocks all medications in the pharmacy
        if (medications.isEmpty()) {
            System.out.println("No medications available to restock.");
            return;
        }

        for (Medication med : medications) { // Restocks each medication
            int addedStock = (int) (Math.random() * 11) + 5; // Adds between 5-15 units
            med.setQuantityInStock(med.getQuantityInStock() + addedStock);
            System.out.println("Restocked " + med.getName() + " by " + addedStock + " units. New total: " + med.getQuantityInStock());
        }
        System.out.println("All medications have been restocked.");
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

    /**
    * Checks and displays expired medications.
    */
    public void checkExpiredMedications() {
        System.out.println("\n=== Expired Medications ===");

        List<Medication> expiredMedications = medications.stream()
            .filter(Medication::isExpired)
            .collect(Collectors.toList());

        if (expiredMedications.isEmpty()) {
            System.out.println("No expired medications found.");
        } else {
            for (Medication med : expiredMedications) {
                System.out.println(med);
            }
        }
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
    * Displays all prescriptions for a specific patient.
    * 
    * @param patientId The ID of the patient whose prescriptions are to be listed.
    */
    public void displayPrescriptionsByPatient(String patientId) {
        System.out.println("\n=== Prescriptions for Patient: " + patientId + " ===");

        List<Prescription> patientPrescriptions = prescriptions.stream()
                .filter(p -> p.getPatientId().equals(patientId))
                .collect(Collectors.toList()); // ✅ Collect the filtered prescriptions
    
        if (patientPrescriptions.isEmpty()) {
            System.out.println("No prescriptions found for patient with ID: " + patientId);
        } 
        for (Prescription p : patientPrescriptions) {
            System.out.println("\nPrescription ID: " + p.getPrescriptionId());
            System.out.println("Doctor ID: " + p.getDoctorId());
            System.out.println("Medication ID: " + p.getMedicationId());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("Instructions: " + p.getInstructions());
            System.out.println("--------------------------------");
        }
    }

    /**
    * Returns the list of all prescriptions.
     * @return List of prescriptions in the system
    */
    public List<Prescription> getPrescriptions() {
        return prescriptions;
    }


    // ============================================================
    // === Report Methods ===
    // ============================================================

    /**
    * Displays all prescriptions in a detailed format.
    * Lists patient, doctor, medication, dosage, and instructions.
    */
    
    public void generatePrescriptionReport() {
        System.out.println("\n=== All Prescriptions ===");

        if (prescriptions.isEmpty()) {
            System.out.println("No prescriptions found.");
            return;
        } 
        
        for (Prescription p : prescriptions) {
            // Get Patient (If Prescription stores only an ID, find Patient object)
            Patient patient = patients.stream()
                .filter(pt -> pt.getId().equals(p.getPatientId())) // ✅ Compare IDs correctly
                .findFirst()
                .orElse(null);
    
            // Get Doctor (If Prescription stores only an ID, find Doctor object)
            Doctor doctor = doctors.stream()
                .filter(dr -> dr.getId().equals(p.getDoctorId()))
                .findFirst()
                .orElse(null);
    
            // Get Medication (If Prescription stores only an ID, find Medication object)
            Medication medication = medications.stream()
                .filter(med -> med.getId().equals(p.getMedicationId()))
                .findFirst()
                .orElse(null);
    
            System.out.println("\nPatient: " + (patient != null ? patient.getName() : "Unknown"));
            System.out.println("Doctor: " + (doctor != null ? doctor.getName() : "Unknown"));
            System.out.println("Medication: " + (medication != null ? medication.getName() : "Unknown"));
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("Instructions: " + p.getInstructions());
            System.out.println("--------------------------------");
        }
    }

      /**
     * Generates a system-wide report displaying all patients, doctors, medications, and prescriptions.
     * If any section is empty, it displays a message indicating no records found.
     */
    public void generateSystemReport() {
        System.out.println("\n=== System-WIDE Report ===");
        
        // Print all patients 
        System.out.println("\n=== All Patients ===");
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient p : patients) {
                System.out.println(p);
            }
        }

        // Print all doctors
        System.out.println("\n=== All Doctors ===");
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (Doctor d : doctors) {
                System.out.println(d);
            }
        }

        // Print all medications
        System.out.println("\n=== All Medications ===");
        if (medications.isEmpty()) {
            System.out.println("No medications found.");
        } else {
            for (Medication m : medications) {
                System.out.println(m);
            }
        }

        // Print all prescriptions
        System.out.println("\n=== All Prescriptions ===");
        if (prescriptions.isEmpty()) {
            System.out.println("No prescriptions found.");
        } else {
            for (Prescription p : prescriptions) {
                System.out.println(p);
            }
        }

        System.out.println("\n=== End of Report ===");
    }
}
