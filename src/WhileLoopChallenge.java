public class WhileLoopChallenge {
    public static void main(String[] args) {
//        whileLoop();
        int number = 321123;
        System.out.println("sum digits of " + number + " = " + sumDigits(number));
    }

    public static boolean isEvenNumber(int number) {
        return (number >= 0) && (number % 2 == 0);
    }

    public static void whileLoop() {
        int evenCount = 0;
        int oddCount = 0;
        int i = 5;
        while (i <= 20) {
            if (!isEvenNumber(i)) {
                oddCount++;
            } else {
                evenCount++;
                System.out.println(i + " is an even number");
            }

            if (evenCount >= 5) {
                System.out.println("5 numbers found, break the loop");
                break;
            }
            i++;
        }
        System.out.println("number of odds: " + oddCount);
        System.out.println("number of evens: " + evenCount);

        // another way with "continue"
        evenCount = 0;
        oddCount = 0;
        int j = 4;
        while (j <= 20) {
            j++;
            if (!isEvenNumber(j)) {
                oddCount++;
                continue;
            }

            evenCount++;
            System.out.println(j + " is an even number");

            if (evenCount >= 5) {
                System.out.println("5 numbers found, break the loop");
                break;
            }
        }
        System.out.println("number of odds: " + oddCount);
        System.out.println("number of evens: " + evenCount);
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        return sum;
    }
}
