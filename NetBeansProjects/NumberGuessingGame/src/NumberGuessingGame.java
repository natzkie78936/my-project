import java.io.*;
import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Generating random numbers...");
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
            
        }

        try {
            PrintWriter writer = new PrintWriter("numbers.txt");
            for (int i = 0; i < size; i++) {
                writer.println(numbers[i]);
            }
            writer.close();
            System.out.println("\nNumbers saved to file.");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving numbers to file.");
            e.printStackTrace();
        }

        System.out.println("Guess the numbers:");
        int[] guesses = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Guess " + (i + 1) + ": ");
            guesses[i] = scanner.nextInt();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
            String line = reader.readLine();
            int i = 0;

            while (line != null && i < size) {
                int num = Integer.parseInt(line);
                if (num == guesses[i]) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect! The number was " + num + ".");
                }
                i++;
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading numbers from file.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading numbers from file.");
            e.printStackTrace();
        }
    }
}







