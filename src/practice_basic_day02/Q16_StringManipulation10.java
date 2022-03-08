package practice_basic_day02;

public class Q16_StringManipulation10 {

    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {

        String str = "   Java ogrenmek123 Cok guzel@      ";
        //System.out.println(""+ str.trim(str.replaceAll("\\W", "")));
        str = str.trim();
        System.out.println(str.substring(0,1)+str.replaceAll("\\d", "").replaceAll("@", "").toLowerCase().substring(1));
    }
}
