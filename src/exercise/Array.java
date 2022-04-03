package exercise;

import java.util.ArrayList;
import java.util.List;

public class Array {
    /*
    /* write a return method that accepts 2 integer Arrays as parameters
 * And adds 2 array into a new Array and prints it.
 *(Parametre olarak 2 tamsayi diziyi kabul eden ve
 *iki diziyide yeni bir diziye ekleyen ve onu yazdiran bir method yazin)
 * Input1={0,1,2,3,4,5}       Input2={6,7,8,9,10}
 * Output={0,1,2,3,4,5,6,7,8,9,10}
     */
    public static void main(String[] args) {
         int arr1 [] ={0,1,2,3,4,5};
         int arr2 [] ={6,7,8,9,10};
        List<Integer> newList = new ArrayList<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            newList.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            newList.add(arr2[i]);
        }
        System.out.println(newList);


    }
}
