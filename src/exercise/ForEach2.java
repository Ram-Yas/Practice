package exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach2 {

    /*
    Soru 2:
    Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each
    loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,5,3,8,7));
        System.out.println(list);

        int sonuc = 0;
        for (int each:list
             ) {
            sonuc+= Math.pow(each,2);
        }
        System.out.println("sonuc = " + sonuc);
    }
}
