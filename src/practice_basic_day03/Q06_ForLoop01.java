package practice_basic_day03;

public class Q06_ForLoop01 {

    /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13       */

    public static void main(String[] args) {
        int baslangic = 100;
        int toplam = 0;

        for (int i = baslangic; i > 0; i--) {
            {
                if (baslangic % 13 == 0) {
                    System.out.println(baslangic);
                    toplam += baslangic;
                    baslangic--;
                } else baslangic--;
            }

        }
        System.out.println(toplam);
    }
}