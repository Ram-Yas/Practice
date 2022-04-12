package interviewQuestions3;

import java.util.Scanner;

public class Q02_Palindrome {
      /*
        Crteate a program checks if a String is PALINDROME or not.
        If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
        For Example : "madam" or "nursesrun" .
        Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
        polindrome :tersten okunuşu da aynı olan ifadeierdir.
        ornek : Ey edip Adanada pide ye,  Traş niçin şart
         */


    public static void main(String[] args) {

        //String str = "Ey edip Adanada pide ye";
        //String str = "Traş niçin şart";
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String ifade girin: ");
        String str = scan.nextLine();

        palindromeWithStringBuilder(str);
        palindromeWithForLoop(str);


        //
    }


    private static void palindromeWithStringBuilder(String str) {
        StringBuilder strReverse = new StringBuilder(); // StringBuilder strReverse = new StringBuilder(str); this is the shortcut. variable and assign at the same time

        strReverse.append(str);//adding str to StringBuilder
        String strTers = strReverse.reverse().toString(); // we change the direction of the letters with reverse method of stringBuilder and to changer it to String

        if (str.toLowerCase().equals(strTers.toLowerCase())) {//  if (str.equalsIgnoreCase(strTers)) these are the same things

            System.out.println("This sentence is palindrome->" + strTers);
        } else System.out.println("This sentence is not palindrome");

    }//end of method

    private static void palindromeWithForLoop(String str) {
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);
        }
        System.out.println("tersStr = " + tersStr);
        if  (str.equalsIgnoreCase(tersStr)) {//  if (str.equalsIgnoreCase(strTers)) these are the same things

            System.out.println("This sentence is palindrome->" + tersStr);
        } else System.out.println("This sentence is not palindrome");

    }

}
