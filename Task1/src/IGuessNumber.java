import java.util.Scanner;

    public class IGuessNumber {

        public static class GuessingGame2 {

            public static void main(String[] args) {

                java.util.Random randomGenerator = new java.util.Random();
                Scanner scanner = new Scanner(System.in);

                int a = randomGenerator.nextInt(101);
                System.out.println("" + a);

                System.out.println("Please enter number what computer thinks: ");
                int b;

                while (true) {
                    b = scanner.nextInt();

                    if (a > b) {
                        System.out.println("Yor number is smaller");
                        continue;
                    } else if (a < b) {
                        System.out.println("Your number is bigger");
                        continue;
                    }
                    break;
                }
                if (a == b) {
                    System.out.println("You guess the number computer thinks");
                }
            }
        }
    }

