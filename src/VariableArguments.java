public class VariableArguments {

    public static void main(String[] args) {
        printText("Hello", "World", "again");

        System.out.println("-".repeat(30));

        String[] splitString = "Hello World again".split(" ");
        printText(splitString);

        System.out.println("-".repeat(30));

        String[] sArray = {"first", "second", "third", "fourth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
