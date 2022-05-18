package AlgoexpertQuestions.Arrays;

import java.util.HashSet;

public class FirstDuplicateValue {
    public static void main(String[] args) {
        // First Solution
        int[] array = new int[] {2, 1, 5, 2, 3, 3, 4};
        
        // int minimumSecondIdx = array.length;

        // for(int i = 0; i < array.length; i++) {
        //     int value = array[i];
        //     for(int j = i + 1; j < array.length; j++) {
        //         int valueToCompare = array[j];
        //         if(value == valueToCompare) {
        //             minimumSecondIdx = Math.min(minimumSecondIdx, j);
        //         }
        //     }
        // }

        // System.out.println(array[minimumSecondIdx]);

        // if(minimumSecondIdx == array.length) {
        //     System.out.println("-1");
        // }

        // Second Solution
        HashSet<Integer> seenValues = new HashSet<>();
        for(int value: array) {
            if(seenValues.contains(value)) {
                System.out.println(value);
            }
            seenValues.add(value);
        }
        System.out.println("-1");
    } 
}
