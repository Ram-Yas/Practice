package exercise;

public class ForEach4 {
    /*
    Soru 4:
    Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak
    yazdiriniz. ipucu: split()
     */

    public static void main(String[] args) {
        String str = "Hayat paylasinca guzel!!";
        String[] arr = str.split("");
        for (String each : arr
        ) {
            System.out.print(each + " ");
        }
    }

}
