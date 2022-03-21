package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

        int sayi =345;
        int rakam =0;
        int toplam =0 ;

        while (sayi>0){
            rakam =sayi%10;
            toplam +=rakam;
            sayi/=10;
        }
        System.out.println(toplam);
    }




}