package exercise;

public class Sorucozumu2 {

    public static void main(String[] args) {

        /*
        C
        OO
        DDD
        EEEE
        RRRRR
        **/

        String str = "CODER";

        for (int i = 0; i <str.length() ; i++) {

            for (int j = 0; j <=i ; j++) {

                System.out.print(str.charAt(i)+ " ");

            }
            System.out.println();
        }



    }
}
