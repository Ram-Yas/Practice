package interviewQuestions6;

import java.util.ArrayList;
import java.util.Arrays;

public class Q06_DuplicateValue {

        /* Write a code that returns the duplicate chars in a String array.(interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
        */

    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        char [] arr = str.toCharArray(); // her bir karakter bir arreye donusturur
        System.out.println("Arrays.toSting(arr) = "+ Arrays.toString(arr));
        //Arrays.toSting(arr) = [J, a, v, a, i, s, a, l, s, o, e, a, s, y]

        ArrayList<Character> output = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) { // arr'deki her bir elemena bakar
            for (int j = i+1; j <arr.length ; j++) { // her bir elemana bakarken bir onraki ile karsilastirir
                if (arr[i]==arr[j] && !output.contains(arr[j])) { // ayni elemandan varsa ve istedigin output'ta yoksa
                    System.out.println(arr[j]); // o elemani yazdir
                    output.add(arr[j]); // output'a ekle
                }
            }
        }

        System.out.println(output);


    }
}
