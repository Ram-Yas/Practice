package practice_basic_day05.ObjeOlusturma_ogretmen;

public class ObjectClass {
    /*
     * Object Class’i olusturun burada OgretmenBilgileri Class indan
     * object ureterek yeni
     * ogretmenler olusturun ve bilgilerini yazdirin
     */
    public static void main(String[] args) {

        OgretmenBilgileri ogretmen1 = new OgretmenBilgileri("ahmet", "kaya",1, "mat");
        System.out.println(ogretmen1);
        OgretmenBilgileri ogretmen2 = new OgretmenBilgileri("veli", "can",2, "eng");
        System.out.println(ogretmen2);

        OgretmenBilgileri ogretmen3 = new OgretmenBilgileri("john", "good",3, "art");
        System.out.println(ogretmen3);

        OgretmenBilgileri ogretmen4 = new OgretmenBilgileri("polat", "kol",4, "IT");
        System.out.println(ogretmen4);

        OgretmenBilgileri ogretmen5 = new OgretmenBilgileri("zalim", "dunya",5, "mat");
        System.out.println(ogretmen5);



    }


}
