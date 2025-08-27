
package calculator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;
        int negativeCount = 0;

        try {
            File inputFile = new File(inputFilePath);
            Scanner scanner = new Scanner(inputFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int num = Integer.parseInt(line.trim());
                    if (num == 0) {
                        zeroCount++;
                    } else if (num < 0) {
                        negativeCount++;
                    } else if (num % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Error: line '" + line.trim() + "' is not a valid integer.");
                }
            }
            scanner.close();
            String summary = "Odd numbers: " + oddCount + "\n"
                    + "Even numbers: " + evenCount + "\n"
                    + "Zero numbers: " + zeroCount + "\n"
                    + "Negative numbers: " + negativeCount + "\n";
            FileWriter fileWriter = new FileWriter(outputFilePath);
            fileWriter.write(summary);
            fileWriter.close();
            System.out.println("Summary written to output file.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

}