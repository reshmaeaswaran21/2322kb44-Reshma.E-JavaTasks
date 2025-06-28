package day1;

import java.util.Scanner;
public class Student_marks {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the mark:");
		 int mark = sc.nextInt();
		 
		 
		 
		 if(mark>=90) 
		 {
			 System.out.println("The grade is A");
		 }
		 
		 else if(mark>=80)
		 {
			 System.out.println("The grade is B");
		 }
		 else if(mark>=70)
		 {
			 System.out.println("The grade is C");
		 }
		 else {
			 System.out.println("The grade is D");
		 }
		 
		 
	}

}
