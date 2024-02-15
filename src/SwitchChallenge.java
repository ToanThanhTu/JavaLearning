public class SwitchChallenge {
    public static void main(String[] args) {
        char c = 'F';
        System.out.println(c + " is " + charNato(c));
        printDayOfWeek(7);
        printWeekDay(7);
    }

    public static String charNato(char c) {
        return switch (c) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'D' -> "Dog";
            case 'E' -> "Easy";
            default -> "not found";
        };
    }

    public static void printDayOfWeek(int day) {
        System.out.println(day + " stands for " + switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        });
    }

    public static void printWeekDay(int day) {
        String weekDay = "Invalid Day";

        if (day == 0) {
            weekDay = "Sunday";
        }
        else if (day == 1) {
            weekDay = "Monday";
        }
        else if (day == 2) {
            weekDay = "Tuesday";
        }
        else if (day == 3) {
            weekDay = "Wednesday";
        }
        else if (day == 4) {
            weekDay = "Thursday";
        }
        else if (day == 5) {
            weekDay = "Friday";
        }
        else if (day == 6) {
            weekDay = "Saturday";
        }

        System.out.println(day + " stands for " + weekDay);
    }

}
