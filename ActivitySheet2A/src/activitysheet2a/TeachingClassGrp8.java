package activitysheet2a;

public class TeachingClassGrp8 extends EmployeeClassGrp8 {

    private int days, hours;

    public double getHours() {
        System.out.print("\nEnter number of hours worked in a month: ");
        hours = scan.nextInt();
        days = hours / 8;
        return EmployeeClassGrp8.computeSalary(days);
    }
}
