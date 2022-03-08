package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir String girin : ");
        String str1 = scan.next();
       // String control = str1.contains(" ");
        if(str1.contains(" ")){
            System.out.println("girilen String bosluk icerir");
        }
        if(str1.length()==0){
            System.out.println(" bos string icerir");
        }else
            System.out.println("String iniz bos degil");
    }

}