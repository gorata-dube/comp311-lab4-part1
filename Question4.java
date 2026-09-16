
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = input.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println("Binary representation: " + binary);

        input.close();
    }
}