package activitysheet2a;

import java.util.Scanner;

public class InheritanceActivityMainGrp8 {

    static Scanner scan = new Scanner(System.in);
    static String name, memType;
    double computedSalary;
    
    // Constructor for Greeting message
    public InheritanceActivityMainGrp8() {
        System.out.println("Welcome to BPSU Profile!");
        System.out.println("Hello, " + name);
    }
    
    public void displayEmpRemarks() {
        System.out.println("Employee Type: " + memType);
        System.out.println("Computed Salary: " + computedSalary);
    }

    public static void main(String[] args) {
        MemberClassGrp8 obj = new MemberClassGrp8();
        name = obj.getName();
        memType = obj.getMemType();
        System.out.print("\n"); // Whitespace
        InheritanceActivityMainGrp8 greetUser = new InheritanceActivityMainGrp8();
        
        // Check member type
        switch (memType.toLowerCase()) {
            case "employee":
                EmployeeClassGrp8 emp = new EmployeeClassGrp8();
                System.out.println(emp.computeSalary());
            case "teaching":
                
            case "non-teaching":
                
            case "student":
                
            default:
                
        }
    }
}
