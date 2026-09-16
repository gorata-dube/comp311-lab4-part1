
import java.io.FileWriter;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 20, 3, 15};

        int sum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        try {
            FileWriter writer = new FileWriter("results.txt");

            writer.write("Sum: " + sum + "\n");
            writer.write("Smallest: " + smallest + "\n");
            writer.write("Largest: " + largest + "\n");

            writer.close();

            System.out.println("Results written to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}