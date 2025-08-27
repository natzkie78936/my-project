// Emman Sarillana & Gabriel Nonato
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbercategorizer1;
import java.io.*;


public class Numbercategorizer1 {

    public static void main(String[] args)throws IOException {    
        
         File file = new File("outputFile.txt");
try {

boolean value = file.createNewFile();
if (value) {
System.out.println("The new file is created");
}
else {
System.out.println("The file already exists");
}
}
catch(Exception e) {
e.getStackTrace();
}
   String inputFilePath = "hentaoFile.txt";
      String outputFilePath = "output.txt";

        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;
        int negativeCount = 0;
    //  boolean notDone = true;
       
       String line;

     try{
            BufferedReader inputFile = new BufferedReader (new FileReader ("hentaoFile.txt"));
            FileWriter fileWriter = new FileWriter("output.txt");
            while ((line = inputFile.readLine()) != null) {
   
                System.out.println(line);
                try {
                   
                    int num = Integer.parseInt(line);
                    if (num == 0) {
                        zeroCount++;
                    } else if (num < 0) {
                        negativeCount++;
                    } else if (num % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                 //notDone = false;
                    } catch (NumberFormatException e) {
                         System.out.println("Error: line " + line + " is not a valid integer.");
              //  notDone = false;
                }
                
            }
            inputFile.close();
           
            String summary = "Odd numbers: " + oddCount + "\n"
                    + "Even numbers: " + evenCount + "\n"
                    + "Zero numbers: " + zeroCount + "\n"
                    + "Negative numbers: " + negativeCount + "\n";
            
            fileWriter.write(summary);
            
            System.out.println("Summary written to output file.");
    
         fileWriter.close();
    }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    }