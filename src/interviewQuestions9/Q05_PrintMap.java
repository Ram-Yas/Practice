package interviewQuestions9;


import java.util.HashMap;

public class Q05_PrintMap {
    /*
        Hashmap ile 1 den 6 ya kadar sayilari sayi ve okunusu seklinde yazdirin
    */
    public static void main(String[] args) {

        HashMap<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(1,"Bir");
        numbers.put(2,"Iki");
        numbers.put(3,"Uc");
        numbers.put(4,"Dort");
        numbers.put(5,"Bes");
        numbers.put(6,"Alti");
        System.out.println("numbers map = " + numbers);

        for (Integer each: numbers.keySet()         ) {
            System.out.println(each+ " = "+ numbers.get(each));
        }
    }
}
