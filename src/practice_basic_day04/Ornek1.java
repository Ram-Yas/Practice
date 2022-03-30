package practice_basic_day04;

public class Ornek1 {

    /*
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 5,6,7
     */

    public static void main(String[] args) {

        int input[] = {15,2,32,4,50,6,7,8,25,35};
        int toplam = 0;

        for (int i = 0; i < input.length; i++){
            toplam +=  input[i];  //toplam=toplam+input[i]
        }
        System.out.println(toplam);

        double ortalama = toplam/input.length;
        System.out.print("ortalamadan buyuk sayilar :");
        for (int i = 0; i <input.length; i++){ //elemanlari tek tek dolasip yazdirmak icin

            if (input[i]>ortalama){
                System.out.print(input[i]+ " ");
            }

        }


    }

}
