package exercise;

public class WhileLoop {

    public static void main(String[] args) {

        /*Soru 1 ) While loop kullanarak 3 den 13 e kadar
        tum tek tamsayilari ekrana yazdiriniz.*/

        int baslangic = 3;
        int bitis = 13;

        while (baslangic <= bitis) {
            if (baslangic % 3 == 0) {
                System.out.print(baslangic + " ");
            }

            baslangic++;
        }

    }
}
