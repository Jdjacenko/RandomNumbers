import java.util.Scanner;

public class CoinAmount {

    public static class CoinCounter {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int amount;
            int totalCoins = 0;
            int myInt;
            int oneCent;
            int twoCents;
            int tenCents;
            int twentyCents;
            int fiftyCents;
            int oneEuro;
            int twoEuro;

            System.out.println("Enter your amount:");
            amount = scanner.nextInt();
            System.out.println("You get beck:" );

            System.out.println((amount / 200) + " - 2 Euro coins");
            myInt = (amount / 200);
            amount = amount % 200;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }
            System.out.println((amount / 100) + " - 1 Euro coins");
            myInt = (amount / 100);
            amount = amount % 100;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }
            System.out.println((amount / 50) + " - 50 Euro cents");
            myInt = (amount / 50);
            amount = amount % 50;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }
            System.out.println((amount / 20) + " - 20 Euro cents");
            myInt = (amount / 20);
            amount = amount % 20;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }
            System.out.println((amount / 10) + " - 10 Euro cents");
            myInt = (amount / 10);
            amount = amount % 10;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }
            System.out.println((amount / 5) + " - 5 Euro cents");
            myInt = (amount / 5);
            amount = amount % 5;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }
            System.out.println((amount / 2) + " - 2 Euro cents");
            myInt = (amount / 2);
            amount = amount % 2;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }
            System.out.println((amount / 1) + " - 1 Euro cents");
            myInt = (amount / 1);
            amount = amount % 1;

            if (amount > 0) {
                for (int i = 0; i < myInt; i++) {
                    totalCoins++;
                }
            }




        }
    }
}
