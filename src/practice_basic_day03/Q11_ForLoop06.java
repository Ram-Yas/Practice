package practice_basic_day03;

import java.util.Scanner;

public class Q11_ForLoop06 {
    /*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("satir sayisini girin :");
        int row = scan.nextInt();
        System.out.print("sutun sayisini girin :");
        int column = scan.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

}
