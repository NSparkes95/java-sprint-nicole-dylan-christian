package medicationtracking;

// Medication class represents a medication in the pharmacy system
public class Medication {
    // Unique identifier for the medication
    private String id;
    
    // Name of the medication (e.g., Ibuprofen)
    private String name;
    
    // Dosage of the medication (e.g., 500mg)
    private int dosage;
    
    // Quantity available in stock
    private int quantityInStock;

    // Constructor to initialize medication details
    public Medication(String id, String name, int dosage, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.quantityInStock = quantityInStock;
    }

    // Getter method for medication ID
    public String getId() {
        return id;
    }

    // Getter method for medication name
    public String getName() {
        return name;
    }

    // Getter method for medication dosage
    public int getDosage() {
        return dosage;
    }

    // Getter method for quantity in stock
    public int getQuantityInStock() {
        return quantityInStock;
    }

    // Override toString() to display medication details in a readable format
    @Override
    public String toString() {
        return "Medication{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dosage=" + dosage +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
