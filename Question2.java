
import java.io.FileWriter;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {

        // Declare and initialise a double array
        double[] numbers = {10.5, 20.75, 30.25, 40.0, 50.5};

        try {
            // Create or open the file numbers.txt
            FileWriter writer = new FileWriter("numbers.txt");

            // Loop through every element in the array
            for (int i = 0; i < numbers.length; i++) {

                // Write the current number to the file
                // \n moves to the next line
                writer.write(numbers[i] + "\n");
            }

            // Close the file after writing
            writer.close();

            // Display a success message
            System.out.println("Numbers written to the file.");

        } catch (IOException e) {

            // Display an error if writing to the file fails
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
