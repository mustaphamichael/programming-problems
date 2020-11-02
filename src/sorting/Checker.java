package sorting;

import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Check implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // sort the players by score, then by name in descending order
        if (a.score < b.score) return 1;
        else if (a.score == b.score) return a.name.compareTo(b.name);
        else return -1;
    }
}

// Test
public class Checker {
    public static void main(String[] args) {
        Player p1 = new Player("Smith", 20);
        Player p2 = new Player("Jones", 15);
        Player p3 = new Player("Jones", 20);
        Player[] player = {p1, p2, p3};
        Check check = new Check();

        Arrays.sort(player, check);
        for (Player value : player) {
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}
