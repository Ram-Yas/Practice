package practice_basic_day06;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {

        double sayi1 = 3.14;
        double sayi2 = 5.7;
        double sayi3 = 7.2;

        System.out.println(multiplyDouble(sayi1, sayi2, sayi3));


    }

    private static double multiplyDouble(double ... sayi) {

        double multiply = 1;
        for (double each:sayi
             ) {
            multiply*=each;
        }
        return multiply;
    }


}
