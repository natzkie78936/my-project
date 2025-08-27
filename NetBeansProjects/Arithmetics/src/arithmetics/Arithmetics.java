/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetics;
import com.sun.webkit.ContextMenu;
import java.util.*;
/**
 *
 * @author USER
 */
public class Arithmetics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s = new Scanner(System.in);
    
    int age = 0;
    String input = "";
    
    System.out.println("Enter you age: ");
    input = s.nextLine();
    
    
    age = Integer.parseInt(input);
    
    if (age<0)
    {
        System.out.print("Invalid\n ");
       System.exit(0);
    }  
    else if(age < 18)
    {
        System.out.print("Minor, Not allowed to vote\n ");
    }
    else if (age >= 18 && age <=35)
    {
        System.out.print("Young voter, Allowed to vote\n ");
    }
    else if (age >= 36 && age <=65)
    { 
        System.out.print("Adult voter, Allowed to voted\n ");      
    }
    else if (age > 60 && age <= 150)
    {
        System.out.print("Senior voter, Allowed to vote\n ");
    }
    else if (age > 150)
    {
        System.out.print("Invalid\n ");
    }
     }
}
