package interviewQuestions8;

import java.util.*;

public class Q07_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir

    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        Random rand = new Random(); // random cass'indan random objesi olusturudlu
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println("arr = "+Arrays.toString(arr));
        List<Integer> arraydanListeDonusum = new ArrayList<>(Arrays.asList(arr));
        System.out.println("arraydanListeDonusum = " + arraydanListeDonusum);

        Set<Integer> listtenSetElements = new HashSet<>(arraydanListeDonusum); // listin elemanlari set'e atandi
        System.out.println("listtenSetElements = " + listtenSetElements);


    }
}