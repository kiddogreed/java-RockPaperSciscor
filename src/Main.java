import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: 29/05/2023  rockpaperSciscor
        //  1. create bot logic within arrays of rps with randomizer
        //  2. using scanner to capture user input
        //  3. create while loop that will end for wrong input

        //computer moves rock paper scissor
        String[] rps = {"r","p","s"};
        String computer = rps[new Random().nextInt(rps.length)];

        //user move
        Scanner sc = new Scanner(System.in);
        String userMove;
        //loop control
        while (true){

            System.out.println("Please enter your move 'r', 'p' or 's'.");
            userMove = sc.nextLine();
            if (userMove.equals("r")|| userMove.equals("p")|| userMove.equals("s")) {
                break;
            }
            System.out.println(userMove+" is not a valid move");
        }

        System.out.println("Computer played: "+ computer);
        if (userMove.equals(computer)){
            System.out.println("it is a tie");
        } else if (userMove.equals("r")) {
            if (computer.equals("p")){
                System.out.println("You Lose");
            }else{
                System.out.println("you Win!");
            }
        } else if (userMove.equals("p")) {
            if (computer.equals("s")){
                System.out.println("You Lose");
            }else{
                System.out.println("you Win!");
            }
        } else {
            if (computer.equals("r")){
                System.out.println("You Lose");
            }else{
                System.out.println("you Win!");
            }
        }



    }
}
