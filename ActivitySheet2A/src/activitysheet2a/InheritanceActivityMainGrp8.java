package activitysheet2a;

public class InheritanceActivityMainGrp8 {

    static String name, memType;
    static double output;

    // Constructor for Greeting message
    public InheritanceActivityMainGrp8() {
        System.out.println("Welcome to BPSU Profile!");
        System.out.println("Hello, " + name);
    }

    public void displayEmpRemarks() {
        System.out.println("Employee Type: " + memType);
        System.out.println("Computed Salary: " + output);
    }

    public static void main(String[] args) {
        MemberClassGrp8 obj = new MemberClassGrp8();
        name = obj.getName();
        memType = obj.getMemType();
        System.out.print("\n"); // Whitespace
        InheritanceActivityMainGrp8 greetUser = new InheritanceActivityMainGrp8();

        // Check member type
        switch (memType.toLowerCase()) {
            case "teaching":
                TeachingClassGrp8 teach = new TeachingClassGrp8();
                output = teach.getHours();
                System.out.println("\nYou are a teaching employee of BPSU!");
                System.out.println("The computed salary is PHP " + output + ".");
                break;
            case "non-teaching":
                NonteachingClassGrp8 nonTeach = new NonteachingClassGrp8();
                output = nonTeach.getDays();
                System.out.println("\nYou are a non-teaching employee of BPSU!");
                System.out.println("The computed salary is PHP " + output + ".");
                break;
            case "student":
                StudentClassGrp8 student = new StudentClassGrp8();
                output = student.getUnits();
                System.out.println("\nThank you for enrolling at BPSU!");
                System.out.println("Your total enrolled units is " + output + ".");
                break;
            default:
                System.out.println("Invalid member type.");
                break;
        }
    }
}
