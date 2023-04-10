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
        
        int value; 
        // Check member type
        switch (memType.toLowerCase()) {
            case "employee":
                EmployeeClassGrp8 emp = new EmployeeClassGrp8();
                System.out.print("Enter number of days worked in a month: ");
                value = scan.nextInt();
                System.out.println(emp.computeSalary(value));
            case "teaching":
                TeachingClassGrp8 teach = new TeachingClassGrp8();
                System.out.println("Enter number of hours worked in a month: ");
                value = scan.nextInt();
                System.out.println(teach.getHours(value));
            case "non-teaching":
                NonteachingClassGrp8 nonTeach = new NonteachingClassGrp8();
                System.out.print("Enter number of days worked in a month: ");
                value = scan.nextInt();
                System.out.println(nonTeach.getDays(value));
            case "student":
                StudentClassGrp8 student = new StudentClassGrp8();
                System.out.print("Enter number of units enrolled: ");
                value = scan.nextInt();
                System.out.println(student.getUnits(value));
            default:
                
        }
    }
}
