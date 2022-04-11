package interviewQuestions3;

public class Q01_ReverseString {
        /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {

        //1.Yol: StringBuilder () kullanarak
        String str = "Hayat paylasinca guzel";
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str); // bu method Stringbilder'a ekleme yapar

        String revesedStr = strBuilder.reverse().toString();
        System.out.println("1.yol: " + revesedStr); //1; yol: lezug acnisalyap tayaH

        //2.Yol: String Classini kullanarak
        System.out.print("2.yol :");

        for (int i = str.length() - 1; i >= 0; i--) {//start from end of the string and got to the beginning
            System.out.print(str.charAt(i));//her bir karakteri yazdir
        }
        System.out.println(); //alt satir ile karismasin diye

        //4. yol : String Classini kullanarak

        String arr[] = str.split("");
        revesedStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            revesedStr += arr[i];
        }
        System.out.println("4.yol: " + revesedStr);

        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin

        System.out.println("3.yol: " + reversedStr(arr, revesedStr));

        //5.yol

        System.out.print("5.yol: ");
        strTersArray(str);


    }//main sonu

    private static void strTersArray(String str) {
        char[] arr2 = str.toCharArray(); //String bir veriyi karakterlere char tipinde ayirir
                                          //split metoduna benziyor
        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(arr2[i]);

        }
    }//end of the method

    private static String reversedStr(String[] arr, String revesedStr) {
        revesedStr = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            revesedStr += arr[i];
        }
        return revesedStr;
    }//end of the method


}//class sonu
