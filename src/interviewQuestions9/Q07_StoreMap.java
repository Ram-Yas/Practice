package interviewQuestions9;


import java.util.HashMap;
import java.util.Scanner;

public class Q07_StoreMap {
    /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

    public static void main(String[] args) {
        String secim ="";
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, HashMap<String,String>> kisiListesi = new HashMap<>();
        //keys          values

        do {

            HashMap<String, String> kisiBilgileri = new HashMap<>();

            System.out.print("Adinizi ve soyadinizi giriniz : ");
            kisiBilgileri.put("isim", scan.nextLine()); //kullanicindan alinan isim direk map'de isim key'inin value'suna karsilik gelsin

            System.out.print("adresinizi giriniz : "); //kullanicindan alinan adres direk map'de adres key'inin value'suna karsilik gelsin
            kisiBilgileri.put("adres", scan.nextLine());

            System.out.print("Telefon numaranizi girin : "); //kullanicindan alinan tel direk map'de tel key'inin value'suna karsilik gelsin
            kisiBilgileri.put("telefon" ,scan.nextLine());

            System.out.print("kimlik no giriniz: ");   // icice yapi var. kullanicidan alinan bilgiler kimlik nosuna gore sekilendigi icin ,
            // kisilistesindeki kimlik no, diger kisibilgilerini bunyesinde barindiriyor
            kisiListesi.put(scan.nextInt(),kisiBilgileri); // kimik no'yu kisilistesi map'ine ekledik
            //brada kmlik no --> key(), kisibilgiler --> values

            scan.nextLine(); // dongunun sorunsuz bir sekilde devam etmesi icin dummy atildi
            System.out.println("kisiBilgileri = " + kisiBilgileri);
            System.out.println("kisiListesi = " + kisiListesi);
            System.out.print("Devem etmek istiyor musunuz: E/H ");
            secim = scan.next();

        }while(secim.equalsIgnoreCase("E"));

        System.out.print("gormek istediginiz kisinin kimlik numarasini girniz : ");
        System.out.println(kisiListesi.get(scan.nextInt()));
    }
}
