package day4;


	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

	public class WriteFileExample {
	    public static void main(String[] args) {
	        String[] lines = {
	            "This is the first line.",
	            "This is the second line.",
	            "This is the third line."
	        };

	        String fileName = "output.txt";  
	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

	            for (String line : lines) {
	                writer.write(line);
	                writer.newLine();  
	            }

	            writer.close();
	            System.out.println("File written successfully.");
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }
	    }
	}



