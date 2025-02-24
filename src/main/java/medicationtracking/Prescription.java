package medicationtracking;

/**
 * Prescription class represents a medical prescription in the system.
 * It contains details such as the prescription ID, patient ID, doctor ID, medication ID, quantity prescribed, and instructions for the medication.
 */
public class Prescription {
    // Unique identifier for the prescription
    private String prescriptionId;
    // ID of the patient the prescription is for
    private String patientId;
    // ID of the doctor who issued the prescription
    private String doctorId;
    // ID of the prescribed medication
    private String medicationId;
    // Quantity of the medication prescribed
    private int quantity;
    // Instructions for taking the medication
    private String instructions;

    /**
     * Constructor to initialize prescription details.
     * It initializes all the fields of the prescription.
     * 
     * @param prescriptionId - Unique ID of the prescription
     * @param patientId - ID of the patient the prescription is for
     * @param doctorId - ID of the doctor who issued the prescription
     * @param medicationId - ID of the prescribed medication
     * @param quantity - Quantity of medication prescribed
     * @param instructions - Instructions for taking the medication
     */
    public Prescription(String prescriptionId, String patientId, String doctorId, String medicationId, int quantity, String instructions) {
        this.prescriptionId = prescriptionId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.medicationId = medicationId;
        this.quantity = quantity;
        this.instructions = instructions;
    }

    /**
     * Getter for Prescription ID.
     * @return Prescription ID
     */
    public String getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * Getter for Patient ID.
     * @return Patient ID associated with the prescription
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Getter for Doctor ID.
     * @return Doctor ID who issued the prescription
     */
    public String getDoctorId() {
        return doctorId;
    }

    /**
     * Getter for Medication ID.
     * @return Medication ID prescribed in the prescription
     */
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * Getter for Quantity prescribed.
     * @return Quantity of the prescribed medication
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * Ensures the quantity is a positive number.
     * 
     * @param quantity - New quantity for the prescription
     * @throws IllegalArgumentException if the quantity is less than or equal to 0
     */
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive value.");
        }
        this.quantity = quantity;
    }

    /**
     * Getter for Instructions.
     * @return Instructions for taking the prescribed medication
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Setter for Instructions.
     * Ensures the instructions are not null or empty.
     * 
     * @param instructions - New instructions for taking the medication
     * @throws IllegalArgumentException if the instructions are null or empty
     */
    public void setInstructions(String instructions) {
        if (instructions == null || instructions.trim().isEmpty()) {
            throw new IllegalArgumentException("Instructions cannot be null or empty.");
        }
        this.instructions = instructions;
    }

    /**
     * Override toString() method to display prescription details in a readable format.
     * @return Formatted string containing prescription details
     */
    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId='" + prescriptionId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", medicationId='" + medicationId + '\'' +
                ", quantity=" + quantity +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}
