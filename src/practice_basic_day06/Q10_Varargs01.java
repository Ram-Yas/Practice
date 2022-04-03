package practice_basic_day06;

public class Q10_Varargs01 {

    // istedigimiz kadar sayi girdigiimizde
    // toplamlari bize veren bir method yazalim...
    public static void main(String[] args) {
        // Not ; Var-args ---> Arguman cesitliligi
        // Var --->variety args--->arguments

        int sayi1 = 10;
        int sayi2 = 15;
        int sayi3 = 20;
        int sayi4 = 25;

        istedigimKadarSayiTopla( sayi1,  sayi2,  sayi3,  sayi4);

    }

    private static void istedigimKadarSayiTopla(int ... sayi) {

        int toplam = 0;
        for (int each:sayi
             ) {
            toplam+=each;
        }
        System.out.println("verilen sayilarin toplami"+toplam);
    }

}
