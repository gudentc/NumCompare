import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Declare Variables
        double number1 = 0;
        double number2 = 0;
        String trash = "";

        // Input and test
        System.out.print("\nEnter the first number: ");
        if(in.hasNextDouble()) {
            number1 = in.nextDouble();
            in.nextLine(); // Clears the buffer
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid number if not " + trash);
            System.out.println("Rerun the program!");
            System.exit(0);
        }
        // Second input
        System.out.print("Enter your next number: ");
        if(in.hasNextDouble()) {
            number2 = in.nextDouble();
            in.nextLine(); // clears the buffer
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou must enter a valid number if not " + trash);
            System.out.println("Rerun the program!");
            System.exit(0);
        }
        //If we make it here then both of the numbers were valid.
        if (number1 == number2) {
            System.out.println("\nThe first number " + number1 + " equals the same as the second number " + number2);
        }
        else {
            if (number1 < number2) {
                System.out.println("\nThe first number " + number1 + " is less than50 the second number " + number2);
                ;
            }
        }
    }
}