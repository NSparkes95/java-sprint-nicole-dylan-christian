package medicationtracking;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
            System.out.println("Welcome to the Medication Tracking System. Please select a number below:");
            System.out.println("1. Patients");
            System.out.println("2. Doctors");
            System.out.println("3. Medications");
            System.out.println("4. Prescriptions");
            System.out.println("5. Reports");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (Enter Number): ");
            
            choice = Integer.parseInt(scanner.nextLine());
    
            switch (choice) {
                case 1:
                    showPatientMenu();
                    break;
                case 2: // Doctor Menu
                    showDoctorMenu();
                    break;
                case 3: // Medication Menu
                    showMedicationMenu();
                    break;
                case 4: // Prescription Menu
                    showPrescriptionMenu();
                    break;
                case 5: // ✅ System-Wide Report option
                    showReportMenu();
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
            System.out.print("Enter your choice (Enter Number): ");
            
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
            System.out.println("6. Assign Patient to Doctor");
            System.out.println("7. List Prescriptions by Doctor");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice (Enter Number): ");
            
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
                case 6: // Assign Patient to Doctor 
                    assignPatientToDoctor();
                    break;
                case 7: // List Prescriptions by Doctor 
                    listPrescriptionsByDoctor();
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
            System.out.println("3. Restock Medications");
            System.out.println("4. View All Medications");
            System.out.println("5. Search Medication by Name");
            System.out.println("6. Edit Medication");
            System.out.println("7. Check Expired Medications");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice (Enter Number): ");
            
            choice = Integer.parseInt(scanner.nextLine());
    
            switch (choice) {
                case 1:
                    addMedication();
                    break;
                case 2:
                    deleteMedication();
                    break;
                case 3:
                    trackingSystem.restockMedications();
                    break;
                case 4:
                    viewAllMedications();
                    break;
                case 5:
                    searchMedication();
                    break;
                case 6:
                    editMedication();
                    break;
                case 7:
                    trackingSystem.checkExpiredMedications();
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
            System.out.println("4. View Prescriptions by Patient");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice (Enter Number): ");
            
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
                case 4:
                    viewPrescriptionsByPatient();
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

    System.out.print("Enter Doctor Phone Number: "); // ✅ Added missing phone number input
    String phoneNumber = scanner.nextLine();

    System.out.print("Enter Doctor Specialization: ");
    String specialization = scanner.nextLine();

    // ✅ Updated to use the correct constructor
    Doctor doctor = new Doctor(id, name, phoneNumber, specialization);

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

    private void assignPatientToDoctor() {
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();

        System.out.print("Enter Patient ID: ");
        String patientId = scanner.nextLine();

        boolean success = trackingSystem.assignPatientToDoctor(doctorId, patientId);

        if (success) {
            System.out.println("Patient assigned to doctor successfully!");
        } else {
            System.out.println("Failed to assign patient. Check IDs and try again.");
        }
    }

    /** 
     * Lists all prescriptions by a doctor.
     */
    private void listPrescriptionsByDoctor() {
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.nextLine();
        trackingSystem.displayPrescriptionsByDoctor(doctorId);
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
        while(true) {
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
        while(true) {
            System.out.print("Enter Quantity: ");
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
        // Ask for the expiry date
        LocalDate expiryDate = null;
        while (expiryDate == null) {
            System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
            String date = scanner.nextLine();
            try {
                expiryDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter a valid date in the format yyyy-mm-dd.");
            }
        }
        Medication medication = new Medication(id, name, dosage, quantity, expiryDate);
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
        System.out.println("\n=== All Prescriptions ===");

        if (trackingSystem.getPrescriptions().isEmpty()) {
            System.out.println("No prescriptions found.");
            return;
        }
    
        for (Prescription p : trackingSystem.getPrescriptions()) {
            System.out.println("\nPrescription ID: " + p.getPrescriptionId());
            System.out.println("Patient ID: " + p.getPatientId());
            System.out.println("Doctor ID: " + p.getDoctorId());
            System.out.println("Medication ID: " + p.getMedicationId());
            System.out.println("Quantity: " + p.getQuantity());
            System.out.println("Instructions: " + p.getInstructions());
            System.out.println("--------------------------------");
        }
    }
    /**
    * Prompts the user to enter a patient ID and displays their prescriptions.
    */
    private void viewPrescriptionsByPatient() {
        System.out.print("\nEnter Patient ID to view prescriptions: ");
        String patientId = scanner.nextLine();
        trackingSystem.displayPrescriptionsByDoctor(patientId);
    }

    /**
    * Displays the report menu and allows the user to choose a report type.
    * The user can generate a system-wide report or a prescription report.
    */
    private void showReportMenu() {
        int choice;

        do {
            System.out.println("\n=== Report Menu ===");
            System.out.println("1. System-Wide Report");
            System.out.println("2. Prescription Report");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice (Enter Number): ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    trackingSystem.generateSystemReport();
                    break;
                case 2:
                    trackingSystem.generatePrescriptionReport();
                    break;
                case 0:
                    return; // Go back to the main menu
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);
    }
            

}
