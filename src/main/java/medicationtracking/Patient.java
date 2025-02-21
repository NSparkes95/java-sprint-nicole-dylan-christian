package medicationtracking;

/**
 * Patient class represents a patient in the medication tracking system.
 * It stores patient details such as ID, name, age, and contact information.
 */
public class Patient {
    // Unique identifier for the patient
    private String id;
    
    // Patient's full name
    private String name;
    
    // Patient's age (must be a positive number)
    private int age;
    
    // Contact information for the patient
    private String phoneNumber;

    /**
     * Constructor to initialize patient details.
     * Ensures input validation for all fields.
     * 
     * @param id Unique identifier for the patient.
     * @param name Full name of the patient.
     * @param age Age of the patient (must be a positive number).
     * @param phoneNumber Contact number of the patient.
     */
    public Patient(String id, String name, int age, String phoneNumber) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid ID: ID cannot be null or empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Name: Name cannot be null or empty.");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid Age: Age must be a positive number.");
        }
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Phone Number: Phone number cannot be null or empty.");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter method for patient ID.
     * @return The unique identifier of the patient.
     */
    public String getId() {
        return id;
    }

    /**
     * Getter method for patient's full name.
     * @return The full name of the patient.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for patient's age.
     * @return The age of the patient.
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter method for patient's contact number.
     * @return The contact phone number of the patient.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets a new name for the patient.
     * Validates the new name before updating.
     * 
     * @param name The new full name for the patient.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Name: Name cannot be null or empty.");
        }
        this.name = name;
    }

    /**
     * Sets a new age for the patient.
     * Validates the new age before updating.
     * 
     * @param age The new age for the patient.
     */
    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid Age: Age must be a positive number.");
        }
        this.age = age;
    }

    /**
     * Sets a new contact number for the patient.
     * Validates the new phone number before updating.
     * 
     * @param phoneNumber The new contact phone number for the patient.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Phone Number: Phone number cannot be null or empty.");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Override toString() to display patient details in a readable format.
     * @return A string representation of the patient's details.
     */
    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
