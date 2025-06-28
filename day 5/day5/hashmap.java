package day5;

    import java.util.HashMap;
	import java.util.Scanner;

	public class hashmap {
	    public static void main(String[] args) {
	        HashMap<String, Integer> studentMarks = new HashMap<>();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("How many students? ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        // Add student name and marks
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter student name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter marks for " + name + ": ");
	            int marks = sc.nextInt();
	            sc.nextLine(); // consume newline

	            studentMarks.put(name, marks);
	        }

	        // Display all students and marks
	        System.out.println("\n--- Student Marks ---");
	        int total = 0;
	        for (String name : studentMarks.keySet()) {
	            int marks = studentMarks.get(name);
	            System.out.println(name + " → " + marks);
	            total += marks;
	        }

	        // Calculate and display average
	        double average = (n > 0) ? (double) total / n : 0;
	        System.out.println("\nClass Average: " + average);

	        sc.close();
	    }
	}



