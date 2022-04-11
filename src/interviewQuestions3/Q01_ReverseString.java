package interviewQuestions3;

public class Q01_ReverseString {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {

        //2.yol

        String str = "Hayat paylasinca guzel";
        String arr[] = str.split("");
        String revesedStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            revesedStr += arr[i];
        }
        System.out.println(revesedStr);

        //3.yol

        System.out.println(reversedStr(arr, revesedStr));


    }//main sonu

    private static String reversedStr(String[] arr, String revesedStr) {
        revesedStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            revesedStr += arr[i];
        }
        return revesedStr;
    }//end of the method


}//class sonu
