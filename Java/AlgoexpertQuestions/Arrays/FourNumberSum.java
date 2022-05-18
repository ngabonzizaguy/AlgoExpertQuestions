package AlgoexpertQuestions.Arrays;

import java.util.*;

public class FourNumberSum {
    public static void main(String[] args) {
        int[] array = new int[] {7, 6, 4, -1, 1, 2};
        int targetSum = 16;

        System.out.println(fourNumbersum(array, targetSum));
    }
    public static List<Integer[]> fourNumbersum(int[] array, int targetSum) {
        Map<Integer, List<Integer[]>> allPairSums = new HashMap<>();
        List<Integer[]> quadruplets = new ArrayList<Integer[]>();

        for(int i = 1; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                int currentSum = array[i] + array[j];
                int difference = targetSum - currentSum;
                if(allPairSums.containsKey(difference)) {
                    for(Integer[] pair: allPairSums.get(difference)) {
                        Integer[] newQuadruplet = {pair[0], pair[1], array[i]   , array[j]};
                        quadruplets.add(newQuadruplet);
                    }
                }
            }

            for(int k = 0; k < i; k++) {
                int currentSum = array[i] + array[k];
                Integer[] pair = {array[k], array[i]};
                if(!allPairSums.containsKey(currentSum)) {
                    List<Integer[]> pairGroup = new ArrayList<Integer[]>();
                    pairGroup.add(pair);
                    allPairSums.put(currentSum, pairGroup);
                } else {
                    allPairSums.get(currentSum).add(pair);
                }
            }
        }
    return quadruplets;
    }   
}
