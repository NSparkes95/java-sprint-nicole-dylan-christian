package medicationtracking;

import java.util.Scanner;

/**
 * Menu class displays a console-based menu for the Medication Tracking System.
 * It allows users to add, delete, edit, view, and search patients, doctors, medications, and prescriptions.
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
     * @param args Command-line arguments
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

        /* Medication Tracking System Start UP Menu */
        do {
            System.out.println("\n=== Medication Tracking System ===");
            System.out.println("Welcome to the Medication Tracking System. Please make a choice below:");
            System.out.println("1. Patients");
            System.out.println("2. Doctors");
            System.out.println("3. Medications");
            System.out.println("4. Prescriptions");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(scanner.nextLine());
    
            switch (choice) {
                case 1:
                    showPatientMenu();
                    break;
                case 2:
                    showDoctorMenu();
                    break;
                case 3:
                    showMedicationMenu();
                    break;
                case 4:
                    showPrescriptionMenu();
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
     * Displays the Patient Menu and handles user input.
     */
    private void showPatientMenu() {
        int choice;
        
        do {
            System.out.println("\n=== Patient Management ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. View All Patients");
            System.out.println("4. Search Patient by Name");
            System.out.println("5. Edit Patient");
            System.out.println("0. Back to Main Menu");
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
                    viewAllPatients();
                    break;
                case 4:
                    searchPatient();
                    break;
                case 5:
                    editPatient();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
    
        } while (choice != 0);
    }

    /**
     * Displays the Doctor Menu and handles user input.
     */
    private void showDoctorMenu() {
        int choice;
    
        do {
            System.out.println("\n=== Doctor Management ===");
            System.out.println("1. Add Doctor");
            System.out.println("2. Delete Doctor");
            System.out.println("3. View All Doctors");
            System.out.println("4. Search Doctor by Name");
            System.out.println("5. Edit Doctor");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(scanner.nextLine());
    
            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    deleteDoctor();
                    break;
                case 3:
                    viewAllDoctors();
                    break;
                case 4:
                    searchDoctor();
                    break;
                case 5:
                    editDoctor();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
    
        } while (choice != 0);
    }

    /**
     * Displays the Medication Menu and handles user input.
     */
    private void showMedicationMenu() {
        int choice;
    
        do {
            System.out.println("\n=== Medication Management ===");
            System.out.println("1. Add Medication");
            System.out.println("2. Delete Medication");
            System.out.println("3. View All Medications");
            System.out.println("4. Search Medication by Name");
            System.out.println("5. Edit Medication");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(scanner.nextLine());
    
            switch (choice) {
                case 1:
                    addMedication();
                    break;
                case 2:
                    deleteMedication();
                    break;
                case 3:
                    viewAllMedications();
                    break;
                case 4:
                    searchMedication();
                    break;
                case 5:
                    editMedication();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
    
        } while (choice != 0);
    }

    /**
     * Displays the Prescription Menu and handles user input.
     */
    private void showPrescriptionMenu() {
        int choice;
    
        do {
            System.out.println("\n=== Prescription Management ===");
            System.out.println("1. Add Prescription");
            System.out.println("2. Delete Prescription");
            System.out.println("3. View All Prescriptions");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            
            choice = Integer.parseInt(scanner.nextLine());
    
            switch (choice) {
                case 1:
                    addPrescription();
                    break;
                case 2:
                    deletePrescription();
                    break;
                case 3:
                    viewAllPrescriptions();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
    
        } while (choice != 0);
    }

    // ============================================================
    // === Patient Menu Methods ===
    // ============================================================

    /**
     * Adds a new patient to the system.
     */
    private void addPatient() {
        String id, name, phoneNumber;
        int age;

        System.out.print("Enter Patient ID: ");
        id = scanner.nextLine();
        System.out.print("Enter Patient Name: ");
        name = scanner.nextLine();
        
        while (true) {
            System.out.print("Enter Patient Age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (age > 0) break;
                else System.out.println("Age must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a valid age.");
                scanner.next(); // consume the invalid input
            }
        }

        System.out.print("Enter Patient Phone Number: ");
        phoneNumber = scanner.nextLine();

        Patient patient = new Patient(id, name, age, phoneNumber);
        trackingSystem.addPatient(patient);
    }

    /**
     * Deletes a patient by ID.
     */
    private void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        String id = scanner.nextLine();
        trackingSystem.deletePatient(id);
    }

    /**
     * Displays all patients in the system.
     */
    private void viewAllPatients() {
        trackingSystem.displayAllPatients();
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
     * Edits patient details.
     */
    private void editPatient() {
        System.out.print("Enter Patient ID to edit: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter New Name: ");
        String newName = scanner.nextLine();
        
        int newAge;
        while (true) {
            System.out.print("Enter New Age: ");
            if (scanner.hasNextInt()) {
                newAge = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (newAge > 0) break;
                else System.out.println("Age must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a valid age.");
                scanner.next(); // consume the invalid input
            }
        }

        System.out.print("Enter New Phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        trackingSystem.editPatient(patientId, newName, newAge, newPhoneNumber);
    }

    // ============================================================
    // === Doctor Menu Methods ===
    // ============================================================

    /**
     * Adds a new doctor to the system.
     */
    private void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Doctor Specialization: ");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(id, name, specialization);
        trackingSystem.addDoctor(doctor);
    }

    /**
     * Deletes a doctor by ID.
     */
    private void deleteDoctor() {
        System.out.print("Enter Doctor ID to delete: ");
        String id = scanner.nextLine();
        trackingSystem.deleteDoctor(id);
    }

    /**
     * Displays all doctors in the system.
     */
    private void viewAllDoctors() {
        trackingSystem.displayAllDoctors();
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
     * Edits doctor details.
     */
    private void editDoctor() {
        System.out.print("Enter Doctor ID to edit: ");
        String doctorId = scanner.nextLine();
        System.out.print("Enter New Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter New Specialization: ");
        String newSpecialization = scanner.nextLine();
        trackingSystem.editDoctor(doctorId, newName, newSpecialization);
    }

    // ============================================================
    // === Medication Menu Methods ===
    // ============================================================

    /**
     * Adds a new medication to the system.
     */
    private void addMedication() {
        System.out.print("Enter Medication ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Medication Name: ");
        String name = scanner.nextLine();
        
        int dosage, quantity;
        while (true) {
            System.out.print("Enter Dosage (in mg): ");
            if (scanner.hasNextInt()) {
                dosage = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (dosage > 0) break;
                else System.out.println("Dosage must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a valid dosage.");
                scanner.next(); // consume the invalid input
            }
        }
        
        while (true) {
            System.out.print("Enter Quantity in Stock: ");
            if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (quantity >= 0) break;
                else System.out.println("Quantity must be greater than or equal to 0.");
            } else {
                System.out.println("Invalid input. Please enter a valid quantity.");
                scanner.next(); // consume the invalid input
            }
        }

        Medication medication = new Medication(id, name, dosage, quantity);
        trackingSystem.addMedication(medication);
    }

    /**
     * Deletes a medication by ID.
     */
    private void deleteMedication() {
        System.out.print("Enter Medication ID to delete: ");
        String id = scanner.nextLine();
        trackingSystem.deleteMedication(id);
    }

    /**
     * Displays all medications in the system.
     */
    private void viewAllMedications() {
        trackingSystem.displayAllMedications();
    }

    /**
     * Searches for a medication by name.
     */
    private void searchMedication() {
        System.out.print("Enter Medication Name to search: ");
        String name = scanner.nextLine();
        trackingSystem.searchMedicationByName(name);
    }

    /**
     * Edits medication details.
     */
    private void editMedication() {
        System.out.print("Enter Medication ID to edit: ");
        String medicationId = scanner.nextLine();
        System.out.print("Enter New Name: ");
        String newName = scanner.nextLine();
        
        int newDosage, newQuantity;
        while (true) {
            System.out.print("Enter New Dosage (in mg): ");
            if (scanner.hasNextInt()) {
                newDosage = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (newDosage > 0) break;
                else System.out.println("Dosage must be greater than 0.");
            } else {
                System.out.println("Invalid input. Please enter a valid dosage.");
                scanner.next(); // consume the invalid input
            }
        }

        while (true) {
            System.out.print("Enter New Quantity: ");
            if (scanner.hasNextInt()) {
                newQuantity = scanner.nextInt();
                scanner.nextLine(); // consume the newline character
                if (newQuantity >= 0) break;
                else System.out.println("Quantity must be greater than or equal to 0.");
            } else {
                System.out.println("Invalid input. Please enter a valid quantity.");
                scanner.next(); // consume the invalid input
            }
        }

        trackingSystem.editMedication(medicationId, newName, newDosage, newQuantity);
    }

    // ============================================================
    // === Prescription Menu Methods ===
    // ============================================================

    /**
     * Adds a new prescription to the system.
     */
    private void addPrescription() {
        System.out.print("Enter Prescription ID: ");
        String prescriptionId = scanner.nextLine();
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();
        System.out.print("Enter Medication ID: ");
        String medicationId = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Instructions: ");
        String instructions = scanner.nextLine();

        Prescription prescription = new Prescription(prescriptionId, patientId, doctorId, medicationId, quantity, instructions);
        trackingSystem.addPrescription(prescription);
        System.out.println("Prescription added successfully!");
    }

    /**
     * Deletes a prescription by ID.
     */
    private void deletePrescription() {
        System.out.print("Enter Prescription ID to delete: ");
        String prescriptionId = scanner.nextLine();
        trackingSystem.deletePrescription(prescriptionId);
        System.out.println("Prescription deleted successfully!");
    }

    /**
     * Displays all prescriptions in the system.
     */
    private void viewAllPrescriptions() {
        trackingSystem.displayAllPrescriptions();
    }
}
