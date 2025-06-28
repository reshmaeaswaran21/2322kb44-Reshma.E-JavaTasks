package day5;
 import java.util.ArrayList;
 import java.util.Iterator;
	public class array_list {

	
	    public static void main(String[] args) {
	        // Create an ArrayList of students
	        ArrayList<String> students = new ArrayList<>();

	        // Add student names
	        students.add("Reshma");
	        students.add("Priya");
	        students.add("Somu");
	        students.add("Kalam");

	        // Display students using Iterator
	        System.out.println("--- Student List ---");
	        Iterator<String> itr = students.iterator();

	        while (itr.hasNext()) {
	            String name = itr.next();
	            System.out.println(name);
	        }
	    }
	}


