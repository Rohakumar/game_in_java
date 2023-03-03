package game_circle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        // Create a list of players
        List<String> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add("Player " + i);
        }

        // Play the game
        int currentIndex = 0;
        while (players.size() > 1) {
            System.out.println("Current players: " + players);

            // Determine the next player to remove
            int nextIndex = (currentIndex + 1) % players.size();
            System.out.println(players.get(currentIndex) + " passes the ball to " + players.get(nextIndex));

            // Remove the next player from the game
            players.remove(nextIndex);
            currentIndex = nextIndex;
        }

        // Declare the winner
        System.out.println("The winner is " + players.get(0) + "!");
    }
}