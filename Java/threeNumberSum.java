import java.util.*;

public class threeNumberSum {
    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
		ArrayList<Integer[]> triplets = new ArrayList<>();
	    
        Arrays.sort(array);     // {-8, -6, 1, 2, 3, 5, 6, 12}

        int targetSum = 0;


		for(int i = 0; i < array.length - 2; i++) {     // [i=0, 0 < 6, 0] -- [i=1, 1 < 6, 1], ...
			int left = i + 1;       // left = 0+1 [1] -- 2 -- 3 -- 4
			int right = array.length - 1;       // right = 7 -- 6 -- 5, ...
			
			while(left < right) {    // 1 < 7 -- 2 < 7 -- 3 < 6 -- 4 < 5 -- 4 < 4, ...
				int currentSum = array[i] + array[left] + array[right];   // Cs = -8 + -6 + 12 -- Cs = -8 + 1 + 12 -- Cs = -8 + 2 + 6 -- Cs = -8 + 4 + 5, ...
				if(currentSum == targetSum) {    // -2 == 0 -- 5 == 0 -- 0 == 0 -- 1 == 0, ...
					Integer[] newTriplet = {array[i], array[left], array[right]};   // newTriplet = {-8, 2, 6}, ...
					triplets.add(newTriplet);   // [-8, 2, 6], ...
					left++;     // 4
					right--;    // 5
				} else if(currentSum < targetSum) {     // -2 < 0 
					left++;     // left = 1 + 1 [2]
				} else if(currentSum > targetSum) {     // 5 > 0 -- 1 > 0
					right--;    // right = 7 - 1 [6] -- [4]
				}
			}
		}
        System.out.println(triplets);
    }  
}
