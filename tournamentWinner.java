import java.util.*;

public class tournamentWinner {
     public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<String> team1 = new ArrayList<>();
        team1.add("Html");
        team1.add("C#");
        ArrayList<String> team2 = new ArrayList<>();
        team2.add("C#");
        team2.add("Python");
        ArrayList<String> team3 = new ArrayList<>();
        team3.add("Python");
        team3.add("Html");

        var competitions = new ArrayList<ArrayList<String>>();
        competitions.add(team1);
        competitions.add(team2);
        competitions.add(team3);

        result.add(0);
        result.add(0);
        result.add(1);

        for(Integer r: result) {
            System.out.println(r*2);
        }
    }
}

/**
 * => competitions [
 *      ["Html", "C#"], 
 *      ["C#", "Python"], 
 *      ["Python", "Html"]
 * ]
 * 
 * => results[0, 0, 1]
 * => Winner: "Python" - 6 points (3+3)
 * 
 * ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
 * private homeTeam = 1;
 * private awayTeam = 0;
 */