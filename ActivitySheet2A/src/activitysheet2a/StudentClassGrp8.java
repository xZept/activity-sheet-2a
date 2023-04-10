package activitysheet2a;

public class StudentClassGrp8 extends MemberClassGrp8 {

    private int units; 
    
    public double getUnits() {
        System.out.print("\nEnter number of units enrolled: ");
        units= scan.nextInt();
        return units;
    }
}
