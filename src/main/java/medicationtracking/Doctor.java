package medicationtracking;

// Doctor class represents a doctor in the pharmacy system
public class Doctor {
    // Unique identifier for the doctor
    private String id;
    
    // Doctor's full name
    private String name;
    
    // Doctor's area of specialization (e.g., cardiology)
    private String specialization;

    // Constructor to initialize doctor details
    public Doctor(String id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    // Getter method for doctor ID
    public String getId() {
        return id;
    }

    // Getter method for doctor's full name
    public String getName() {
        return name;
    }

    // Getter method for doctor's specialization
    public String getSpecialization() {
        return specialization;
    }

    // Override toString() to display doctor details in a readable format
    @Override
    public String toString() {
        return "Doctor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
