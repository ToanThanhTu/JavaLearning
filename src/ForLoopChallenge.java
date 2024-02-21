public class ForLoopChallenge {

    public static void main(String[] args) {
//        Prime numbers challenge
        int count = 0;

//        for (int i = 500; count < 3 && i <= 1000; i++) {
        for (int i = 500; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
            }
//            System.out.println(i + " is" + ((isPrime(i)) ? "" : " NOT") + " a PRIME number");
            if (count == 3) {
                System.out.println(("Found 3 - exiting the loop"));
                break;
            }
        }
        System.out.println(count + " prime numbers were found");
        System.out.println("-------------------------------------------------");

//        Sum of 3 and 5 challenge
        int sum = 0;
        count = 0;

        for (int i = 1; count < 5 && i <= 1000; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println(i + " can be divided by both 3 and 5");
                sum += i;
                count++;
            }
        }

        System.out.println("The sum of 5 found numbers = " + sum);

    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }

        for (int d = 2; d <= (number / 2); d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }

}
