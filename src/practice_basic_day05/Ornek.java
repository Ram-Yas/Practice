package practice_basic_day05;

import java.util.Scanner;

public class Ornek {
    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */

    public static void main(String[] args) {
        String isim = "Ali";
        String soyisim = "Can";
        String tel ="91838526";

        System.out.println("isim: "+isim+ " soyisim: "+ soyisim+" telefon :" +tel );
        //isim: Ali soyisim: Can telefon :91838526
        isimDegistir (isim, soyisim,tel);
        //isim: Veli soyisim: Gul telefon :92358528
        //soyisimDegistir(soyisim); // ilk methodu create ederken kullandik
        soyisim = soyisimDegistir(soyisim);
        System.out.println("isim: "+ isim+ " yeniSoyismi: "+ soyisim+ " tel:"+ tel);
    }

    private static String  soyisimDegistir(String soyisim) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yeni soyisminizi girin");
        String yeniSoyisim = scanner.next();
        return yeniSoyisim;
    }

    public static void isimDegistir(String isim, String soyisim, String tel) {
        isim = "Veli";
        soyisim = "Gul";
        tel = "92358528";
        System.out.println("isim: "+isim+ " soyisim: "+ soyisim+" telefon :" +tel );
    }



}
