/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activitysheet2a;

/**
 *
 * @author Allen James Laxamana
 */
public class InheritanceActivityMainGrp8 {

    /**
     * @param args the command line arguments
     */
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
