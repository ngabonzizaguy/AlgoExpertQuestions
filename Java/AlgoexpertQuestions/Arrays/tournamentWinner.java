package AlgoexpertQuestions.Arrays;

import java.util.*;

public class tournamentWinner {
    public static void main(String[] args) {
        ArrayList<String> cpt1 = new ArrayList<>(Arrays.asList("Html", "C#"));
        ArrayList<String> cpt2 = new ArrayList<>(Arrays.asList("C#", "Python"));
        ArrayList<String> cpt3 = new ArrayList<>(Arrays.asList("Python", "HTml"));
        ArrayList<Integer> results = new ArrayList<>(Arrays.asList(0, 0, 1));
        HashMap<String, Integer> scores = new HashMap<>();
        ArrayList<ArrayList<String>> competitions = new ArrayList<>(Arrays.asList(cpt1, cpt2, cpt3));
        ArrayList<String> competition = new ArrayList<>();

        // algoExpert code
        String currentTeam = "";
        String bestTeam = "";
		scores.put(currentTeam, 0);

        for(int i = 0; i < competitions.size(); i++) {
            competition = competitions.get(i);
            int result = results.get(i);

            String hometeam = competition.get(0);
            String awayteam = competition.get(1);

            bestTeam = (result == 1) ? hometeam : awayteam;

            updateScores(bestTeam, 3, scores);

            if(scores.get(bestTeam) > scores.get(currentTeam)) {
                currentTeam = bestTeam;
            }
        }

        System.out.println("Winning Team: "+currentTeam);
		
    }

    public static void updateScores(String team, int points, HashMap<String, Integer> scores) {
        if(!scores.containsKey(team)) {
            scores.put(team, 0);
        }
        scores.put(team, scores.get(team) + points);
    }
}

// my_code:
/** 
for(int i = 0; i < competitions.size(); i++) {
    competition = competitions.get(i);
    int result = results.get(i);
    int points = 3;

    String homeTeam = competition.get(0);
    String awayTeam = competition.get(1);
    
    if(result == 1) {
        currentTeam = homeTeam;
        if(scores.containsKey(currentTeam)) {
            scores.put(currentTeam, scores.get(currentTeam) + points);
        } else {
            scores.put(currentTeam, 0);
        }
    } else {
        currentTeam = awayTeam;
        scores.put(currentTeam, 0);
    }
}
*/