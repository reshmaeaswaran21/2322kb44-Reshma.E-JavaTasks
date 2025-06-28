package day1;
import java.util.Scanner;

  public class SimpleInterest {
	
    public static void main(String[] args) {
     
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter principal amount:");
    	double p = sc.nextDouble();
    	System.out.println("Enter the rate of interest:");
    	double r = sc.nextDouble();
    	System.out.println("Enter the time in years:");
    	double t = sc.nextDouble();
    	
    	if(p > 0 && r > 0 && t > 0) 
    	{
    		double si = (p*r*t)/100;
    		System.out.println("Simple Interest:" +si);
    	}
    	else {
    		System.out.println("Invalid input");
    	}
	
}
}
