package practice_basic_day04;

import java.util.*;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        List<Integer> sayi = new ArrayList<>();
        sayi.add(1);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);
        sayi.add(5);
        sayi.add(6);
        sayi.add(7);
        sayi.add(8);
        sayi.add(25);
        sayi.add(18);

        System.out.println(sayi);

        Scanner scan = new Scanner(System.in);
        System.out.print("en buyuk kac sayiyi istiyorsun ? ");
        int number = scan.nextInt();

        Collections.sort(sayi);
        Collections.reverse(sayi);
        for (int i = 0; i < number; i++) {
            System.out.print((sayi.get(i))+ " ");
        }
    }

}
