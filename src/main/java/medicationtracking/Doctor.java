package medicationtracking;

/**
 * Doctor class represents a doctor in the pharmacy system.
 * It stores the doctor's ID, full name, and area of specialization.
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
     * 
     * @param id             Unique identifier for the doctor.
     * @param name           Full name of the doctor.
     * @param specialization Area of specialization (e.g., Cardiology, Neurology).
     */
    public Doctor(String id, String name, String specialization) {
        // Input validation to ensure no null or empty values
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Doctor ID cannot be null or empty.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Doctor name cannot be null or empty.");
        }
        if (specialization == null || specialization.isEmpty()) {
            throw new IllegalArgumentException("Specialization cannot be null or empty.");
        }
        
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    /**
     * Gets the unique identifier of the doctor.
     * 
     * @return Doctor's ID.
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the full name of the doctor.
     * 
     * @return Doctor's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the specialization of the doctor.
     * 
     * @return Doctor's specialization.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Returns a readable representation of the doctor object.
     * 
     * @return String representation of the doctor's details.
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
