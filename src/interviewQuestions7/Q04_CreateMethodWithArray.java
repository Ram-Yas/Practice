package interviewQuestions7;

import exercise.Array;

import java.util.Arrays;

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

        int array[] = new int[5];

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        birinciMethod(array);
        System.out.println();
        ikinciMethod(array);
        ucuncuMethod(array);

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
