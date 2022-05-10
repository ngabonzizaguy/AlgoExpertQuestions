import java.util.*;

public class moveElementToEnd {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        int toMove = 2;
        System.out.println(MoveElementToEnd(array, toMove));
    }

    public static List<Integer> MoveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        
        /**
         * while(i < j) {...}
         * check the condition, and run the code inside until only the i & j elements collide or are equal 
         */
        while(i < j) {
            while(i < j && array.get(j) == toMove) j--; // 6
            if(array.get(i) == toMove) swap(i, j, array); // swap(2, 4, )
            i++;
        }
        return array;
    }

    public static void swap(int i, int j, List<Integer> array) {
        int temp = array.get(j); // 4
        array.set(j, array.get(i)); // 4 <- 2
        array.set(i, temp); // 2 <- 4
    }
}
