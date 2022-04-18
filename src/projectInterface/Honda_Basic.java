package projectInterface;

public class Honda_Basic extends Araba implements icAraba,disAraba {

    public static void main(String[] args) {
        Honda_Basic honda1 = new Honda_Basic();
        honda1.direksiyon();
        honda1.benzin();
        honda1.diesel();
        honda1.kapi();
        honda1.klima();
        honda1.koltuk();
    }



    @Override
    public void move() {
        System.out.println("arkadan cekisli");
    }

    @Override
    public void kapi() {
        System.out.println("5 kapili");
    }



    @Override
    public void benzin() {
        super.benzin();
    }
    public void direksiyon(){
        System.out.println("plastik direksiyon");
    }
    public void koltuk() {
        System.out.println("suni deri ");
    }
    public void klima(){
        System.out.println("manuel");
    }


}
