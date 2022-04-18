package projectInterface;

public class Honda_lux extends Araba implements icAraba,disAraba{

    public static void main(String[] args) {

        Honda_lux hondaLux1 = new Honda_lux();
        hondaLux1.direksiyon();
        hondaLux1.diesel();
        hondaLux1.kapi();
        hondaLux1.klima();
        hondaLux1.koltuk();
        hondaLux1.move();

    }
    @Override
    public void move() {
        System.out.println("dort cekisli");
    }

    @Override
    public void kapi() {
        System.out.println("Uste dogru aciliyor");
    }

    @Override

    public void diesel() {}
    public void klima() {
        System.out.println("Otomatik klima");
    }
    public void direksiyon(){
        System.out.println("deri direksiyon");
    }
    public void koltuk(){
        System.out.println("deri koltuk");
    }


}
