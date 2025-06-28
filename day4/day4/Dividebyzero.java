package day4;

public class Dividebyzero {



    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            result = a / b; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

