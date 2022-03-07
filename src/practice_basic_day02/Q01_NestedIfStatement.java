package practice_basic_day02;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Yasiniz oy kullanmaya musait");
            if(50>age & age>=18){
                System.out.println("Bir kez oy kullanabilir");
            }else if (70>age & age>50){
                System.out.println("Iki kez oy kullanabilir");
            }else if (age>=70){
                System.out.println("uc kez oy kullanabilir");
            }
        } else if (age > 0 & age < 18) {
            System.out.println("Yasiniz oy kullanmaya musait degil");
        } else System.out.println("Lutfen gecerli bir yas girin");


    }
}


