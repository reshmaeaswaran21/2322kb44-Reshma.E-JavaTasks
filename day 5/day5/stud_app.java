package day5;

    import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.*;

	public class stud_app {
	    static ArrayList<String> studentNames = new ArrayList<>();
	    static HashMap<Integer, ArrayList<String>> studentCourses = new HashMap<>();

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n--- Mini Student Management App ---");
	            System.out.println("1. Add Student & Courses");
	            System.out.println("2. Search Student by ID");
	            System.out.println("3. Delete Student");
	            System.out.println("4. Save All Data to File");
	            System.out.println("5. Exit");
	            System.out.print("Choose option: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1 -> addStudent(sc);
	                case 2 -> searchStudent(sc);
	                case 3 -> deleteStudent(sc);
	                case 4 -> saveToFile();
	                case 5 -> {
	                    System.out.println("Exiting app.");
	                    sc.close();
	                    return;
	                }
	                default -> System.out.println("Invalid option!");
	            }
	        }
	    }

	    static void addStudent(Scanner sc) {
	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        if (studentCourses.containsKey(id)) {
	            System.out.println("ID already exists.");
	            return;
	        }

	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();
	        studentNames.add(name);

	        ArrayList<String> courses = new ArrayList<>();
	        System.out.print("How many courses? ");
	        int count = sc.nextInt();
	        sc.nextLine();

	        for (int i = 1; i <= count; i++) {
	            System.out.print("Enter course " + i + ": ");
	            courses.add(sc.nextLine());
	        }

	        studentCourses.put(id, courses);
	        System.out.println("Student added.");
	    }

	    static void searchStudent(Scanner sc) {
	        System.out.print("Enter Student ID to search: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        if (studentCourses.containsKey(id)) {
	            System.out.println("Courses enrolled:");
	            for (String course : studentCourses.get(id)) {
	                System.out.println(" - " + course);
	            }
	        } else {
	            System.out.println("Student ID not found.");
	        }
	    }

	    static void deleteStudent(Scanner sc) {
	        System.out.print("Enter Student ID to delete: ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        if (studentCourses.containsKey(id)) {
	            studentCourses.remove(id);
	            System.out.println("Student removed.");
	        } else {
	            System.out.println("Student ID not found.");
	        }
	    }

	    static void saveToFile() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_data.txt"))) {
	            for (Map.Entry<Integer, ArrayList<String>> entry : studentCourses.entrySet()) {
	                writer.write("ID: " + entry.getKey() + " → Courses: " + entry.getValue());
	                writer.newLine();
	            }
	            System.out.println("Data saved to student_data.txt");
	        } catch (IOException e) {
	            System.out.println("Error writing to file.");
	        }
	    }
	}



