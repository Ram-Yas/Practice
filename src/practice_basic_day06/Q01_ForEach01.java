package practice_basic_day06;

public class Q01_ForEach01 {
    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift  olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..
    public static void main(String[] args) {


       int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        int toplamCift = 0;
        int toplamTek = 0;
        System.out.print("Aray'deki sift sayilar : ");
        for (int each:arr
             ) {
            if (each%2==0){
                System.out.print(each+ " ");
            }
        }
        System.out.println();
        System.out.print("Aray'deki tek sayilar : ");
        for (int each:arr
        ) {
            if (each%2==1){
                System.out.print(each+ " ");

            }
        }


    }
}
