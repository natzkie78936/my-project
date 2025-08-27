/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
import java.util.*;
/**
 *
 * @author USER
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        System.out.println("Enter a character or number");
        input = s.next();

        if (input.length() == 1) {
            char fak = input.charAt(0);

            if (fak == 'A' || fak == 'a' || fak == 'E' || fak == 'e' || fak == 'O' || fak == 'o' || fak == 'U' || fak == 'u' || fak == 'I' || fak == 'i') {
                System.out.println("It is a vowel!");
            } else if (!Character.isDigit(fak) && !Character.isLetter(fak) && !Character.isWhitespace(fak)) {
                System.out.println("Character is a Special Character!");
            } else if (Character.isLetter(fak)) {
                System.out.println("It is a consonant!");
            } else {
                try {
                    int num = Integer.parseInt(input);
                    if (num >= 0 && num <= 1000) {
                        System.out.println("It is a number between 0 and 1000!");
                    } else {
                        System.out.println("Invalid Input");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input");
                }
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
