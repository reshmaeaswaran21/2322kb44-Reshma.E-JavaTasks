package day1;
import java.util.Scanner;
public class Calculator {
	public static int calc(int a,int b, char operator) 
	{
		int result = 0;
		switch(operator) {
		    case '+':
			result = a+b;
			System.out.println("The result is:"+result);
			break;
			
		    case '-':
				result = a-b;
				System.out.println("The result is:"+result);
				break;
				
				
		    case '*':
				result = a*b;
				System.out.println("The result is:"+result);
				break;
				
		    case '/':
		    	if(operator !=0) 
		    	{
				result = a/b;
				System.out.println("The result is:"+result);
		    	} 
		    	else {
		    		System.out.println("Error");
		    	}
				break;	
				
			default:
				System.out.println("Invalid Option");
		
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no:");
		int num1 = sc.nextInt();
		System.out.println("Enter the second no:");
		int num2 =sc.nextInt();
		System.out.println("Enter the choice:");
		System.out.println("+,-,*,/");
		
		char op = sc.next().charAt(0);
		int result = calc(num1,num2,op);
	}

}
