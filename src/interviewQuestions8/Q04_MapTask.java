package interviewQuestions8;

import java.util.*;

public class Q04_MapTask {

    // PART 1
    // create a map with groupName as key and groupMembers as value
    // "Group1" = ["Member1", "Member2"]
    // "Group2" = ["Member3", "Member4", "Member5"]


    // BÖLÜM 1
    // anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
    // "Grup1" = ["Üye1", "Üye2"]
    // "Grup2" = ["Üye3", "Üye4", "Üye5"]

    // PART 2
    // find how many members each group has

    // BÖLÜM 2
    // her grubun kaç üyesi olduğunu bul

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> grupIsimVeUyeler = new HashMap<>();
        ArrayList<String> devTeam = new ArrayList<>(Arrays.asList("Abdullah", "Kutay", "Enes Faruk", "Yasin"));
        ArrayList<String> qaTeam = new ArrayList<>(Arrays.asList("Kadir", "Seher", "Gokhan", "Bahattin", "Aaaa"));

        grupIsimVeUyeler.put("Development team", devTeam);
        grupIsimVeUyeler.put("QA team", qaTeam);

        System.out.println("grupIsimVeUyeler = " + grupIsimVeUyeler);
        // grupIsimVeUyeler = {QA team=[Kadir, Seher, Gokhan, Bahattin], Development team=[Abdullah, Kutay, Enes Faruk, Yasin]}

        //PART 2
        // 1.yol

        Collection<ArrayList<String>> values = grupIsimVeUyeler.values();
        for (ArrayList<String> kisi : values) {

            System.out.println(kisi.size()); //QA icin5 , dev icin 4
        }

        //2.yol

        Set<String> keys = grupIsimVeUyeler.keySet(); //keySet() key'leri set olarak dondurur

        for (String key : keys) {
            ArrayList<String> grupList = grupIsimVeUyeler.get(key);


            System.out.println("Gruptaki uye sayisi : "+key + " "+ grupList.size());
            //Gruptaki uye sayisi : QA team 5
            //Gruptaki uye sayisi : Development team 4
        }



    }
}
