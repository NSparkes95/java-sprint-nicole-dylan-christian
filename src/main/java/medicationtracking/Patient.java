package medicationtracking;

// Patient class represents a patient in the pharmacy system
public class Patient {
    // Unique identifier for the patient
    private String id;
    
    // Patient's full name
    private String name;
    
    // Patient's age
    private int age;
    
    // Contact information for the patient
    private String phoneNumber;

    // Constructor to initialize patient details
    public Patient(String id, String name, int age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Getter method for patient ID
    public String getId() {
        return id;
    }

    // Getter method for patient's full name
    public String getName() {
        return name;
    }

    // Getter method for patient's age
    public int getAge() {
        return age;
    }

    // Getter method for patient's contact number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Override toString() to display patient details in a readable format
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
