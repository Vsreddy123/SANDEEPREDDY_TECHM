package pack;
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double sal;
    int yearsWorked; // Added years worked

    // Constructor
    public Employee(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }


    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + sal);
        System.out.println("Years Worked: " + yearsWorked);
    }

    public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }

    public String getLoanEligibility() {
        if (yearsWorked <= 5) {
            return "Not eligible for a loan (less than 5 years of service).";
        }

        double annualSalary = sal * 12; // Assuming 'sal' is monthly salary

        if (annualSalary >= 600000 && annualSalary < 1000000) {
            return "Eligible for a 2 Lakhs loan.";
        } else if (annualSalary >= 1000000 && annualSalary < 1500000) {
            return "Eligible for a 5 Lakhs loan.";
        } else if (annualSalary >= 1500000) {
            return "Eligible for a 7 Lakhs loan.";
        } else {
            return "Not eligible for a loan (salary does not meet criteria).";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double sal = scanner.nextDouble();

        System.out.print("Enter Years Worked: ");
        int yearsWorked = scanner.nextInt();


        Employee employee = new Employee(empId, empName, sal, yearsWorked);

        employee.getEmployeeDetails();
        System.out.println(employee.getLoanEligibility());

        scanner.close();
    }
}