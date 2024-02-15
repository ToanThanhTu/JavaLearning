public class Switch {

    public static void main(String[] args) {
        String month = "xyz";
        System.out.println(month + " is in the " + getQuarters(month) + " quarter");
    }

    public static void Switch() {
        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5 -> {
                System.out.println("Value is 3, 4, or 5");
                System.out.println("Actually it is a " + switchValue);
            }
            default -> System.out.println("Is not 1, 2, 3, 4, or 5");
        }
    }

    public static String getQuarters(String month) {
        return switch (month) {
            case "Jan", "Feb", "Mar" -> "1st";
            case "April", "May", "Jun" -> "2nd";
            case "Jul", "Aug", "Sept" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

}
