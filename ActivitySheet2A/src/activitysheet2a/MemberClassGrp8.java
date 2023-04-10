package activitysheet2a;

import java.util.Scanner;

public class MemberClassGrp8 {

    Scanner scan = new Scanner(System.in);

    private String name, memType;

    // Accepts the member's name and returns the value
    public String getName() {
        System.out.print("Enter member name: " );
        name = scan.nextLine();
        return name;
    }

    // Getter for name
    public String getMemType() {
        System.out.print("Enter member type: ");
        memType = scan.nextLine();
        return memType;
    }
}
