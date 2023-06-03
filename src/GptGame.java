import java.util.Random;
import java.util.Scanner;
public class GptGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = { "rock", "paper", "scissors" };

        int userScore = 0;
        int computerScore = 0;

        boolean playAgain = true;

        System.out.println("Welcome to Rock-Paper-Scissors game!");

        while (playAgain){
            System.out.println("Enter your choice (rock, paper, or scissors):");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                int computerIndex = random.nextInt(3);
                String computerChoice = choices[computerIndex];

                System.out.println("Computer chose: " + computerChoice);
                System.out.println("You chose: " + userChoice);

                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                        || (userChoice.equals("paper") && computerChoice.equals("rock"))
                        || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                    System.out.println("Congratulations! You win!");
                    userScore++;
                } else {
                    System.out.println("Sorry! You lose!");
                    computerScore++;
                }

                System.out.println("Your score: " + userScore);
                System.out.println("Computer's score: " + computerScore);

                System.out.println("Do you want to play again? (yes/no)");
                String playAgainChoice = scanner.nextLine().toLowerCase();
                if (!playAgainChoice.equals("yes")) {
                    playAgain = false;
                }
            } else {
                System.out.println("Invalid choice! Please choose either rock, paper, or scissors.");
            }
        }

        System.out.println("Thanks for playing. Final scores:");
        System.out.println("Your score: " + userScore);
        System.out.println("Computer's score: " + computerScore);

        scanner.close();
    }
}
