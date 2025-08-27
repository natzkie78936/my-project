/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;
import java.util.*;
/**
 *
 * @author USER
 */
public class TESTING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int chr;
        
        System.out.println("Check if character is a special character");
        chr=s.nextInt();
        
        if(chr > 0 && chr <=1000)
        {
            System.out.println("It is a number");
        }
        else if (chr > 1001)
        {
            System.out.println("Invalid input");
        }
    }
}
