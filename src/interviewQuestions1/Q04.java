package interviewQuestions1;


import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pin = "said.12345";
        int girisHakki = 4;

        System.out.println("***Hosgeldiniz***");
        while (true) {  //while dongusu dogru oldugu surece. buradaki break ler onemli,
                        // koymazsak sonsuz dongu olur
            System.out.println("pin kodu giriniz : ");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("kalan giris hakkiniz " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi.. Sim kartiniz bloke oldu");
                break;

            }
        }

    }

}
