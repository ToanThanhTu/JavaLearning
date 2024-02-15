public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        int seconds = 3945;
        System.out.println(getDurationString(seconds));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds/60;
        int remainingSeconds = seconds % 60;

        return seconds + " seconds = " + getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid values";
        }
        int hours = minutes/60;
        minutes = minutes % 60;
        return hours + " hours " + minutes + " min " + seconds + " seconds";
    }
}
