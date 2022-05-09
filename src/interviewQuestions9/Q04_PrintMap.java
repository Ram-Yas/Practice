package interviewQuestions9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q04_PrintMap {
    /*
    10, Java
    20, PHP
    2,  Python
    57, C++
    89, C#
    40, Javascript
    Map kullanarak yazınız
     */

    public static void main(String[] args) {
        HashMap<Integer, String> programlama = new LinkedHashMap<>();
        programlama.put(10, "Java");
        programlama.put(20, "PHP");
        programlama.put(2,"Python");
        programlama.put(57,"C++");
        programlama.put(89, "C#");
        programlama.put(40,"Javascript");
        System.out.println("programlama = " + programlama);

        System.out.println("1.yol keySet'ten giderek");
        for (Integer each: programlama.keySet() // burada istersek keySet'ten istersek valusSetten istersek de entrySet'ten gidebiliriz.
                                                // bir onceki soruda enryset'ten gidildi
             ) {
            System.out.println(each + ", " +programlama.get(each));
        }

        //2. farkli yol
        System.out.println("Entry class'indan faydalanarak ");
        for (Map.Entry<Integer, String> entryYeni : programlama.entrySet()) {
            System.out.println(entryYeni.getKey()+ ", "+ entryYeni.getValue());
        }
    }
}
