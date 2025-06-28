package day3;

class Employee {
    
    int empId;
    String name;
    double basicSalary;
    double hra;
    double da;
    double grossSalary;

    
    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    
    public void calculateSalary() {
        hra = 0.20 * basicSalary;  
        da = 0.10 * basicSalary;   
        grossSalary = basicSalary + hra + da;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Reshma", 30000);
        emp.calculateSalary();
        emp.displayDetails();
    }
}
