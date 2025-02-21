package medicationtracking;

import java.util.Scanner;

/**
 * Menu class displays a console-based menu for the Medication Tracking System.
 * It allows users to add, delete, view, and search patients, doctors, and medications.
 */
public class Menu {

    // Creating an instance of MedicationTrackingSystem to manage the entities
    private MedicationTrackingSystem trackingSystem;
    private Scanner scanner;

    /**
     * Constructor initializes the MedicationTrackingSystem and Scanner for user input.
     */
    public Menu() {
        trackingSystem = new MedicationTrackingSystem();
        scanner = new Scanner(System.in);
    }

    /**
     * Main method to launch the Medication Tracking System menu.
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }

    /**
     * Displays the console menu and handles user input.
     */
    public void displayMenu() {
        int choice;

        do {
            System.out.println("\n=== Medication Tracking System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. Delete Doctor");
            System.out.println("5. Add Medication");
            System.out.println("6. Delete Medication");
            System.out.println("7. View All Patients");
            System.out.println("8. View All Doctors");
            System.out.println("9. View All Medications");
            System.out.println("10. Search Patient by Name");
            System.out.println("11. Search Doctor by Name");
            System.out.println("12. Search Medication by Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    deletePatient();
                    break;
                case 3:
                    addDoctor();
                    break;
                case 4:
                    deleteDoctor();
                    break;
                case 5:
                    addMedication();
                    break;
                case 6:
                    deleteMedication();
                    break;
                case 7:
                    viewAllPatients();
                    break;
                case 8:
                    viewAllDoctors();
                    break;
                case 9:
                    viewAllMedications();
                    break;
                case 10:
                    searchPatient();
                    break;
                case 11:
                    searchDoctor();
                    break;
                case 12:
                    searchMedication();
                    break;
                case 0:
                    System.out.println("Exiting Medication Tracking System...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }

    /**
     * Adds a new patient by getting input from the user.
     */
    private void addPatient() {
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Patient Phone Number: ");
        String phoneNumber = scanner.nextLine();
        
        // Creating Patient object and passing it to the system
        Patient patient = new Patient(id, name, age, phoneNumber);
        trackingSystem.addPatient(patient);
        System.out.println("Patient added successfully!");
    }

    /**
     * Deletes a patient by ID.
     */
    private void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        String id = scanner.nextLine();
        
        trackingSystem.deletePatient(id);
        System.out.println("Patient deleted successfully!");
    }

    /**
     * Adds a new doctor by getting input from the user.
     */
    private void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Doctor Specialization: ");
        String specialization = scanner.nextLine();
        
        // Creating Doctor object and passing it to the system
        Doctor doctor = new Doctor(id, name, specialization);
        trackingSystem.addDoctor(doctor);
        System.out.println("Doctor added successfully!");
    }

    /**
     * Deletes a doctor by ID.
     */
    private void deleteDoctor() {
        System.out.print("Enter Doctor ID to delete: ");
        String id = scanner.nextLine();
        
        trackingSystem.deleteDoctor(id);
        System.out.println("Doctor deleted successfully!");
    }

    /**
     * Adds a new medication by getting input from the user.
     */
    private void addMedication() {
        System.out.print("Enter Medication ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Medication Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Dosage (in mg): ");
        int dosage = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Quantity in Stock: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        
        // Creating Medication object and passing it to the system
        Medication medication = new Medication(id, name, dosage, quantity);
        trackingSystem.addMedication(medication);
        System.out.println("Medication added successfully!");
    }

    /**
     * Deletes a medication by ID.
     */
    private void deleteMedication() {
        System.out.print("Enter Medication ID to delete: ");
        String id = scanner.nextLine();
        
        trackingSystem.deleteMedication(id);
        System.out.println("Medication deleted successfully!");
    }

    /**
     * Displays all patients.
     */
    private void viewAllPatients() {
        System.out.println("\n=== All Patients ===");
        trackingSystem.displayAllPatients();
    }

    /**
     * Displays all doctors.
     */
    private void viewAllDoctors() {
        System.out.println("\n=== All Doctors ===");
        trackingSystem.displayAllDoctors();
    }

    /**
     * Displays all medications.
     */
    private void viewAllMedications() {
        System.out.println("\n=== All Medications ===");
        trackingSystem.displayAllMedications();
    }

    /**
     * Searches for a patient by name.
     */
    private void searchPatient() {
        System.out.print("Enter Patient Name to search: ");
        String name = scanner.nextLine();
        trackingSystem.searchPatientByName(name);
    }

    /**
     * Searches for a doctor by name.
     */
    private void searchDoctor() {
        System.out.print("Enter Doctor Name to search: ");
        String name = scanner.nextLine();
        trackingSystem.searchDoctorByName(name);
    }

    /**
     * Searches for a medication by name.
     */
    private void searchMedication() {
        System.out.print("Enter Medication Name to search: ");
        String name = scanner.nextLine();
        trackingSystem.searchMedicationByName(name);
    }
}
