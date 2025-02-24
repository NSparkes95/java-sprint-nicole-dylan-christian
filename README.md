Pharmacy Management System

A Java-based console application for managing patients, doctors, prescriptions, and medications in a pharmacy.

📌 Project Overview

The Pharmacy Management System is a console-based application that allows users to manage patients, doctors, medications, and prescriptions efficiently.
This system is built using Object-Oriented Programming (OOP) principles and includes:

Adding, editing, and deleting patients, doctors, and medications.
Assigning patients to doctors.
Managing prescriptions for patients.
Generating reports on system-wide data, prescriptions, and expired medications.
Restocking medications automatically.
💡 Note: Requires Java Development Kit (JDK) installed to compile and run.

🛠 Installation Guide

Prerequisites:
Java Development Kit (JDK 17 or later)
A terminal (Command Prompt, Bash, or PowerShell)
Git (for repository access)

Step 1: Clone the Repository
Run the following command to clone the repository from GitHub:
git clone https://github.com/NSparkes95/java-sprint-nicole-dylan-christian.git
cd java-sprint-nicole-dylan-christian

Step 2: Compile the Program
Compile all Java files inside the src/main/java/medicationtracking/ directory and store the compiled files in the bin/ directory:
javac -d bin src/main/java/medicationtracking/*.java

Step 3: Run the Program
Execute the Menu class to start the system:
java -cp bin medicationtracking.Menu


💻 How to Use the System:
After running the program, a menu will appear. Navigate using numeric inputs to select options.

🏥 Main Menu Options:
=== Medication Tracking System ===
1. Patients  
2. Doctors  
3. Medications  
4. Prescriptions  
5. Generate Reports  
0. Exit  
Enter your choice:  
🔹 Each menu option leads to a sub-menu where you can manage that category.

🧪 How to Test the System

The Pharmacy Management System allows users to interact with different features through a menu-based console interface. Below are the steps to test various functionalities.

🔹 Step 1: Running the Program
Before testing, compile and run the program as described above.

🔹 Step 2: Testing Core Functionalities
📌 Adding a New Patient
1️⃣ Select Option 1 (Patients) from the main menu.
2️⃣ Choose Option 1 (Add Patient).
3️⃣ Enter patient details (ID, Name, Age, Phone Number).
4️⃣ Confirm by selecting View All Patients.

Expected Output:

Patient added successfully!
📌 Adding a New Doctor
1️⃣ Select Option 2 (Doctors) from the main menu.
2️⃣ Choose Option 1 (Add Doctor).
3️⃣ Enter doctor details (ID, Name, Specialization).
4️⃣ Confirm by selecting View All Doctors.

Expected Output:

Doctor added successfully!
📌 Assigning a Patient to a Doctor
1️⃣ Select Option 2 (Doctors) from the main menu.
2️⃣ Choose Option 6 (Assign Patient to Doctor).
3️⃣ Enter the Doctor ID and Patient ID.
4️⃣ Select View All Doctors to confirm the assigned patient list.

Expected Output:

Patient assigned to doctor successfully!
📌 Adding a New Prescription
1️⃣ Select Option 4 (Prescriptions) from the main menu.
2️⃣ Choose Option 1 (Add Prescription).
3️⃣ Enter required details:

Prescription ID
Patient ID
Doctor ID
Medication ID
Quantity
Instructions
4️⃣ Confirm by selecting View All Prescriptions.
Expected Output:

Prescription added successfully!
📌 Generating Reports
➡️ System-Wide Report:
1️⃣ Select Option 5 (Generate Reports).
2️⃣ Choose Option 1 (System Report).

Expected Output:

=== System Report ===
Total Patients: X  
Total Doctors: X  
Total Medications: X  
Total Prescriptions: X  
➡️ Prescription Report:
1️⃣ Select Option 5 (Generate Reports).
2️⃣ Choose Option 2 (Prescription Report).
3️⃣ Enter a Doctor ID or Patient ID to view their prescriptions.

📌 Checking for Expired Medications
1️⃣ Select Option 3 (Medications) from the main menu.
2️⃣ Choose Option 5 (Check Expired Medications).

Expected Output:
If expired medications exist:
Expired Medications Found:
Medication ID: 123 | Name: Painkiller | Expiry Date: 2023-01-15

If none are found:
No expired medications found.

📌 Restocking Medications
1️⃣ Select Option 3 (Medications) from the main menu.
2️⃣ Choose Option 6 (Restock Medications).
3️⃣ Medications will be restocked automatically.

Expected Output:

Restocked Paracetamol by 10 units. New stock: 50
Restocked Ibuprofen by 7 units. New stock: 30

📂 Project Folder Structure

PharmacyManagementSystem/
│── src/main/java/medicationtracking/  
│   ├── Doctor.java  
│   ├── Medication.java  
│   ├── MedicationTrackingSystem.java  
│   ├── Menu.java  
│   ├── Patient.java  
│   ├── Prescription.java  
│── bin/ (Compiled files)  
│── README.md (This file)  
│── .gitignore  
│── LICENSE  
📌 GitHub Repository Guide

This project follows GitHub best practices, including:
✔️ Pull Requests (PRs) for feature development.
✔️ Commit history for tracking changes.
✔️ Issues & Discussions for tracking bugs and improvements.

📌 Contributors & Acknowledgments

Nicole Sparkes, Christian Rose and Dylan Finlay.
Thank you for using the Pharmacy Management System! 🚀

