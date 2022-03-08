package practice_basic_day02;

import java.util.Scanner;

public class Q03_SwitchCase01 {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gun numaranizi girin");
        int gun = scan.nextInt();

        switch (gun){
            case 1:
            case 2:
                System.out.println("Java dersi gunleri");
                break;
            case 4 :
            case 5:
                System.out.println("Selenyum dersi gunleri");
                break;
            case 3:
            case 6 :
                System.out.println("SQL dersi gunleri"); break;
            default:
                System.out.println("izin gunu");
        }









    }
}
