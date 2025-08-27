/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java. util.*;
/**
 *
 * @author USER
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input;

        System.out.println("Enter a character or number:");
        input = s.next();

        if (input.length() > 1) {
            char fak = input.charAt(0);

            if (Character.isLetter(fak)) {
                if (fak == 'A' || fak == 'a' || fak == 'E' || fak == 'e' || fak == 'O' || fak == 'o' || fak == 'U' || fak == 'u' || fak == 'I' || fak == 'i') {
                    System.out.println("It is a vowel!");
                } else {
                    System.out.println("It is a consonant!");
                }
            } else if (Character.isDigit(fak)) {
                int num = Character.getNumericValue(fak);
                if (num >= 0 && num <= 1000) {
                    System.out.println("It is a number!");
                } else {
                    System.out.println("Invalid Output");
                }
            } else if (!Character.isWhitespace(fak)) {
                System.out.println("Character is a Special Character!");
            } else {
                System.out.println("Invalid Output");
            }
        } else {
            System.out.println("Invalid Output");
        }
    }
}