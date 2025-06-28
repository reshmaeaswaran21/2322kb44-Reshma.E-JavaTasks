package day5;

   import java.util.HashSet;
   import java.util.Scanner;

	public class hashset {
	    public static void main(String[] args) {
	        HashSet<String> emailSet = new HashSet<>();
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter 5 email addresses (duplicates will be ignored):");

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Email " + i + ": ");
	            String email = sc.nextLine();
	            emailSet.add(email); // HashSet automatically avoids duplicates
	        }

	        // Display unique email addresses
	        System.out.println("\n--- Unique Email Addresses ---");
	        for (String email : emailSet) {
	            System.out.println(email);
	        }

	        sc.close();
	    }
	}




