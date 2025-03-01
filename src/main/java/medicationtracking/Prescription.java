package medicationtracking;

/**
 * The Prescription class represents a medical prescription in the system.
 * It contains details such as the prescription ID, patient ID, doctor ID, 
 * medication ID, quantity prescribed, and instructions for the medication.
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
     * Constructs a new Prescription with the specified details.
     *
     * @param prescriptionId The unique ID of the prescription.
     * @param patientId The ID of the patient the prescription is for.
     * @param doctorId The ID of the doctor who issued the prescription.
     * @param medicationId The ID of the prescribed medication.
     * @param quantity The quantity of medication prescribed.
     * @param instructions Instructions for taking the medication.
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
     * Gets the prescription ID.
     * @return The unique prescription ID.
     */
    public String getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * Gets the patient ID associated with this prescription.
     * @return The patient ID.
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Gets the doctor ID who issued the prescription.
     * @return The doctor ID.
     */
    public String getDoctorId() {
        return doctorId;
    }

    /**
     * Gets the medication ID prescribed in the prescription.
     * @return The medication ID.
     */
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * Gets the quantity of the prescribed medication.
     * @return The quantity of medication.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets a new quantity for the prescription.
     * Ensures that the quantity is a positive number.
     *
     * @param quantity The new quantity for the prescription.
     * @throws IllegalArgumentException if the quantity is less than or equal to 0.
     */
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive value.");
        }
        this.quantity = quantity;
    }

    /**
     * Gets the instructions for taking the prescribed medication.
     * @return The instructions for medication intake.
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets new instructions for taking the medication.
     * Ensures that the instructions are not null or empty.
     *
     * @param instructions The new instructions for the medication.
     * @throws IllegalArgumentException if the instructions are null or empty.
     */
    public void setInstructions(String instructions) {
        if (instructions == null || instructions.trim().isEmpty()) {
            throw new IllegalArgumentException("Instructions cannot be null or empty.");
        }
        this.instructions = instructions;
    }

    /**
     * Returns a string representation of the prescription, including its details.
     *
     * @return A formatted string containing prescription details.
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
