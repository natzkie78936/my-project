/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ashle;
import java.util.*;
/**
 *
 * @author USER
 */
public class Ashle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      char fak;
       System.out.println("Enter a character");
      fak = s.next().charAt(0);
         
     if (fak == 'A' || fak == 'E' || fak == 'I' || fak == 'O' || fak == 'U' || fak == 'a' || fak == 'e' || fak == 'i' || fak == 'o' || fak == 'u ')
         {
             System.out.println("The character is a vowel");
         }
     else
    {
        System.out.println("The character is a constonant");
    }

}
