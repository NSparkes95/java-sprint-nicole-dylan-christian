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
            System.out.println("3. View All Patients");
            System.out.println("4. Search Patient by Name");
            System.out.println("5. Edit Patient");
            System.out.println("6. Add Doctor");
            System.out.println("7. Delete Doctor");
            System.out.println("8. View All Doctors");
            System.out.println("9. Search Doctor by Name");
            System.out.println("10. Edit Doctor");
            System.out.println("11. Add Medication");
            System.out.println("12. Delete Medication");
            System.out.println("13. View All Medications");
            System.out.println("14. Search Medication by Name");
            System.out.println("15. Edit Medication");
            System.out.println("16. Add Prescription");
            System.out.println("17. Delete Prescription");
            System.out.println("18. View All Prescriptions");
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
                    viewAllPatients();
                    break;
                case 4:
                    searchPatient();
                    break;
                case 5:
                    editPatient();
                    break;
                case 6:
                    addDoctor();
                    break;
                case 7:
                    deleteDoctor();
                    break;
                case 8:
                    viewAllDoctors();
                    break;
                case 9:
                    searchDoctor();
                    break;
                case 10:
                    editDoctor();
                    break;
                case 11:
                    addMedication();
                    break;
                case 12:
                    deleteMedication();
                    break;
                case 13:
                    viewAllMedications();
                    break;
                case 14:
                    searchMedication();
                    break;
                case 15:
                    editMedication();
                    break;
                case 16:
                    addPrescription();
                    break;
                case 17:
                    deletePrescription();
                    break;
                case 18:
                    viewAllPrescriptions();
                    break;
                case 0:
                    System.out.println("Exiting Medication Tracking System...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
            
        // Closing the while loop here
        } while (choice != 0);

    }

    // ============================================================
    // === Patient Menu Methods ===
    // ============================================================

    private void addPatient() {
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Patient Phone Number: ");
        String phoneNumber = scanner.nextLine();

        Patient patient = new Patient(id, name, age, phoneNumber);
        trackingSystem.addPatient(patient);
    }

    private void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        String id = scanner.nextLine();
        trackingSystem.deletePatient(id);
    }

    private void viewAllPatients() {
        trackingSystem.displayAllPatients();
    }

    private void searchPatient() {
        System.out.print("Enter Patient Name to search: ");
        String name = scanner.nextLine();
        trackingSystem.searchPatientByName(name);
    }

    private void editPatient() {
        System.out.print("Enter Patient ID to edit: ");
        String patientId = scanner.nextLine();
        System.out.print("Enter New Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter New Age: ");
        int newAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter New Phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        trackingSystem.editPatient(patientId, newName, newAge, newPhoneNumber);
    }

    // ============================================================
    // === Doctor Menu Methods ===
    // ============================================================

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

    private void deleteDoctor() {
        System.out.print("Enter Doctor ID to delete: ");
        String id = scanner.nextLine();
        trackingSystem.deleteDoctor(id);
    }

    private void viewAllDoctors() {
        trackingSystem.displayAllDoctors();
    }

    private void searchDoctor() {
        System.out.print("Enter Doctor Name to search: ");
        String name = scanner.nextLine();
        trackingSystem.searchDoctorByName(name);
    }

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

    private void addMedication() {
        System.out.print("Enter Medication ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Medication Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Dosage (in mg): ");
        int dosage = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Quantity in Stock: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        Medication medication = new Medication(id, name, dosage, quantity);
        trackingSystem.addMedication(medication);
    }

    private void deleteMedication() {
        System.out.print("Enter Medication ID to delete: ");
        String id = scanner.nextLine();
        trackingSystem.deleteMedication(id);
    }

    private void viewAllMedications() {
        trackingSystem.displayAllMedications();
    }

    private void searchMedication() {
        System.out.print("Enter Medication Name to search: ");
        String name = scanner.nextLine();
        trackingSystem.searchMedicationByName(name);
    }

    private void editMedication() {
        System.out.print("Enter Medication ID to edit: ");
        String medicationId = scanner.nextLine();
        System.out.print("Enter New Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter New Dosage (in mg): ");
        int newDosage = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter New Quantity: ");
        int newQuantity = Integer.parseInt(scanner.nextLine());
        trackingSystem.editMedication(medicationId, newName, newDosage, newQuantity);
    }

    // ============================================================
    // === Prescription Menu Methods ===
    // ============================================================

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

    private void deletePrescription() {
        System.out.print("Enter Prescription ID to delete: ");
        String prescriptionId = scanner.nextLine();
        trackingSystem.deletePrescription(prescriptionId);
        System.out.println("Prescription deleted successfully!");
    }

    private void viewAllPrescriptions() {
        trackingSystem.displayAllPrescriptions();
    }
}
