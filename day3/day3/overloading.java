package day3;

  class overloading {
	
	    
	    
	    public int sum(int a, int b) {
	        return a + b;
	    }

	  
	    public double sum(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        overloading ol = new overloading();

	        
	        int intResult = ol.sum(10, 20);
	        System.out.println("Sum of integers: " + intResult);

	        
	        double doubleResult = ol.sum(10.5, 20.7);
	        System.out.println("Sum of doubles: " + doubleResult);
	    }
	}



