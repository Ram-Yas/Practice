package interviewQuestions8;

import java.util.*;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        //Listler'de iki turlu ekleme olabiliyordu. Birincisi yukaridaki gini Arrays.asList seklinde. digeri de add ile
        //numberList.add(1); bu da ikinci ekleme methodu
        System.out.println(numberList);
        int tekrarliElemanSayisi =0;

        Set<Integer> uniqueElemanlar = new HashSet<>();
        List<Integer> tekrarliElemanlar = new ArrayList<>();

        for (int i = 0; i < numberList.size(); i++) {
            boolean ekliMi = uniqueElemanlar.add(numberList.get(i)); // ekli olma durumunu uniqueLemearlda var olmasidir
            if (!ekliMi){ // unique elemanlara eklenmediyse bu eleman duplicate'tir
                tekrarliElemanSayisi++; //bu durumda duplicate sayisi bir artar
                tekrarliElemanlar.add(numberList.get(i));// duplicate olan bu eleman tekrarliElmanlar listesine eklenir
            }
        }

        System.out.println("tekrarliElemanSayisi = " + tekrarliElemanSayisi);
        System.out.println("tekrarliElemanlar = " + tekrarliElemanlar);
    }
}