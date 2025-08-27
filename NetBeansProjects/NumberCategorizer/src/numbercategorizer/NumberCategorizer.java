/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numbercategorizer;
import java.io.*;


public class NumberCategorizer {

    public static void main(String[] args) {
        File numbers = new File("numbers.txt");
        try {
 
boolean value = numbers.createNewFile();
if (value) {
System.out.println("The file does not exist");
}
else {
System.out.println("Here is the numbers");
}
}
catch(Exception e) {
e.getStackTrace();
}
     
       String filename = "numbers.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
 
            String line = reader.readLine();
            int num;
            int oddCount = 0;
            int evenCount = 0;
            int zeroCount = 0;
            int negativeCount = 0;

            while (line != null) {
                try {
                    num = Integer.parseInt(line.trim());

                    if (num == 0) {
                        zeroCount++;
                    } else if (num % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }

                    if (num < 0) {
                        negativeCount++;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid number: " + line);
                }

                line = reader.readLine();
            }

            System.out.println("Odd count: " + oddCount);
            System.out.println("Even count: " + evenCount);
            System.out.println("Zero count: " + zeroCount);
            System.out.println("Negative count: " + negativeCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }

}