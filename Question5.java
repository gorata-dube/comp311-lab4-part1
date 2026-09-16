
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        // Create a Scanner to read input from the keyboard
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a word or phrase
        System.out.print("Enter a word or phrase: ");

        // Read the entire line entered by the user
        String text = input.nextLine();

        // Convert the text to lowercase
        // so that uppercase and lowercase are treated equally
        text = text.toLowerCase();

        // Create an empty String to store the reversed text
        String reversed = "";

        // Start from the last character and move backwards
        for (int i = text.length() - 1; i >= 0; i--) {

            // Add the current character to the reversed String
            reversed = reversed + text.charAt(i);
        }

        // Compare the original text with the reversed text
        if (text.equals(reversed)) {

            // Display this message if both Strings are equal
            System.out.println("It is a palindrome.");

        } else {

            // Display this message if the Strings are different
            System.out.println("It is not a palindrome.");
        }

        // Close the Scanner
        input.close();
    }
}
