package day5;

	import java.util.*;

	public class courseenrollment{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        ArrayList<String> students = new ArrayList<>();
	        HashMap<String, ArrayList<String>> enrollments = new HashMap<>();

	        while (true) {
	            System.out.println("\n--- Student Course Enrollment System ---");
	            System.out.println("1. Add Student & Courses");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Display All Enrollments");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();
	            sc.nextLine();  // consume newline

	            switch (choice) {
	                case 1 -> {
	                    System.out.print("Enter student name: ");
	                    String name = sc.nextLine();
	                    students.add(name);

	                    ArrayList<String> courses = new ArrayList<>();
	                    System.out.print("How many courses for " + name + "? ");
	                    int courseCount = sc.nextInt();
	                    sc.nextLine();  // consume newline

	                    for (int i = 1; i <= courseCount; i++) {
	                        System.out.print("Enter course " + i + ": ");
	                        String course = sc.nextLine();
	                        courses.add(course);
	                    }

	                    enrollments.put(name, courses);
	                    System.out.println("Student and courses added!");
	                }

	                case 2 -> {
	                    System.out.print("Enter student name to remove: ");
	                    String nameToRemove = sc.nextLine();
	                    if (students.remove(nameToRemove)) {
	                        enrollments.remove(nameToRemove);
	                        System.out.println("Student removed.");
	                    } else {
	                        System.out.println("Student not found.");
	                    }
	                }

	                case 3 -> {
	                    System.out.println("\n--- Enrolled Students & Courses ---");

	                    Iterator<String> studentItr = students.iterator();
	                    while (studentItr.hasNext()) {
	                        String student = studentItr.next();
	                        System.out.println("Student: " + student);

	                        ArrayList<String> courses = enrollments.get(student);
	                        if (courses != null) {
	                            Iterator<String> courseItr = courses.iterator();
	                            while (courseItr.hasNext()) {
	                                System.out.println("  - " + courseItr.next());
	                            }
	                        }
	                    }
	                }

	                case 4 -> {
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                }

	                default -> System.out.println("Invalid option.");
	            }
	        }
	    }
	}

	