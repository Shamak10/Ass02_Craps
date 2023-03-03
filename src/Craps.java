import java.util.Random;
import java.util.Scanner;
public class Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int dice1 = rnd.nextInt(6) + 1;
            int dice2 = rnd.nextInt(6) + 1;
            int sum = dice1 + dice2;
            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + dice1);
            System.out.println("Die 2: " + dice2);
            System.out.println("Sum: " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win.");
            } else {
                int point = sum;
                System.out.println("Point is " + point);

                while (true) {
                    System.out.println("Rolling again...");
                    dice1 = rnd.nextInt(6) + 1;
                    dice2 = rnd.nextInt(6) + 1;
                    sum = dice1 + dice2;
                    System.out.println("Die 1: " + dice1);
                    System.out.println("Die 2: " + dice2);
                    System.out.println("Sum: " + sum);

                    if (sum == point) {
                        System.out.println("Made point! You win.");
                        break;
                    } else if (sum == 7) {
                        System.out.println("Seven out! You lose.");
                        break;
                    }
                }
            }

            System.out.print("Play again? (Y/N): ");
            String answer = scanner.nextLine();
            playAgain = answer.equalsIgnoreCase("Y");
        }

        System.out.println("Thanks for playing!");
    }
}
