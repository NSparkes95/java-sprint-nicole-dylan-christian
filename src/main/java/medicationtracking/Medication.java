package medicationtracking;

/**
 * Medication class represents a medication in the medication tracking system.
 * It contains attributes for medication ID, name, dosage, and quantity in stock.
 */
public class Medication {
    // Unique identifier for the medication
    private String id;
    
    // Name of the medication (e.g., Ibuprofen)
    private String name;
    
    // Dosage of the medication (e.g., 500mg)
    private int dosage;
    
    // Quantity available in stock
    private int quantityInStock;

    /**
     * Constructor to initialize medication details.
     * It includes input validation to ensure that all fields are valid.
     * 
     * @param id - Unique identifier for the medication
     * @param name - Name of the medication
     * @param dosage - Dosage of the medication in mg (must be positive)
     * @param quantityInStock - Quantity available in stock (must be positive)
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Medication(String id, String name, int dosage, int quantityInStock) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Medication ID cannot be empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Medication name cannot be empty.");
        }
        if (dosage <= 0) {
            throw new IllegalArgumentException("Dosage must be a positive value.");
        }
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Quantity in stock cannot be negative.");
        }

        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.quantityInStock = quantityInStock;
    }

    /**
     * Getter method for medication ID.
     * @return Medication's unique identifier
     */
    public String getId() {
        return id;
    }

    /**
     * Getter method for medication name.
     * @return Medication's name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method to update medication name.
     * @param name - New name for the medication
     * @throws IllegalArgumentException if the name is empty or null
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Medication name cannot be empty.");
        }
        this.name = name;
    }

    /**
     * Getter method for medication dosage.
     * @return Dosage of the medication in mg
     */
    public int getDosage() {
        return dosage;
    }

    /**
     * Setter method to update medication dosage.
     * @param dosage - New dosage value (must be positive)
     * @throws IllegalArgumentException if the dosage is less than or equal to 0
     */
    public void setDosage(int dosage) {
        if (dosage <= 0) {
            throw new IllegalArgumentException("Dosage must be a positive value.");
        }
        this.dosage = dosage;
    }

    /**
     * Getter method for quantity in stock.
     * @return Quantity available in stock
     */
    public int getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * Setter method to update quantity in stock.
     * @param quantityInStock - New quantity in stock (must be positive)
     * @throws IllegalArgumentException if the quantity is negative
     */
    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Quantity in stock cannot be negative.");
        }
        this.quantityInStock = quantityInStock;
    }

    /**
     * Override toString() method to display medication details in a readable format.
     * @return Formatted string with medication details
     */
    @Override
    public String toString() {
        return "Medication{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dosage=" + dosage + "mg" +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
