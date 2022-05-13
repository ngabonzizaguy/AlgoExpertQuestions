package AlgoexpertQuestions.Arrays;

import java.util.*;

public class ArrayOfProducts {

    public static void main(String[] args) {
        int[] input = new int[] {5, 1, 4, 2};
        int[] output = new int[input.length];
        

        for(int i = 0; i < input.length; i++) {
            int product = 1;
            for(int j = 0; j < input.length; j++) {
                if(i != j) {
                    product = product * input[j];
                }
                output[i] = product;
            }
        }

        System.out.print(Arrays.toString(output));
    }
    
}
