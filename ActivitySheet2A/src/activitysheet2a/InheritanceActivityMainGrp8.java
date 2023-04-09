package activitysheet2a;

public class InheritanceActivityMainGrp8 {

    public static void main(String[] args) {
        
        MemberClassGrp8 getName = new MemberClassGrp8();
        MemberClassGrp8 getMemType = new MemberClassGrp8();
            
        System.out.println("Enter Member Name: ");
        String name = getName.getName();
        System.out.println("Enter Member Type: ");
        String memtype = getMemType.getMemType();
        
        System.out.println("Shadi");
        for (int i = 0; i < 10; i++) {
            System.out.println("test");
        }
    }
    
}
