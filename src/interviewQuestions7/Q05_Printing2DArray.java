package interviewQuestions7;

import java.util.Arrays;

public class Q05_Printing2DArray {

    // Print 2D String array using loops

    public static void main(String[] args) {

        String array [][] = {{"abc", "def", "ghi"}, {"xyz", "klm", "opr"}};

       for (int i = 0; i <array.length; i++){ // outer array
           for (int j = 0; j < array[i].length; j++){ // inner array
               System.out.println(array[i][j]); // sadece elemanlari yazdirir
           }
       }

       System.out.println(Arrays.deepToString(array)); // [[abc, def, ghi], [xyz, klm, opr]]
    }

}
