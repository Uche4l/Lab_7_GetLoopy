import java.util.Random;
import java.util.Scanner;

public class Task8pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String choice;

        do {
            int rollCount = 0;
            boolean triple = false;

            // Print header
            System.out.printf("%-8s %-8s %-8s %-8s %-8s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            // Keep rolling until we get a triple
            while (!triple) {
                rollCount++;
                // Generate three random dice values
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Print the roll result
                System.out.printf("%-8d %-8d %-8d %-8d %-8d\n", rollCount, die1, die2, die3, sum);

                // Check if all three dice are the same (triple)
                if (die1 == die2 && die2 == die3) {
                    triple = true;
                }
            }

            // Ask user if they want to continue
            System.out.print("Triple rolled! Do you want to roll again? (y/n): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}