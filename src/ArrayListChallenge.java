import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        boolean flag = true;

        while (flag) {
            printMenu();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addToArrayList(items);
                case 2 -> removeFromArrayList(items);
                default -> flag = false;
            }
        }
        System.out.println(items);
    }

    private static void printMenu() {
        String textBlock = """
                Available actions:
                0 - to shut down
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:\s""";
        System.out.print(textBlock);
    }

    private static void addToArrayList(ArrayList<String> items) {
        System.out.print("Enter a comma delimited list of item(s) to add: ");
        String input = scanner.nextLine();
        String[] inputs = input.split(",");

        for (String i : inputs) {
            String trimmed = i.trim();
            if (!items.contains(trimmed)) {
                items.add(trimmed);
            }
        }
        items.sort(Comparator.naturalOrder());
        System.out.println(items);
    }

    private static void removeFromArrayList(ArrayList<String> items) {
        System.out.print("Enter a comma delimited list of item(s) to remove: ");
        String input = scanner.nextLine();
        String[] inputs = input.trim().split(",");

        for (String i : inputs) {
            String trimmed = i.trim();
            items.remove(trimmed);
        }
        items.sort(Comparator.naturalOrder());
        System.out.println(items);
    }
}

