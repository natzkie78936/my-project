/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergenerator;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
/**
 *
 * @author USER
 */
public class RandomNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("How many random numbers do you want to generate? ");
        int numRandoms = input.nextInt();

  
        int[] randoms = new int[numRandoms];
        for (int i = 0; i < numRandoms; i++) {
            randoms[i] = random.nextInt(100); 
            System.out.println(i);
                    
        }

      /*  try {
            FileWriter writer = new FileWriter("randoms.txt");
            writer.write(Arrays.toString(randoms));
            writer.close();
            System.out.println("Successfully wrote generated numbers to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        
        
           File txt = new File("randoms.txt");
            Scanner scan = new Scanner(txt);
            ArrayList<String> data = new ArrayList<String>();
            while(scan.hasNextLine()){
                data.add(scan.nextLine());
            }
          
            
            String[] simpleArray = data.toArray(new String[]{});
         
            for (int i = 0; i < simpleArray.length; i++) {
            System.out.println(simpleArray[i]);
            }*/
        
            
            
            

    }
}





