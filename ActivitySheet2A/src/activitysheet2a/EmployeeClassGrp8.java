package activitysheet2a;

public class EmployeeClassGrp8 extends MemberClassGrp8 {
    
    private int days;
    
    // Compute the monthly salary based number of days worked
    public double computeSalary(int days) {
        return days * 345.50;
    }
}
