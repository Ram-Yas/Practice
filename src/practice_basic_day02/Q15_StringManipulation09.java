package practice_basic_day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin: ");
        String word = scan.next();

        if(word.length()>3 && word.length()%2==1){
            System.out.println("Kelimenin ortasindaki harf : "+word.charAt(word.length()/2));
        } else{
            System.out.println("Sozcuk tek sayida karakter icermez...");
        }

    }
}