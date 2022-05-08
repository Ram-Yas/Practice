package interviewQuestions7;

import exercise.Array;
import interviewQuestions2.JavaMathClassMethods;

import java.util.Arrays;
import java.util.Random;



public class Q04_CreateMethodWithArray {

    //    ||This Part Should be in Main Method||
    //
    //     -Create an array of size 5, assign some random values from 0 to 10
    //     -(use random class and for loop to assign values)
    //
    //
    //    ||You should create public static void methods fori loop (Parameter should be int Array for methods)||
    //
    //     -1-Create a method that prints array like "2 3 1 10 2", space between elements of array
    //     -2-Create a method that prints the sum of an array
    //     -3-Create a method that prints the max element of an array
    //
    //    P.S: Return type should be void because we are not returning anything just printing

    public static void main(String[] args) {
        Random rand = new Random();
        int array[] = new int[5];

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            // array[i] = (int) (Math.random() * 10);
            // Math random double dir. 0 ile 1 arasi sayi olusturur
            //Random class'i 1'den baslar
            array[i] = rand.nextInt(10); // array'in elemanlarina  0-10 arasi sayi atamasi yapar
        }
        System.out.println(Arrays.toString(array));
        birinciMethod(array);
        System.out.println();
        ikinciMethod(array);
        ucuncuMethod(array);
        printArray(array);
        System.out.println();
        printSum(array);
        printMaxValue(array);

    }

    public static void printMaxValue(int[] array) {
        int maxDeger = array[0];
        for (int i = 1; i < array.length; i++) {
            maxDeger = Math.max(array[i], maxDeger); // burada karsilastirma yapacak array'in i elemani ile max degeri karsilastiriyor
                                                    // hangisi buyukse o maxDeger aoluyor
        }
        System.out.println("Array'in maxDegeri : "+maxDeger);
    }

    public static void printSum(int[] array) {
        int toplam=0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        System.out.println("Array'in toplami : "+ toplam);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    // lambda expressions are used in these methods
    private static void ucuncuMethod(int[] array) {
        System.out.print("Array'in max elemani :");
        System.out.println(Arrays.stream(array).max());
    }

    private static void birinciMethod(int[] array) {
        System.out.print("Array'in  elemanilari  :");
        Arrays.stream(array).forEach(t -> System.out.print(t + " "));
    }

    public static void ikinciMethod(int[] array) {
        System.out.print("Array'in toplami : ");
        System.out.println(Arrays.stream(array).sum());
    }

}
