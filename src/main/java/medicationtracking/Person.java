package medicationtracking;

/**
 * The {@code Person} class serves as a base class for individuals in the system,
 * such as patients and doctors. It includes shared attributes like ID, name, 
 * phone number, and (for patients) age.
 */
public class Person {
    protected String id;
    protected String name;
    protected Integer age; // Nullable to allow flexibility for doctors.
    protected String phoneNumber;

    /**
     * Constructs a new {@code Person} object.
     * 
     * @param id          The unique ID of the person.
     * @param name        The full name of the person.
     * @param age         The age of the person (nullable for doctors).
     * @param phoneNumber The contact number of the person.
     * @throws IllegalArgumentException If ID, name, or phone number is empty.
     *                                  If age is provided, it must be a positive number.
     */
    public Person(String id, String name, Integer age, String phoneNumber) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid ID: ID cannot be null or empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Name: Name cannot be null or empty.");
        }
        if (age != null && age <= 0) {
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
     * Gets the person's ID.
     * 
     * @return The unique ID of the person.
     */
    public String getId() { 
        return id; 
    }

    /**
     * Gets the person's name.
     * 
     * @return The full name of the person.
     */
    public String getName() { 
        return name; 
    }

    /**
     * Gets the person's age.
     * 
     * @return The age of the person, or null if not applicable.
     */
    public Integer getAge() { 
        return age; 
    }

    /**
     * Gets the person's phone number.
     * 
     * @return The contact phone number.
     */
    public String getPhoneNumber() { 
        return phoneNumber; 
    }

    /**
     * Sets a new name for the person.
     * 
     * @param name The updated name.
     * @throws IllegalArgumentException If the name is empty or null.
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Name: Name cannot be null or empty.");
        }
        this.name = name;
    }

    /**
     * Sets a new age for the person.
     * 
     * @param age The updated age.
     * @throws IllegalArgumentException If age is not positive.
     */
    public void setAge(Integer age) {
        if (age != null && age <= 0) {
            throw new IllegalArgumentException("Invalid Age: Age must be a positive number.");
        }
        this.age = age;
    }

    /**
     * Sets a new phone number for the person.
     * 
     * @param phoneNumber The updated contact number.
     * @throws IllegalArgumentException If phone number is empty or null.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Phone Number: Phone number cannot be null or empty.");
        }
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns a string representation of the person.
     * 
     * @return A formatted string with person details.
     */
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + (age != null ? ", Age: " + age : "") + ", Phone: " + phoneNumber;
    }
}
