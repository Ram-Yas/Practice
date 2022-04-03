package exercise;

public class ForEach3 {
    /*
     Soru 3:
    iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop
    kullanarak bulunuz. Sonucu ekrana yazdiriniz.
    Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
     */

    public static void main(String[] args) {
        String str1 [] = {"ali", "can", "veli","han","orhan"};
        String str2 [] = {"veli","can","gokhan","ozen"};

       // System.out.print();
        //String each ="";
        //String each2 ="";
        int sayac=0;
        for (String each: str1) {
            for (int i = 0; i <str2.length ; i++) {
                if (each.equals(str2[i])){
                    System.out.print(each+" ");
                    sayac++;
                }

            }
        }
        if (sayac==0){
            System.out.println("iki string'de ortak eleman yoktur");
        }

    }

}
