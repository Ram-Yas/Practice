package practice_basic_day02;

import java.util.Scanner;

public class Q04_SwitchCase02 {
        /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */
        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Lutfen \nA icin 1\nB icin 2\nC icin 3 seciniz");
                int secim = scan.nextInt();

                switch (secim){
                        case 1 : System.out.println("Java is easy"); break;
                        case 2 : System.out.println("Java is fun"); break;
                        case 3 : System.out.println("I need to study :)"); break;
                        default:
                                System.out.println("Lutfen dogru bir secim yapiniz");
                }
        }
}
