public class MethodChallenge {
    public static void main(String[] args) {
        int[] playerScores;
        playerScores = new int[]{1500, 1000, 500, 100, 25};

        String[] playNames;
        playNames = new String[]{"Tim","Bob", "Percy", "Gilbert", "James"};

        for (int i = 0; i <= 4; i++) {
            int playScore = playerScores[i];
            String playerName = playNames[i];
            int position = calculateHighScorePosition(playScore);
            displayHighScorePosition(playerName, position);
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName
                + " managed to get into position "
                + position
                + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
