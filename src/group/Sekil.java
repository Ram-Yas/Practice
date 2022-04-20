package group;

public class Sekil extends Geometri{




  //public static void main(String[] args) {
  //    Kare kare = new Kare(2);

  //}

    public static int cevreHesapla() {
        return (kenar1 * 4);
    }

    public static void cevreHesaplaUcgen() {
        int cevre = kenar1+kenar2+kenar3;
        System.out.println(cevre);
        //return cevre;
    }

}
