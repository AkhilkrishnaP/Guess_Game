package Guess_game;
import javax.swing.*;
public class guessGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        int maxAttempts = 3;
        int count = 1;

        while (userAnswer != computerNumber && count <= maxAttempts) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + evaluate_Guess(userAnswer, computerNumber, count));
            count++;
        }
        if (count > maxAttempts) {
            JOptionPane.showMessageDialog(null, "Sorry, you've used all your attempts.\nThe correct answer was: " + computerNumber);
        }
}
    public static String evaluate_Guess(int userAnswer, int computerNumber, int count){
        if (userAnswer <=0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == computerNumber ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userAnswer > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userAnswer < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
