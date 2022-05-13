package AlgoexpertQuestions.Arrays;

import java.util.*;

public class nonConstructible {
    public static void main(String[] args) {
        // code
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        
        System.out.println(getChange(coins));
    }

    public static int getChange(int[] coins) {
        Arrays.sort(coins);
        int change = 0;

        for(int c: coins) {
            if(c > change + 1) {
                return change + 1;
            }
            change += c;
        }

        return change + 1;
    }
}
