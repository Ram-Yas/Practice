package interviewQuestions5;

import java.util.Scanner;

public class Q04_PrintVowelsOfString {
    //Get String from user and print just vowels(aeiou) inside String on the console

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir string giriniz: ");
        String str = scan.nextLine().toLowerCase(); // sadece kucuk harfleri istediginden lowerCase yaptik

        String vowels = "aeiou";
        String arr [] =str.split("");

        System.out.println("1.yol ile while loop");
        //1.yol
        int index = 0;

        while (index < str.length()){
            char c = str.charAt(index);
            if (c== 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u') {
                System.out.print(c);
            }
            index++; //indexi artirarak donguye devam eder
        }
        System.out.println();
        System.out.println("2.yol replaceAll methodu ile ");
        //2.yol

        String s = str.replaceAll("[^aeiou]", "");
        // [] icersiindeki butun karakterlere islem yapar
        //^ : yanindaki karkaterlerin disindakileri alir
        System.out.println(s);
    }
}
