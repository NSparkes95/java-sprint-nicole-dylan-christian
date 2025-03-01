package medicationtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code Doctor} class represents a medical professional in the system.
 * This class extends {@link Person}, inheriting common attributes like ID, name, and phone number.
 * 
 * <p>Doctors are assigned a specialization and can be linked to multiple patients.
 */
public class Doctor extends Person {
    private String specialization;
    private List<Patient> assignedPatients;

    /**
     * Constructs a new {@code Doctor} object.
     * 
     * @param id          The unique ID of the doctor.
     * @param name        The full name of the doctor.
     * @param phoneNumber The contact number of the doctor.
     * @param specialization The medical specialization of the doctor.
     * @throws IllegalArgumentException If specialization is empty or null.
     */
    public Doctor(String id, String name, String phoneNumber, String specialization) {
        super(id, name, null, phoneNumber); // Doctors do not require an age.
        
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty.");
        }
        
        this.specialization = specialization;
        this.assignedPatients = new ArrayList<>();
    }

    /**
     * Gets the specialization of the doctor.
     * 
     * @return The doctor's specialization.
     */
    public String getSpecialization() { 
        return specialization; 
    }

    /**
     * Sets a new specialization for the doctor.
     * 
     * @param specialization The new specialization.
     * @throws IllegalArgumentException If the specialization is empty or null.
     */
    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty.");
        }
        this.specialization = specialization;
    }

    /**
     * Gets the list of patients assigned to the doctor.
     * 
     * @return A list of {@link Patient} objects.
     */
    public List<Patient> getAssignedPatients() { 
        return assignedPatients; 
    }

    /**
     * Assigns a patient to this doctor.
     * 
     * @param patient The patient to assign.
     * @throws IllegalArgumentException If the patient is null.
     */
    public void assignPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null.");
        }
        if (!assignedPatients.contains(patient)) {
            assignedPatients.add(patient);
            System.out.println("✅ Patient " + patient.getName() + " has been assigned to Doctor " + this.getName());
        } else {
            System.out.println("⚠️ Patient is already assigned to this doctor.");
        }
    }

    /**
     * Returns a string representation of the doctor.
     * 
     * @return A formatted string containing doctor details.
     */
    @Override
    public String toString() {
        return super.toString() + ", Specialization: " + specialization + ", Assigned Patients: " + assignedPatients.size();
    }
}
