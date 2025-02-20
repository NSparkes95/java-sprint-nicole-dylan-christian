package medicationtracking;

import java.util.Scanner;

// EmptyMenu class provides the main menu interface for the medication tracking system
public class EmptyMenu {
    // Creating an instance of MedicationTrackingSystem to manage the entities
    private static MedicationTrackingSystem system = new MedicationTrackingSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Displaying the main menu and handling user input
        while (true) {
            System.out.println("\n===== Medication Tracking System =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Delete Patient");
            System.out.println("3. Add Doctor");
            System.out.println("4. Delete Doctor");
            System.out.println("5. Add Medication");
            System.out.println("6. Delete Medication");
            System.out.println("7. Display All Patients");
            System.out.println("8. Display All Doctors");
            System.out.println("9. Display All Medications");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            // Getting the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            // Handling the user's choice
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
                    system.displayAllPatients();
                    break;
                case 8:
                    system.displayAllDoctors();
                    break;
                case 9:
                    system.displayAllMedications();
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to add a new patient
    private static void addPatient() {
        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter Patient Phone Number: ");
        String phoneNumber = scanner.nextLine();

        // Creating a new Patient object and adding it to the system
        Patient patient = new Patient(id, name, age, phoneNumber);
        system.addPatient(patient);
    }

    // Method to delete a patient by ID
    private static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        String id = scanner.nextLine();
        system.deletePatient(id);
    }

    // Method to add a new doctor
    private static void addDoctor() {
        System.out.print("Enter Doctor ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Doctor Specialization: ");
        String specialization = scanner.nextLine();

        // Creating a new Doctor object and adding it to the system
        Doctor doctor = new Doctor(id, name, specialization);
        system.addDoctor(doctor);
    }

    // Method to delete a doctor by ID
    private static void deleteDoctor() {
        System.out.print("Enter Doctor ID to delete: ");
        String id = scanner.nextLine();
        system.deleteDoctor(id);
    }

    // Method to add a new medication
    private static void addMedication() {
        System.out.print("Enter Medication ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Medication Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Dosage (in mg): ");
        int dosage = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.print("Enter Quantity in Stock: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Creating a new Medication object and adding it to the system
        Medication medication = new Medication(id, name, dosage, quantity);
        system.addMedication(medication);
    }

    // Method to delete a medication by ID
    private static void deleteMedication() {
        System.out.print("Enter Medication ID to delete: ");
        String id = scanner.nextLine();
        system.deleteMedication(id);
    }
}
