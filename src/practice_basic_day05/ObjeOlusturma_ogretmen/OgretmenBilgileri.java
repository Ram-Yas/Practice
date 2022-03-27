package practice_basic_day05.ObjeOlusturma_ogretmen;

public class OgretmenBilgileri {
    /* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin (variable lar buasamada static olmali..)
     * ve yazdirin
     *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
	 instance variable uretilmis demektir.
     */
    static String isim;
    static String soyisim;
    static int numara;
    static String brans;

    public OgretmenBilgileri(String isim, String soyisim, int numara, String brans) {
        this.isim = isim;
        this. soyisim = soyisim;
        this. numara =numara;
        this. brans = brans;
    }

    /*public OgretmenBilgileri(){

    }*/

    public String toString() {
        return ("isim: "+isim+ " soyisim: "+ soyisim+ "numara"+ numara+ " brans"+ brans);

    }

    public static void main(String[] args) {
        isim = "ali";
        soyisim = "kaya";
        numara = 1;
        brans = "mat";

    }
}

