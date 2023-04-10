package activitysheet2a;

public class NonteachingClassGrp8 extends EmployeeClassGrp8 {
    
    // Accepts the number of days then calls a method to compute the salary
    public double getDays() {
        System.out.print("\nEnter number of days worked in a month: ");
        double days = scan.nextInt();
        return EmployeeClassGrp8.computeSalary(days); 
    }
}
