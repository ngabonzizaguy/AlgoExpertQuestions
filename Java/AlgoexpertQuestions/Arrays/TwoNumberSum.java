package AlgoexpertQuestions.Arrays;

import java.util.*;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] array = new int[] {3, 5, -4, 11, 1, -1, 6};
        System.out.println(Arrays.toString(twoNumberSum(array, 10)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);

        targetSum = 10;
        int currentSum = 0;

        int right = array.length - 1;
        int left = 0;

        while(left < right) {
            currentSum = array[left] + array[right];
            if(currentSum == targetSum) {
                return new int[] {array[left], array[right]};
            } else if(currentSum < targetSum) {
                left++;
            } else if(currentSum > targetSum) {
                right--;
            }
        }

        return new int[0];
    }
}
