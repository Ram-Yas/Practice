package interviewQuestions1;


import java.util.Scanner;

public class Q02 {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String kelime = scan.nextLine();
        System.out.print("bir sayi girin: ");
        int sayi = scan.nextInt();

        System.out.println("ilk son harf istenen sayida : "+ilkSonHarfYazdir(kelime, sayi));


    }//main sonu

    private static String ilkSonHarfYazdir(String kelime, int sayi) {

        String s = kelime.substring(0,1)+ kelime.substring(kelime.length()-1);
        String b = "";

        for (int i = 0; i < sayi; i++) {
            b+=s; // b=b+s
        }

        return b;
    }


}
