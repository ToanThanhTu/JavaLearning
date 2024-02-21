public class WhileLoop {
    public static void main(String[] args) {
        whileDoWhileLoop();
        continueStatement();
    }

    public static void whileDoWhileLoop() {
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int j = 1;
        while (true) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        boolean isReady = false;
        int k = 1;
        do {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k > 0);
        } while (isReady);
    }

    public static void continueStatement() {
        int number = 0;
        while (number < 50) {
            number += 5;

            // skip number can be divided by 25
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }

}
