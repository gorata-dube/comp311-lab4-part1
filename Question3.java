
import java.io.FileWriter;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {

        // Declare and initialise an integer array
        int[] numbers = {10, 5, 20, 3, 15};

        // Start the sum at zero
        int sum = 0;

        // Use the first number as the starting smallest value
        int smallest = numbers[0];

        // Use the first number as the starting largest value
        int largest = numbers[0];

        // Loop through every number in the array
        for (int i = 0; i < numbers.length; i++) {

            // Add the current number to the sum
            sum = sum + numbers[i];

            // Check if the current number is smaller
            // than the current smallest number
            if (numbers[i] < smallest) {

                // Update the smallest number
                smallest = numbers[i];
            }

            // Check if the current number is larger
            // than the current largest number
            if (numbers[i] > largest) {

                // Update the largest number
                largest = numbers[i];
            }
        }

        try {
            // Create or open the file results.txt
            FileWriter writer = new FileWriter("results.txt");

            // Write the sum to the file
            writer.write("Sum: " + sum + "\n");

            // Write the smallest number to the file
            writer.write("Smallest: " + smallest + "\n");

            // Write the largest number to the file
            writer.write("Largest: " + largest + "\n");

            // Close the file
            writer.close();

            // Display a success message
            System.out.println("Results written to the file.");

        } catch (IOException e) {

            // Display an error if writing to the file fails
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
