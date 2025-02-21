package medicationtracking;

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

    /**
     * Constructor to initialize doctor details.
     * It includes input validation to ensure that all fields are not empty.
     * 
     * @param id - Unique identifier for the doctor
     * @param name - Doctor's full name
     * @param specialization - Doctor's area of specialization
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
     * @return Doctor's unique identifier
     */
    public String getId() {
        return id;
    }

    /**
     * Getter method for doctor's full name.
     * @return Doctor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to update doctor's name.
     * @param name - New name for the doctor
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Doctor name cannot be empty.");
        }
        this.name = name;
    }

    /**
     * Getter method for doctor's specialization.
     * @return Doctor's area of specialization
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Setter method to update doctor's specialization.
     * @param specialization - New area of specialization
     */
    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be empty.");
        }
        this.specialization = specialization;
    }

    /**
     * Override toString() method to display doctor details in a readable format.
     * @return Formatted string with doctor's details
     */
    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
