package AlgoexpertQuestions.Arrays;

import java.util.*;

public class mergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = new int[][] {{1, 2}, {3, 5}, {4, 7}};

        int[][] sortedIntervals = intervals.clone(); // clone intervals
        //sort intervals based on first interval element
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        //create empty merged intervals and add in the first current interval
        List<int[]> mergedIntervals = new ArrayList<int[]>();
        int[] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);

        for(int[] nextInterval: sortedIntervals) {
            int currentIntervalEnd = currentInterval[1]; // [1, (2)]
            int nextIntervalStart = nextInterval[0]; // [(3), 5]
            int nextIntervalEnd = nextInterval[1]; // [3, (5)]

            if(currentIntervalEnd >= nextIntervalStart) {
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }

        System.out.println(mergedIntervals.toArray(new int[mergedIntervals.size()][]));
    }
}
