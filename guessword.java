
import java.util.Scanner;

public class guessword {
    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);

        String word = "akshay";
        String[] letters = word.split("");
        String[] newletters = new String[letters.length];

        while (true) {
            System.out.print("Guess a letter: ");
            String input = guess.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Please enter one letter.");
                continue;
            }

            boolean found = false;

            for (int i = 0; i < letters.length; i++) {
                if (input.equals(letters[i])) {
                    newletters[i] = input;
                    found = true;
                }
            }

            if (found) {
                System.out.println("Matches!");
            } else {
                System.out.println("Does not match.");
            }

            for (int i = 0; i < letters.length; i++) {
                if (newletters[i] == null) {
                    System.out.print("_ ");
                } else {
                    System.out.print(newletters[i] + " ");
                }
            }

            System.out.println();

            boolean completed = true;

            for (int i = 0; i < letters.length; i++) {
                if (newletters[i] == null) {
                    completed = false;
                    break;
                }
            }

            if (completed) {
                System.out.println("Congratulations! You guessed the word!");
                break;
            }
        }

        guess.close();
    }
}
