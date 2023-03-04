import java.util.Random;
import java.util.Scanner;
public class Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int dice1 = rnd.nextInt(6) + 1;// Rolls a dice
            int dice2 = rnd.nextInt(6) + 1;//Rolls a dice
            int sum = dice1 + dice2;
            System.out.println("Rolling the dice...");
            System.out.println("Dice 1: " + dice1);//number that rolled on the dice 1
            System.out.println("Dice 2: " + dice2);//number that rolled on the dice 2
            System.out.println("Sum: " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {// if sum is 2, 3, or 12. The player loses
                System.out.println("Craps! You lose.");//message prints "Craps! You lose."
            } else if (sum == 7 || sum == 11) {// If Sum is 7 or 11. Player wins
                System.out.println("Natural! You win.");// message outputs "Natural! You win."
            } else {
                int point = sum;
                System.out.println("Point is " + point);

                while (true) {
                    System.out.println("Rolling again...");//Dice is rolling again
                    dice1 = rnd.nextInt(6) + 1;
                    dice2 = rnd.nextInt(6) + 1;
                    sum = dice1 + dice2;
                    System.out.println("Dice 1: " + dice1);
                    System.out.println("Dice 2: " + dice2);
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

            System.out.print("Play again? (Y/N): ");// Asking user if they want to play again
            String answer = scanner.nextLine();
            playAgain = answer.equalsIgnoreCase("Y");
        }

        System.out.println("Thanks for playing!");
    }
}
