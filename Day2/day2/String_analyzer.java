package day2;

public class String_analyzer {
 public static void main(String[] args) {
   String s ="Welcome to the World"	;
   String [] w=s.split(" ");
   System.out.println("Words:" +w.length);
   System.out.println("Characters:" +s.replace(" ", " ").length());
   System.out.println("Reverse:" + new StringBuilder (s).reverse());
  
}
}
