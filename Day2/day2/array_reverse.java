package day2;
import java.util.Scanner;
public class array_reverse {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the elements:");
	 
	 int n = sc.nextInt();
	 int [] arr = new int[n];
	 
	 System.out.println("Enter the no:");
	 for(int i=0;i<n;i++)
	 {
		arr[i] = sc.nextInt(); 
	 }
	  System.out.println("Reversed Array:");
	  for(int i = n-1 ;i>0;i--) 
	  {
		  System.out.println(arr[i]+ " ");
	  }
	
	
}
}
