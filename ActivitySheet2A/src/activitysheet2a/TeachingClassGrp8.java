package activitysheet2a;

public class TeachingClassGrp8 extends EmployeeClassGrp8 {
    private int hours;
    private int days;
    private EmployeeClassGrp8 emp = new EmployeeClassGrp8();
    
    public double getHours() {
        System.out.print("\nEnter number of hours worked in a month: ");
        hours = scan.nextInt();
        days /= 8;
        return emp.computeSalary(days);
    }
}
