package interviewQuestions7;

import java.util.Arrays;

public class Q06_PrintArray {
    
    // Create a method which takes String array as a parameter
    // and prints all the element


    public static void main(String[] args) {

        String[] array = {"veli", "ali", "omer", "faik", "can"};
        String arabalar[] = {"Honda", "Toyota", "Porsche","Tesla","BMW"};
        String renkler [] = {"sari", "mavi", "lacivert", "kirmizi","turuncu","beyaz", "yesil","siyah"};
        // bunu burada olusturmamizin sebebi ayni methodla farkli arraylarin de kullanilabilecegi gibi
        //array turu ayni olursa eleman sayisi fazl olsa da sikinti olmaz.ama string ise string, integer ise integer
        // int[] array2 = {1,2,23,5,7,8,6,9,4};

        arrayPrint(array);
        System.out.println();
        printElements(arabalar);
        arrayPrint(renkler);

    }

    private static void printElements(String[] arabalar) {
        for (int i = 0; i < arabalar.length; i++) {
            System.out.print(arabalar[i]+ " "); // Honda Toyota Porsche Tesla BMW
        }
        System.out.println();
    }

    private static void arrayPrint(String[] array) { // with lambda expressions
        Arrays.stream(array).forEach(t->System.out.print(t+" "));
    }
}
