package AlgoexpertQuestions.Arrays;

// import java.util.*;

public class LongestPeak {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        int longestPeakLength = 0;
        int i = 1;
        while(i < array.length - 1) {
            boolean isPeak = array[i - 1] < array[i] && array[i] > array[i + 1];
            if(!isPeak) {
                i += 1; 
                continue;
            }

            int leftIdx = i - 2;
            while(leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
                leftIdx -= 1;
            }

            int rightIdx = i + 2;
            while(rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
                rightIdx += 1;
            }

            int currentPeakLength = rightIdx - leftIdx - 1;
            if(currentPeakLength > longestPeakLength) {
                longestPeakLength = currentPeakLength;
            }
            
            i = rightIdx;
        }

        System.out.println(longestPeakLength);
    }
}
/**
 * 
 */