package exercise;

public class While03 {
    public static void main(String[] args) {

        /*Soru 3 ) Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degeri ve bitis degeri dahil
        aradalarindaki tum cift tamsayilari
        while loop kullanarak ekrana yazdiriniz.*/

        int baslangic = 20;
        int bitis = 30;
        int ciftSayi;
        while (baslangic <= bitis) {

            if (baslangic % 2 == 0) {
                if(baslangic==bitis) {
                    System.out.print(baslangic);
                }
                else                     System.out.print(baslangic + ", ");

            }
            baslangic++;

        }

    }
}
