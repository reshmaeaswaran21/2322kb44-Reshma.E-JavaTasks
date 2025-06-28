package day4;

import java.io.*;
import java.util.*;

public class Emp_record {
	
	    static final String FILE_NAME = "employees.txt";

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n--- Employee Record System ---");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View All Employees");
	            System.out.println("3. Update Salary");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();
	            sc.nextLine();  // clear newline

	            switch (choice) {
	                case 1 -> addEmployee(sc);
	                case 2 -> viewEmployees();
	                case 3 -> updateEmployee(sc);
	                case 4 -> deleteEmployee(sc);
	                case 5 -> {
	                    System.out.println("Exiting...");
	                    return;
	                }
	                default -> System.out.println("Invalid option!");
	            }
	        }
	    }

	    static void addEmployee(Scanner sc) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
	            System.out.print("Enter ID: ");
	            String id = sc.nextLine();
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter Salary: ");
	            String salary = sc.nextLine();

	            writer.write(id + " " + name + " " + salary);
	            writer.newLine();
	            System.out.println("Employee added.");
	        } catch (IOException e) {
	            System.out.println("Error writing to file.");
	        }
	    }

	    static void viewEmployees() {
	        try (Scanner fileScanner = new Scanner(new File(FILE_NAME))) {
	            System.out.println("\n--- Employee List ---");
	            while (fileScanner.hasNextLine()) {
	                String line = fileScanner.nextLine();
	                System.out.println(line);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("No employee records found.");
	        }
	    }

	    static void updateEmployee(Scanner sc) {
	        System.out.print("Enter ID to update: ");
	        String targetId = sc.nextLine();

	        File inputFile = new File(FILE_NAME);
	        File tempFile = new File("temp.txt");

	        boolean updated = false;

	        try (
	            Scanner reader = new Scanner(inputFile);
	            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
	        ) {
	            while (reader.hasNextLine()) {
	                String line = reader.nextLine();
	                String[] parts = line.split(" ");
	                if (parts[0].equals(targetId)) {
	                    System.out.print("Enter new salary: ");
	                    String newSalary = sc.nextLine();
	                    writer.write(parts[0] + " " + parts[1] + " " + newSalary);
	                    updated = true;
	                } else {
	                    writer.write(line);
	                }
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            System.out.println("Error during update.");
	            return;
	        }

	        if (updated) {
	            inputFile.delete();
	            tempFile.renameTo(inputFile);
	            System.out.println("Employee salary updated.");
	        } else {
	            tempFile.delete();
	            System.out.println("Employee ID not found.");
	        }
	    }

	    static void deleteEmployee(Scanner sc) {
	        System.out.print("Enter ID to delete: ");
	        String targetId = sc.nextLine();

	        File inputFile = new File(FILE_NAME);
	        File tempFile = new File("temp.txt");

	        boolean deleted = false;

	        try (
	            Scanner reader = new Scanner(inputFile);
	            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))
	        ) {
	            while (reader.hasNextLine()) {
	                String line = reader.nextLine();
	                String[] parts = line.split(" ");
	                if (!parts[0].equals(targetId)) {
	                    writer.write(line);
	                    writer.newLine();
	                } else {
	                    deleted = true;
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error during deletion.");
	            return;
	        }

	        if (deleted) {
	            inputFile.delete();
	            tempFile.renameTo(inputFile);
	            System.out.println("Employee deleted.");
	        } else {
	            tempFile.delete();
	            System.out.println("Employee ID not found.");
	        }
	    }
	}

	


