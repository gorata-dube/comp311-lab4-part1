
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        // Create a Scanner to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a whole number
        System.out.print("Enter a whole number: ");

        // Read the number entered by the user
        int number = input.nextInt();

        // Convert the decimal number to binary
        String binary = Integer.toBinaryString(number);

        // Display the binary representation
        System.out.println("Binary representation: " + binary);

        // Close the Scanner
        input.close();
    }
}
