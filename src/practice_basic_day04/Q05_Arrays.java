package practice_basic_day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        int arr[] = new int[8];
        // System.out.println(Arrays.toString(arr));
        Scanner scan = new Scanner(System.in);
        System.out.print("dizinin elemanlarini grin : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sayac++;
            }
        }
        System.out.println("verilen dizide "+ sayac + " tane uce bolunebilen sayi vardir");

    }
}
