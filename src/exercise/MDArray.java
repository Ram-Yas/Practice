
package exercise;

public class MDArray {

    public static void main(String[] args) {
        /*
         * Soru 1) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
         * Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         * Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru) arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
         * Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
         * Soru 6) Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir Array olarak yazdiran bir method yaziniz
         * */

        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length+1; j++) {
                carpim *= arr[i][j];
                System.out.println(carpim);
            }
        }
        System.out.println("arraylar carpimi = "+carpim);
    }
}

