package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi girin : ");
        String name = scan.next();
        String surname = scan.next();

        if (name.length()<surname.length()){
            System.out.println("Soyisminiz isminizden daha uzundur");
        }else if(name.length()>surname.length()){
            System.out.println("isminiz soyisminizden daha uzundur");
        }else if(name.length()==surname.length()){
            System.out.println("isminiz ve soyisminizin uzunlugu esittir");
        }else System.out.println("boyle birsey yok  ");

    }

}
