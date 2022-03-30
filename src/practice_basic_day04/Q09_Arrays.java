package practice_basic_day04;

public class Q09_Arrays {
    public static void main(String[] args) {


        int arr[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        ciftSayilariTopla(arr);


    }

    private static void ciftSayilariTopla(int[][] arr) {
        int ciftToplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    ciftToplam += arr[i][j];

                }
            }
        }
        System.out.println("Arraydeki cift sayilarin toplami : " + ciftToplam);
    }
}
