package practice_basic_day06;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q07_LocalDate05 {
    public static void main(String[] args) {

       /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2); // period class'dan p objemiz var
                                                // en son hangisi eklendiyse o gecerlidir, oncekileri gecersiz kilar
                                                // sadece yil

        d = d.minus(p); //minus geriye gider.yukaridan aldigi 2 yili geriye goturerek 2013 olarak atama yapar

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT); // sn'yi almamis

        System.out.println(d.format(f)); //5/10/13, 11:22 AM


 /*
            A. 5/9/13 11:22  --> yanlis !! DIKKAT!!
            B. 5/10/13 11:22  ***cevap***
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/

    }
}
