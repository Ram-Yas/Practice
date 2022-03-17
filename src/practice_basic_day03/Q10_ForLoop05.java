package practice_basic_day03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q10_ForLoop05 {
    /*        Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
              ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
              hesaplayan kodu yazınız.

             Örnek Ekran Çıktısı
             Girilen sayı=4
             Kareler toplamı=14
          */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1 den buyuk bir sayi girin: ");
        int sayi1 = scan.nextInt();
        int kare;
        int toplam = 0;
        for (int i = 1; i < sayi1; i++) {
            kare = i * i;
            toplam += kare;

        }
        System.out.println("Girilen sayi :"+sayi1);
        System.out.println("KAreler toplami : " +toplam);
    }


}
