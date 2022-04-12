package interviewQuestions4;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_HackerLanguage {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
   Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
   s -> 5
   a -> 4
   e -> 3
   i -> 1
   o -> 0
   Test data
   hackerDili("java ile hersey guzel")
   j4v4 1l3 h3r53y guz3l
   İpucu harfleri değiştirin ve ekrana yazdırın.

     */



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir cumle giriniz : ");
        String sentence = scanner.nextLine();

        hackerDili(sentence);
        
    }

    private static void hackerDili(String sentence) {

        String arr[] = new String[sentence.length()];

        for (int i = 0; i <sentence.length(); i++){
            arr[i]= sentence.substring(i,i+1); //substring'i karakteri almak icin kullandik
            System.out.print(arr[i]);
        }
        System.out.println(); //bundan sonraki satirda gelenler birlesmesinler diye sout attik

        for (int i = 0; i < sentence.length(); i++) {
            if (arr[i].contains("s")){
                arr[i]="5";
            }
            if (arr[i].contains("a")){
                arr[i]="4";
            }
            if (arr[i].contains("e")){
                arr[i]="3";
            }
            if (arr[i].contains("i")){
                arr[i]="1";
            }
            if (arr[i].contains("o")){
                arr[i]="0";
            }
            System.out.print(arr[i]);
        }


    }
}
