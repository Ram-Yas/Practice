package exercise;

public class WhileLoop2 {

    public static void main(String[] args) {

        /* Soru 2 ) For loop ve while Loop kullanarak
        3 basamakli sayilardan 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.
        * */

        int start = 100;
        int end = 999;

        while (start<=end){

            if(start%15==0 ||start%20==0 || start%90==0){
                System.out.print(start+ " ");
                start++;
            }


        }
    }
}
