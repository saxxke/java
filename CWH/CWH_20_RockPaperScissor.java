import java.util.Random;
import java.util.Scanner;

public class CWH_20_RockPaperScissor {
    public static void main(String[] args) {
        int playerScore = 0;
        int computerScore = 0;
       try( Scanner scanner = new Scanner(System.in)){
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your choice (rock/paper/scissors):");
            String playerChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice(random);

            System.out.println("Computer choose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win this round!");
                playerScore++;
            } else {
                System.out.println("Computer wins this round!");
                computerScore++;
            }
        }

        System.out.println("Final score - You: " + playerScore + ", Computer: " + computerScore);

        if (playerScore > computerScore) {
            System.out.println("Congratulations, you are the winner!");
        } else if (playerScore < computerScore) {
            System.out.println("Computer is the winner!");
        } else {
            System.out.println("It's a tie game!");
        }
    }
    }
    private static String getComputerChoice(Random random) {
        String[] choices = { "rock", "paper", "scissors" };
        int index = random.nextInt(choices.length);
        return choices[index];

    }
}
