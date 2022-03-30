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
        String array[][] = {{"$12" , "$22" , "$0"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double toplam= 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array [i].length; j++){
                if(array[i][j].contains("$")){
                    toplam += Double.parseDouble((array[i][j].replace("$", "")))*3.2;
                }else if(array[i][j].contains("€")){
                    toplam += Double.parseDouble((array[i][j].replace("€", "")))*4.2;
                }
            }
        }
        System.out.println("arraydaki elemanlarin toplami : "+toplam);
    }
}
