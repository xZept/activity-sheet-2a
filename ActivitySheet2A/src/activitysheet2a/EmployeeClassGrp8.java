package activitysheet2a;

public class EmployeeClassGrp8 extends MemberClassGrp8 {
    
    private int days;
    
    // Compute the monthly salary based number of days worked
    public double computeSalary() {
        System.out.print("\n" + "Enter number of days worked in a month: ");
        days = scan.nextInt();
        return days * 345.50;
    }
}
