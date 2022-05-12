import java.util.*;

public class spiralTraverse {    
    public static void main(String[] args) {
        //code
        int[][] array = new int[][] {
            /**
             * ===============
             * startRow:  sR |
             * endRow:    eR |
             * startCol:  sC |
             * endCol:    eC |
             * col:       c  |
             * row:       r  |
             * ===============
             * 
             * while keeping track of the first row[sR], 
             * we create another variable[c] that iterates thru the elements in that row
             * till it reaches the last element[eC] of that row:
             * =================
             * |            eC |
             * |sR{1, 2, 3, 4} |
             * |   c++ ->  (-1)|
             * =================
             * 
             * 
             * After hitting the last col[eC] element, we go down by incrementing sR's index by 1
             * and create a variable[r] that iterates thru the elements in that col till it 
             * reaches the last row[eR] of that column:
             * ========================
             * |            eC        |
             * |sR  {1, 2, 3, 4}      |
             * | +1 {12, 13, 14, 5} r |
             * ========================
             * 
             */
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7},
            // {1, 5},
            // {2, 6},
            // {3, 7},
            // {4, 8}
        };

        var result = new ArrayList<Integer>();
        var startRow = 0;
        var endRow = array.length - 1; 
        var startCol = 0;
        var endCol = array[0].length - 1;

        while(startRow <= endRow && startCol <= endCol) {
            for(int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);
            }
            
            for(int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }

            for(int col = endCol - 1; col >= startCol; col--) {
                if(startRow == endRow) break;
                result.add(array[endRow][col]);
            }

            for(int row = endRow - 1; row > startRow; row--) {
                if(startCol == endCol) break;
                result.add(array[row][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        System.out.println(result);

    }    
}
/**
 *       sC       eC
    sR  {1, 2, 3, 4},
        {12, 13, 14, 5},
        {11, 16, 15, 6},
    eR  {10, 9, 8, 7},

    {1, 5},
    {2, 6},
    {3, 7},
    {4, 8}

 */