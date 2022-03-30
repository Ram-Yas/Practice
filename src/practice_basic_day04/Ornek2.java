package practice_basic_day04;

public class Ornek2 {
    /*
     * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    /*
			5 and 4 sum is 9
			7 and 2 sum is 9
			-6 and 15 sum is 9
			8 and 1 sum is 9
			 */

    public static void main(String[] args) {
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;
        sayiCifti(arr, istenenToplam);

    }

    private static void sayiCifti(int[] arr, int istenenToplam) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                toplam += arr[i] + arr[j];
                if (toplam == istenenToplam) {
                    System.out.println(arr[i] + " ve " + arr[j] + " nin toplami : " + istenenToplam + "'dir");
                }
                toplam = 0;
            }

        }
    }
}
