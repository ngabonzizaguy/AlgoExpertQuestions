import java.util.*;

public class nonConstructible {
    public static void main(String[] args) {
        // code
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        Arrays.sort(coins);
        int change = 0;

        for(int c: coins) {
            if(c > change + ) {
                change += 1;
            }
            change += c;
        }

        System.out.println("Change: "+(change + 1));
    }
}
