import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class HackerRankClimbingTheLeaderBoard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        TreeSet<Integer> scores = (TreeSet<Integer>) new TreeSet<>(ranked).descendingSet();

        List<Integer> playerRanks = new ArrayList<>();

        for (Integer rank: player) {
            if(!scores.contains(rank)){
                scores.add(rank);
                playerRanks.add(scores.headSet(rank).size()+1);
            } else {
                playerRanks.add(scores.headSet(rank).size()+1);
            }
        }

        return playerRanks;
    }

    public static void main(String[] args) {

        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));

        List<Integer> player = new ArrayList<>(Arrays.asList(5, 25, 50, 120));

        System.out.println(climbingLeaderboard(ranked, player));
    }
}
