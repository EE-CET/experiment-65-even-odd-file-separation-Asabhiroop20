import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {
        try {
            // Initialize Scanner and PrintWriters
            Scanner sc = new Scanner(new File("numbers.txt"));
            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");

            // Separate numbers
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }

            // Close resources
            sc.close();
            evenWriter.close();
            oddWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        
        System.out.print("Even File: ");
        try {
            Scanner scEven = new Scanner(new File("even.txt"));
            while (scEven.hasNext()) {
                System.out.print(scEven.next() + " ");
            }
            scEven.close();
        } catch (FileNotFoundException e) {
            System.out.print("");
        }
        System.out.println();

        
        System.out.print("Odd File: ");
        try {
            Scanner scOdd = new Scanner(new File("odd.txt"));
            while (scOdd.hasNext()) {
                System.out.print(scOdd.next() + " ");
            }
            scOdd.close();
        } catch (FileNotFoundException e) {
            System.out.print("");
        }
        System.out.println();
    }
}