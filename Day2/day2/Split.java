package day2;

public class Split {
public static void main(String[] args) {
	String s = "Java is a language";
	for (String w : s.split(" "))
		System.out.println(w);
}
}
