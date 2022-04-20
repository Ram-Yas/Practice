package group;

public class Ucgen extends Sekil {

      /*

        1) ayri ayri ucgen ve kare classlari olusturun
        2) olusturulan bu claslarda ucgen ve kare cevrelerini hesaplayiniz
           (cevre=kenarlar toplami)
        3) 2 adet child 1 adet parent 1 adet grandparent claslari kullaniniz.

   */

    public Ucgen() {
    }

    public Ucgen(int kenar1, int kenar2, int kenar3) {

    }

    public static void main(String[] args) {
        Ucgen dik = new Ucgen(5,4,3);
        //System.out.println(dik.cevreHesaplaUcgen());
        dik.cevreHesaplaUcgen();
    }


}
