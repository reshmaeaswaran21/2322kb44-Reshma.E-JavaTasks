package day2;
import java.util.Scanner;
public class vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str =sc.nextLine().toLowerCase();
		
		int vowels =0, constants = 0;
		for(char ch:str.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(ch)!=-1) 
				{
					vowels++;
				}
				else 
				{	
						constants++;
				}
					
				
				System.out.println("Vowels:"+vowels);
				System.out.println("Constants:"+constants);
			}
				
		}
	}
	

}
