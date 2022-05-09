package interviewQuestions9;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Q06_TreeMapFrekans {

    // TreeMap kullanarak bir cümlenin içindeki harflerin frekansını method ile bulunuz.
    // TreeMap yavastir, siralama yapar

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("cumle giriniz : ");
        String cumle = scan.nextLine().toLowerCase();

        frekans(cumle); // 1.yol bu en yaygin kullanilan sistem
        Map<String, Integer> map = frekans2(cumle); //2; yol array sinifindan faydalanacagiz
        System.out.println("map = " + map);
    }

    private static Map<String, Integer> frekans2(String cumle) {
        String harfler [] = cumle.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String each: harfler) {
            if (!map.containsKey(each)) { // daha onceden bu harf eger map'de yoksa
                map.put(each, 1); // sayisi 1 olsun
            } else {
                map.put(each, map.get(each)+1); // daha onceden bu harf map icinde varsa sayisini 1 arttir
            }
        }
        return map;
    }

    private static void frekans(String cumle) {

        TreeMap<Character, Integer> frMap = new TreeMap<>(); // container

        for (int i = 0; i < cumle.length(); i++) {
            if (frMap.containsKey(cumle.charAt(i))) { // cumleyi karakterkere boler
                frMap.replace(cumle.charAt(i),frMap.get(cumle.charAt(i))+1);
                // replace(old, new) -->karakterleri saydirmada ayni karakteredn varsa sayisini 1 arttirarak gunceller
            } else{
                frMap.put(cumle.charAt(i),1); // frMap icerisinde onceden bu karakter yoksa o zaman bu satir calisir
            }
        }
        System.out.println(frMap);
    }
}
