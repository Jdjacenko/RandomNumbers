import java.util.Scanner;

public class GuessingGame {

    public static class GuessingGame1 {

        public static void main(String[] args) {

            java.util.Random randomGenerator = new java.util.Random();
            Scanner input = new Scanner(System.in);

            int a = randomGenerator.nextInt(11);

            System.out.println("Guess the number from 0 to 10");
            System.out.println("");
            System.out.println("Please enter your number: ");
            int b = input.nextInt();

            if (a == b)
                System.out.println("Computer guessed my number");
            if (b > a)
                System.out.println("The number you have guessed is bigger");
            if (b < a)
                System.out.println("The number you have guessed is smaller");
        }
    }
}
