package exercise;

public class ForEach {

    public static void main(String[] args) {
        /*Soru 1:
        Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        */

        int array[] = {5,3,2,1,4,6,8};

        int sonuc=1;

        for (int each:array
             ) {
            sonuc*=each;
        }

        System.out.println("sonuc = " + sonuc);
    }
}
