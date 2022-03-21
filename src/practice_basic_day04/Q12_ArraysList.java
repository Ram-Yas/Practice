package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Listenizin uzunlugunu girin : ");
        int uzunluk = scan.nextInt();

        List<Integer> yeni = new ArrayList<>();
        System.out.print("Liste elemanlarini girin :");
        for (int i = 0; i < uzunluk; i++) {
            yeni.add(scan.nextInt());
        }

        tekrarliEleman(yeni);

           }

    private static void tekrarliEleman(List<Integer> yeni) {
        System.out.println("ilk ArrayList : "+yeni);
        List<Integer> tekrarEden = new ArrayList<>();

        for (int i = 0; i < yeni.size(); i++) { //ilk liste
            for (int j = i+1; j < yeni.size() ; j++) {//diger indexleri karsilasqtirin
                if (yeni.get(i)== yeni.get(j) && !tekrarEden.contains(yeni.get(i)))
                tekrarEden.add(yeni.get(i));
            }
           /* if (yeni.lastIndexOf(yeni.get(i))!=i){
                //LastIndexOf() method of ArrayList in Java is
                // used to get the index of the last occurence of an element in an ArrayList object
                tekrarEden.add(yeni.get(i));
            }*/
        }
        System.out.println("Tekrar eden arrayList uyeleri : "+tekrarEden);

    }
}
