package practice_basic_day04;

import java.util.Arrays;

public class Q10_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

        String arr = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz";
        String karakter[] = arr.split("");
        System.out.println(Arrays.toString(karakter));
        int sayac = 0;
        /*for (int i = 0; i < arr.length(); i++) {
            if ((arr[i]) == "") {
                sayac++;
            }
        }*/
        System.out.println(sayac);

    }
}
