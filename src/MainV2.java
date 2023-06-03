import java.util.Random;
import java.util.Scanner;

public class MainV2 {

    // TODO: 03/06/2023 this is the new improved rock,paper,scissors game
    //  0.Create Constrains (possible inputs)
    //  1.Get User Input (R,P and S)
    //  2.Randomize Computer answers
    //  3.Create logic for winning
    //  4.Track user and computer Scores
    //  5.Create loop

    public static void main(String[] args) {
        //computer input
        String[] rps = {"r","p","s"};
        String computer = rps[new Random().nextInt(rps.length)];

        //user input
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();

        //score board
        int computerScore = 0;
        int userScore = 0;

        // looper
        boolean playAgain = true;

        System.out.println("greeting");
        while (playAgain) {

            System.out.println("lets play "+ computerScore);
            String playAgainChoice = scanner.nextLine().toLowerCase();
            if (playAgainChoice.equals("yes")) {
                System.out.println("GOOD ,lets end here ");
                playAgain = false;
            }else {
                System.out.println("oh oh, back to the game type 'yes' to end");
            }
            computerScore ++;


        }








    }
}
