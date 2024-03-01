import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
record City(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s %d", name, distance);
    }
}
public class LinkedListChallenge {
    public static void main(String[] args) {
        LinkedList<City> cities = new LinkedList<>();

        addCity(cities, new City("Sydney", 0));
        addCity(cities, new City("Adelaide", 1374));
        addCity(cities, new City("Alice Springs", 2771));
        addCity(cities, new City("Brisbane", 917));
        addCity(cities, new City("Darwin", 3972));
        addCity(cities, new City("Melbourne", 877));
        addCity(cities, new City("Perth", 3923));
        printCities(cities);


        var iterator = cities.listIterator();
        boolean flag = true;
        boolean forward = true;
        Scanner scanner = new Scanner(System.in);
        printMenu();
        while (flag) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter Value: ");
            switch (scanner.nextLine().toUpperCase().substring(0, 1)) {
                case "F" -> {
                    if (!forward) {             // Reverse direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();    // Adjust position forward
                        }
                    }
                    moveForward(cities, iterator);
                }
                case "B" -> {
                    if (forward) {                  // Reverse direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();    // Adjust position backward
                        }
                    }
                    moveBackward(cities, iterator);
                }
                case "L" -> printCities(cities);
                case "M" -> printMenu();
                default -> flag = false;
            }
        }
    }

    private static void addCity(LinkedList<City> list, City city) {
        if (list.contains(city)) {
            System.out.println("Found duplicate: " + city);
            return;
        }

        for (City c : list) {
            if (c.name().equalsIgnoreCase(city.name())) {
                System.out.println("Found duplicate: " + city);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listCity : list) {
            if (city.distance() < listCity.distance()) {
                list.add(matchedIndex, city);
                return;
            }
            matchedIndex++;
        }

        list.add(city);
    }

    public static void printCities(LinkedList<City> list) {
        System.out.println(list);
    }

    public static void moveForward(LinkedList<City> list, ListIterator<City> iterator) {
        if (iterator.hasNext()) {
            System.out.println(iterator.next());
        } else {
            System.out.println("Reached the end");
        }
    }

    public static void moveBackward(LinkedList<City> list, ListIterator<City> iterator) {
        if (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        } else {
            System.out.println("Reach the start");
        }
    }

    public static void sort(LinkedList<City> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).distance() > list.get(i+1).distance()) {
                City temp = list.get(i);
                list.add(i, list.get(i+1));
                list.remove(i+2);
            }
        }
    }

    private static void printMenu() {
        String textBlock = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit""";
        System.out.println(textBlock);
    }
}


