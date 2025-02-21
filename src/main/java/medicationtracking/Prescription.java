package medicationtracking;

/**
 * Prescription class represents a medical prescription in the system.
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
     */
    public String getPrescriptionId() {
        return prescriptionId;
    }

    /**
     * Getter for Patient ID.
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * Getter for Doctor ID.
     */
    public String getDoctorId() {
        return doctorId;
    }

    /**
     * Getter for Medication ID.
     */
    public String getMedicationId() {
        return medicationId;
    }

    /**
     * Getter for Quantity.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * @param quantity - The new quantity for the prescription.
     */
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be a positive value.");
        }
        this.quantity = quantity;
    }

    /**
     * Getter for Instructions.
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Setter for Instructions.
     * @param instructions - The new instructions for taking the medication.
     */
    public void setInstructions(String instructions) {
        if (instructions == null || instructions.trim().isEmpty()) {
            throw new IllegalArgumentException("Instructions cannot be null or empty.");
        }
        this.instructions = instructions;
    }

    /**
     * Override toString() to display prescription details.
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
