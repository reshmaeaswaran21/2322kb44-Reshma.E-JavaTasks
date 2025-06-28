package day3;



	import java.util.*;

	public class Library {
	    static ArrayList<String> books = new ArrayList<>();

	    public static void addBook(String title) {
	        books.add(title);
	        System.out.println("Book added: " + title);
	    }

	    public static void removeBook(String title) {
	        if (books.remove(title)) {
	            System.out.println("Book removed: " + title);
	        } else {
	            System.out.println("Book not found.");
	        }
	    }

	    public static void issueBook(String title) {
	        if (books.contains(title)) {
	            books.remove(title);
	            System.out.println("Book issued: " + title);
	        } else {
	            System.out.println("Book not available.");
	        }
	    }

	    public static void main(String[] args) {
	        addBook("Java");
	        addBook("Python");
	        issueBook("Java");
	        removeBook("Python");
	    }
	}


