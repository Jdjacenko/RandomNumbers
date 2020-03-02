public class RandomNumber {

    public static class RandomNumberClass {

        public static void main(String[] args) {

            java.util.Random randomGenerator = new java.util.Random();

            int a = randomGenerator.nextInt(11);
            int b = randomGenerator.nextInt(11);
            int c = randomGenerator.nextInt(11);

            int result = (a + b + c);

            System.out.println("");
            System.out.println("First number: " + a);
            System.out.println("Second number: " + b);
            System.out.println("Third number: " + c);

            if (a == (b = c))
                System.out.println("Player win");

        }
    }
}
