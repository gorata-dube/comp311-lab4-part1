
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        String[] names = new String[20];

        try {
            File file = new File("names.txt");
            Scanner input = new Scanner(file);

            int index = 0;

            while (input.hasNext() && index < names.length) {
                names[index] = input.next();
                index++;
            }

            input.close();

            System.out.println("Names stored in the array:");

            for (int i = 0; i < index; i++) {
                System.out.println(names[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}