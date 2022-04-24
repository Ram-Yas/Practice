package group;




    /**
     *  This class Triangle calculates
     *  the area of triangle
     */

    public class Triangle extends Shape{
         /*

        1) ayri ayri ucgen ve kare classlari olusturun
        2) olusturulan bu claslarda ucgen ve kare cevrelerini hesaplayiniz
           (cevre=kenarlar toplami)
        3) 2 adet child 1 adet parent 1 adet grandparent claslari kullaniniz.

   */


        //Calculate and return area of triangle
        public double getArea()        {
            return (getHeight() * getWidth()) / 2;
        }
    }