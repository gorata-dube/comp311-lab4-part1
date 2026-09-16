
import java.io.FileWriter;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {

        double[] numbers = {10.5, 20.75, 30.25, 40.0, 50.5};

        try {
            FileWriter writer = new FileWriter("numbers.txt");

            for (int i = 0; i < numbers.length; i++) {
                writer.write(numbers[i] + "\n");
            }

            writer.close();

            System.out.println("Numbers written to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}