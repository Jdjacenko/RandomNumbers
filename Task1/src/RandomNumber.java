public class RandomNumber {

    public static class RandomNumberClass {

        public static void main(String[] args) {

            java.util.Random randomGenerator = new java.util.Random();

            int a = randomGenerator.nextInt(101);
            int b = randomGenerator.nextInt(101);
            int c = randomGenerator.nextInt(101);

            int result = (a + b + c);

            System.out.println("Total amount: " + (result));

        }
    }
}
