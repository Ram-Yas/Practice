package practice_basic_day04;
public class Ornek4 {
    /*
     *  String 2D array olustur
     *  {{"$12" , "$22" , "$0"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
     *  String de $ varsa 3.2 ile carp
     *  String de € varsa 4.2 ile carp
     *  elemanlarin toplamini double olarak yazdir
     */

    public static void main(String[] args) {

        String arr [][] = {{"$12" , "$22" , "$0"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam= 0;
        double toplamDolar = 0;
        double toplamEuro = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){

                if (arr[i][j].contains("$")){
                    toplamDolar += (Double.parseDouble((arr[i][j].replace("$", "")))*3.2);
                            //Integer.valueOf

                }else {
                    toplamEuro += Double.parseDouble((arr[i][j].replace("€", "")))*4.2;

                }
            }
        }

        System.out.println("toplam $: "+Math.round (toplamDolar) +" ve toplam €: "+Math.round(toplamEuro));
        System.out.println("son toplam: "+(toplamDolar+toplamEuro));
    }
}
