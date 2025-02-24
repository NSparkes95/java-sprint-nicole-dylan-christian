/**Description: Doctor class represents a doctor in the medication tracking system.
 */

package medicationtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Doctor class represents a doctor in the medication tracking system.
 * It contains attributes for doctor's ID, name, and specialization.
 */
public class Doctor {
    // Unique identifier for the doctor
    private String id;
    
    // Doctor's full name
    private String name;
    
    // Doctor's area of specialization (e.g., cardiology)
    private String specialization;

    // List of patients that the doctor is treating
    private List<Patient> assignedPatients = new ArrayList<>(); // List of patients that the doctor is treating

    /**
     * Constructor to initialize doctor details.
     * It includes input validation to ensure that all fields are not empty.
     * 
     * @param id - Unique identifier for the doctor
     * @param name - Doctor's full name
     * @param specialization - Doctor's area of specialization
     * @throws IllegalArgumentException if any parameter is empty or null
     */
    public Doctor(String id, String name, String specialization) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Doctor ID cannot be empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Doctor name cannot be empty.");
        }
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty.");
        }

        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    /**
     * Getter method for doctor ID.
     * 
     * @return Doctor's unique identifier
     */
    public String getId() {
        return id;
    }

    /**
     * Getter method for doctor's full name.
     * 
     * @return Doctor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to update doctor's name.
     * 
     * @param name - New name for the doctor
     * @throws IllegalArgumentException if the name is empty or null
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Doctor name cannot be empty.");
        }
        this.name = name;
    }

    /**
     * Getter method for doctor's specialization.
     * 
     * @return Doctor's area of specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Setter method to update doctor's specialization.
     * 
     * @param specialization - New area of specialization
     * @throws IllegalArgumentException if the specialization is empty or null
     */
    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty.");
        }
        this.specialization = specialization;
    }

    /**
     * Assign a patient to the doctor.
     * Ensures that the patient is not already assigned to the doctor.
     * 
     * @param patient The patient to assign to the doctor.
     */

    /**
     * Override toString() method to display doctor details in a readable format.
     * 
     * @return Formatted string with doctor's details
     */
    public void assignedPatients(Patient patient) {
        if(patient == null) {
            throw new IllegalArgumentException("Patient cannot be null.");
        }
        if(!assignedPatients.contains(patient)) {
            assignedPatients.add(patient);
            System.out.println("✅ Patient " + patient.getName() + " has been assigned to Doctor " + this.getName());
        } else {
            System.out.println("⚠️ Patient is already assigned to this doctor.");
        }
    }
    /**
    * Retrieves the list of patients assigned to this doctor.
    * 
    * @return A list of assigned patients.
    */
    public List<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
