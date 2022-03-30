package interviewQuestions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {

        List<Integer> fibonacci = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz: ");
        int sayi = scan.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);

        int i = 1;
        if (sayi <= 1) {
            System.out.println("daha buyuk bir tamsayi giriniz :");
        } else {

            while (fibonacci.get(i) < sayi) { // fibonacci elemanlari sayidan kucuk oldugu surece, bir onceki eleman
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1)); // kendini ve kendinden onceki elemanni toplasin
                i++;
            }
            if (fibonacci.get(fibonacci.size()-1)>sayi){ //fibonacci'deki son eleman, sayidan buyukse
                fibonacci.remove(fibonacci.size()-1); //bu elemani kaldir
                System.out.println("girdiginiz sayi fibonacci dizisinde bulunmamaktadir. " +
                        "\nGirilen sayiya kadar fibonacci izisi: " + fibonacci);
            }else {
                System.out.println("girdiginiz sayi fibonacci dizisinde bulunmaktadir.."+ fibonacci);
            }
        }
    }
}
