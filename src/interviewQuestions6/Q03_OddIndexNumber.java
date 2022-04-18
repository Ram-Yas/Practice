package interviewQuestions6;

import java.util.Scanner;

public class Q03_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str = scan.nextLine();

        int index= 0;

        do{
            if (index%2==1){
                System.out.print(str.charAt(index)+" "); //tek sayiya sahip olan indexdeki karakterleri yan yana yazdik
            }
            index++;
        }while (index<str.length());

        //2. cozum

        System.out.println();
        for (int i = 0; i < str.length(); i++) {

            if (i%2==1){
                System.out.print(str.charAt(i)+" ");
            }

        }
    }

}
