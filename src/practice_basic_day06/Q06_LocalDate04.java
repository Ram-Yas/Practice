package practice_basic_day06;

import java.time.LocalDate;
import java.time.Month;

public class Q06_LocalDate04 {
    public static void main(String[] args) {

          /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2); //2 gun artirma yapilmis degerler e atama yapilmadigindan
        date.plusYears(3); //3 yil artirla yapildi


        System.out.println(date); //2018-04-30
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth()); // 2018 avril 30
        //sonuc degismez cunku atama yapilmadi
/*
            A. 2018 APRIL 2
            B. 2018 APRIL 30
            C. 2018 MAY 2
            D. 2021 APRIL 2
            E. 2021 APRIL 30
            F. 2021 MAY 2
            G. A runtime exception is thrown.
 */
    }
}