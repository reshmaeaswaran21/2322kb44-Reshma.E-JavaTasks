package day4;


	import java.io.*;

	public class Resultprocessor {
	    public static void main(String[] args) {
	        String inputFile = "marks.txt";
	        String outputFile = "results.txt";

	        try (
	            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
	        ) {
	            String line;

	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split(" ");
	                String name = parts[0];
	                int mark1 = Integer.parseInt(parts[1]);
	                int mark2 = Integer.parseInt(parts[2]);
	                int mark3 = Integer.parseInt(parts[3]);

	                int total = mark1 + mark2 + mark3;
	                double average = total / 3.0;

	                String resultLine = name + " Total: " + total + " Average: " + String.format("%.2f", average);
	                writer.write(resultLine);
	                writer.newLine();
	            }

	            System.out.println("Results written to " + outputFile);
	        } catch (IOException | NumberFormatException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}



