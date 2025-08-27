
package calc;
import java.util.*;
  
/**
 * 
 * @author Dell_PC
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
       
       char selection;
       System.out.println("Welcome to My Calculator");
            System.out.println("Enter the first operation \n "
                + "A - Addition \n "
                + "S - Substraction \n "
                + "M - Multiplication \n "
                + "D - Division \n "
                + "Q - Square \n "
                + "C - Cubed \n "
                + "E - Exit");
            
            System.out.println("Enter you selected operation:" );
            
            selection=s.next().charAt(0);
            
            if (selection=='A'|| selection=='a')
            {
                System.out.println("Enter first value: ");
            double num1=s.nextDouble();
                System.out.println("Enter second value: ");
            double num2=s.nextDouble();
            double sum;
            sum=num1+num2;
            
            System.out.println("The sum of the two numbers are: " + sum);
            System.out.println("Thank you for using My Calculator! ");
             System.exit(0); 
            
                
            }
            
            else if (selection=='S'|| selection=='s')
                    {
                        System.out.println("Enter first value: ");
                    double num1=s.nextDouble();
                        System.out.println("Enter second value: ");
                    double num2=s.nextDouble();
                    double diff;
                    diff=num1-num2;
                    
                System.out.println("The difference of the two numbers are: " + diff );
                System.out.println("Thank you for using My Calculator! ");
                 System.exit(0); 
                    }
            else if (selection=='M'|| selection=='m')
            {
                System.out.println("Enter first value: ");
            double num1=s.nextDouble();
                System.out.println("Enter second value: ");
            double num2=s.nextDouble();
            double mul;
            mul=num1*num2;
            
            System.out.println("The product of the two numbers are: " + mul );
            System.out.println("Thank you for using My Calculator! ");
             System.exit(0); 
            }
            else if (selection=='D' || selection=='d')
            {
                System.out.println("Enter first value: ");
                double num1=s.nextDouble();
                System.out.println("Enter second value: ");
                double num2=s.nextDouble();
                double div;
                div = num1/num2;
                
                System.out.println("The quotient of the two numbers are: " + div);
                System.out.println("Thank you for using My Calculator! ");  
                System.exit(0);      
            }
       else
       
      switch(selection)
      {
          case'Q': case'q':
              Scanner Input=new Scanner (System.in);
                 System.out.println("Enter a value: ");
                  double num1=Input.nextInt();
                  double cub;
                  cub=num1*num1;
                     System.out.println("The square of the value is: "+ cub);
                     System.out.println("Thank you for using My Calculator! ");
                      System.exit(0);
                       break;
                       
               
                 
      }
       switch(selection)
       {
            case 'C': case'c':
            Scanner Input=new Scanner (System.in);
                 System.out.println("Enter a value: ");
                  double num1=Input.nextInt();
                  double squ;
                  squ=num1*num1*num1;
                     System.out.println("The Cube of the value is= "+ squ);
                     System.out.println("Thank you for using My Calculator! ");
                      System.exit(0);
                       break;
          
              
       }
       switch(selection)
       {
           case'E': case 'e':
               
               System.out.println("Thank you for using My Calculator! ");   
                break;
           default:
               System.out.println("Invalid selection... Run MyCalculator again. ");
               
               
       }
       
                }              
    

}