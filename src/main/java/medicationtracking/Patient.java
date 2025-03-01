package medicationtracking;

/**
 * The Patient class represents a patient in the medication tracking system.
 * It extends the Person class and inherits common attributes like ID, name, age, and phone number.
 */
public class Patient extends Person {

    /**
     * Constructs a new Patient with the specified details.
     *
     * @param id          The unique identifier for the patient.
     * @param name        The full name of the patient.
     * @param age         The age of the patient.
     * @param phoneNumber The contact phone number of the patient.
     */
    public Patient(String id, String name, int age, String phoneNumber) {
        super(id, name, age, phoneNumber); // ✅ Calls the superclass constructor (Person)
    }

    /**
     * Returns a string representation of the patient, including inherited attributes.
     *
     * @return A formatted string containing patient details.
     */
    @Override
    public String toString() {
        return super.toString(); // ✅ Uses Person's toString() method
    }
}
