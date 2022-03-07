package practice_basic_day02;

import java.util.Scanner;

public class Q02_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {
        /*Scanner scn  = new Scanner(System.in);
        System.out.println("lurfen finql notunu girin");
        int finalNot = scan.nextInt();*/
        char finalNotu = 'A';
        //String finalNot = "";
        String sonuc = "";
        sonuc = (finalNotu=='A'? "Gayet Basarili" :
                (finalNotu=='B' ? "Basarili":
                (finalNotu=='C' ? "Ha gayret": "digerleri")) );
        System.out.println("result : "+ sonuc);





    }
}
