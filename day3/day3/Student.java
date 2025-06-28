package day3;


	
	class Student {
	   
	    int rollNo;
	    String name;
	    int[] marks = new int[3]; 
	    int total;
	    double average;

	    
	    public Student(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	    }

	   
	    public void assignMarks(int m1, int m2, int m3) {
	        marks[0] = m1;
	        marks[1] = m2;
	        marks[2] = m3;
	        calculateResult();
	    }

	    
	    private void calculateResult() {
	        total = marks[0] + marks[1] + marks[2];
	        average = total / 3.0;
	    }

	    
	    public void displayResult() {
	        System.out.println("Student Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average Marks: " + average);
	    }

	    
	    public static void main(String[] args) {
	        Student s1 = new Student(1, "Reshma");
	        s1.assignMarks(85, 90, 80);
	        s1.displayResult();
	    }
	}



