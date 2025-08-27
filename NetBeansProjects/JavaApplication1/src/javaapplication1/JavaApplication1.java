/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

/**
 *
 * @author USER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,r,rev=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        n=s.nextInt();
        while(n>0){
          r=n%10;
           rev=rev*10+r;
           n=n/10;
        }
        System.out.println("Reverse of :"+n+ "is:"+rev);
    }
}
