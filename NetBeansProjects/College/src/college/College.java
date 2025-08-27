/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package college;
import java.util.*;
/**
 *
 * @author USER
 */
public class College {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        
         int selection;
        
        System.out.println("Enter your operation. \n "
                + "1 - Addition \n "
                + "2 - Substraction \n "
                + "3 - Multiplication \n "
                + "4 - Division \n "
                + "5 - Square \n "
                + "6 - Cubed \n "
                + "7 - Exit");
        
        System.out.println("Enter your selected operation: ");
        selection=scan.nextInt();  
    
        if(selection == 1)
        {
            System.out.println("Enter first number: ");
            double num1=scan.nextDouble();
            System.out.println("Enter second number: ");
            double num2=scan.nextDouble();
            double sum;
            sum=num1+num2;
            
            System.out.println("The result is:  " + sum);
        }
        else if (selection== 2)
                {
                    System.out.println("Enter first number: ");
                    double num1=scan.nextInt();
                    System.out.println("Enter second number: ");
                    double num2=scan.nextInt();
                    double difference;
                    
                    difference=num1-num2;
                    
                    System.out.println("The diiference is " + difference);
                }
        else if (selection == 3 )
        {
            System.out.println("Enter first number: ");
            double num1=scan.nextDouble();
            System.out.println("Enter second number: ");
            double num2=scan.nextDouble();
            double product;
            
            product= num1*num2;
            
            System.out.println("The product is: " + product);
            
        }
        else if (selection == 4)
        {
            System.out.println("Enter first number");
            double num1=scan.nextDouble();
            System.out.println("Enter second number");
            double num2=scan.nextDouble();
            double quotient;
            
            quotient= num1/num2;
            
            System.out.println("The quotient is: " + quotient);
        }
        else if (selection == 5)
        {
            System.out.println("Enter numbe that you want to square: ");
            double num1=scan.nextDouble();
            
            double square;
            
            square = num1 * num1;
            
            System.out.println("The square of the number is: " + square);
            
        }
        else if (selection == 6)
        {
            System.out.println("Enter number that you want cubed");
            double num1=scan.nextDouble();
            
            double cube;
            cube = num1 * num1 * num1;
            
            System.out.println("The cube is: " + cube);
        }
        else if (selection == 7)
        {
           System.out.println("Thank you for using my calculator! ");
        }
    }
}
