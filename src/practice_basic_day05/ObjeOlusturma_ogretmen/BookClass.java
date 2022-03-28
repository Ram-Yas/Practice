package practice_basic_day05.ObjeOlusturma_ogretmen;

public class BookClass {
    String adi, yazari;
    int yayinYili;

    //class'da body icinde sag click
    //sag click generate --> kullanacahin parametrelei sec --> ok Parametreli constructor uretilir
    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass() {
    }

    public BookClass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;
    }

    public void display(){
        System.out.println("Kitap :"+adi + " yazari : "+ yazari+ " yazari :"+ yazari+ " yayin yili :" +yayinYili );
    }

    public static void main(String[] args) {
        BookClass kitap1 = new BookClass("Harry Potter and the Gobles", "JK Rowling", 2000 );
        BookClass kitap2 = new BookClass("Suc ve ceza", "Dostoyevski");


        kitap1.display();
        kitap2.display();
    }
}
