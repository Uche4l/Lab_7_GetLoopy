import java.util.Random;
import java.util.Scanner;

public class Task8
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner input = new Scanner(System.in);

        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int dieRoll = 0;
        int sum = 0;
        int rollCount = 0;
        boolean continueYN = true;

        do {
            System.out.println("\tRoll\tdie1\tdie2\tdie3\tsum");
            System.out.println("\t_________________________________");
            do {
                die1 = gen.nextInt(6) + 1; // 0 - 5 + 1 1 - 6
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;

                dieRoll = die1 + die2 + die3;

                System.out.printf("%6d\t%4d\t%4d\t%4d\t%6d\n", dieRoll, die1, die2, die3, sum);
            } while (!(die1 == die2 && die2 == die3));

            System.out.print("play again? [YN]: ");
            continueYN = input.hasNext();
            if (!input.equals("Y")){
                continueYN = false;
            }
        } while (continueYN);

   }

}
