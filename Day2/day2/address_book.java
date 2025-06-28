package day2;
import java.util.Scanner;
public class address_book {
	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3],phone = new String[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Name:"); 
			name[i]=sc.nextLine();
			
			System.out.println("Phone:"); 
			name[i]=sc.nextLine();
		}
			System.out.println("\n Address:");
			for(int i=0;i<3;i++)
			System.out.println(name[i]+ "_" + phone[i]);
		}
		
		
	}


