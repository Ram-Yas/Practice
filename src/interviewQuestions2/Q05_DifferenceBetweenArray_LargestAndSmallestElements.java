package interviewQuestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {

      /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

    public static void main(String[] args) {

        arrayOlustur();

    }
    private static void arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("array'in uzunlugunu giriniz");
        int uzunluk = scan.nextInt();

        int arr [] = new int[uzunluk];

        for (int i = 0; i < uzunluk; i++){
            System.out.print("arrayin "+ (i+1)+ " elemanini giriniz");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("arr[son eleman] -  arr[ilk eleman]: "+ (arr[uzunluk-1]-arr[0]));
    }

}

