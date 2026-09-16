
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        // Create a String array that can store 20 names
        String[] names = new String[20];

        try {
            // Open the file named names.txt
            File file = new File("names.txt");
            Scanner input = new Scanner(file);

            // Keep track of the current array position
            int index = 0;

            // Read words while the file has words
            // and the array is not full
            while (input.hasNext() && index < names.length) {

                // Store the next word in the array
                names[index] = input.next();

                // Move to the next array position
                index++;
            }

            // Close the file
            input.close();

            // Display a message
            System.out.println("Names stored in the array:");

            // Print all the names that were stored
            for (int i = 0; i < index; i++) {
                System.out.println(names[i]);
            }

        } catch (FileNotFoundException e) {

            // Display an error if names.txt does not exist
            System.out.println("File not found.");
        }
    }
}
