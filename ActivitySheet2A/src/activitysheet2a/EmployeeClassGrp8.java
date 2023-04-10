package activitysheet2a;

public class EmployeeClassGrp8 extends MemberClassGrp8 {

    // A static method that can be used by child classes
    public static double computeSalary(double days) {
        return days * 345.50;
    }
}
