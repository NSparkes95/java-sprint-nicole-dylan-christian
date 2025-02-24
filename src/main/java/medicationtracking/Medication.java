/** Description: Medication class represents a medication in the medication tracking system.
 * 
 */

package medicationtracking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    // Expiry date of the medication
    private LocalDate expiryDate; 

    /**
     * Constructor to initialize medication details.
     * It includes input validation to ensure that all fields are valid.
     * 
     * @param id - Unique identifier for the medication
     * @param name - Name of the medication
     * @param dosage - Dosage of the medication in mg (must be positive)
     * @param quantityInStock - Quantity available in stock (must be positive)
     * @param expiryDate The expiry date of the medication.
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Medication(String id, String name, int dosage, int quantityInStock, LocalDate expiryDate) {
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
        if (expiryDate == null) {
            throw new IllegalArgumentException("Expiry date cannot be null.");
        }

        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.quantityInStock = quantityInStock;
        this.expiryDate = expiryDate;
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
     * Getter method for the expiry date of the medication.
     * @return The expiry date of the medication.
     */
    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    /**
     * Override toString() method to display medication details in a readable format.
     * @return Formatted string with medication details
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return "Medication{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dosage=" + dosage + "mg" +
                ", quantityInStock=" + quantityInStock +
                ", expiryDate=" + expiryDate.format(formatter) +
                '}';
    }
}
