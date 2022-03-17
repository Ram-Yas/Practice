package practice_basic_day03;

public class Q02_MethodCreation02 {
/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        String str = "aabbcccccddddaaa";
        birKereYazdir(str);
    }

    private static void birKereYazdir(String str) {

        String sonuc = ""; // string te default deger "" dir

        for (int i = 1; i < str.length(); i++) {//i index'i temsil ediyor
            //esitlik olmazsa length yazariz varsa lenth-1 yazariz

            if (!sonuc.contains(str.substring(i, i + 1))) {
                sonuc += str.substring(i, i + 1);

            }
        }
        System.out.println(sonuc);
    }


}
