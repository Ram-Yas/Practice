package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;

public class Q01_MapKeysValues {

    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi.. hem de ayri ayri yazdirma ?

    public static void main(String[] args) {

        Map<String, Integer> country = new HashMap<String, Integer>();
        country.put("Turkiye", 81000000);
        country.put("Togo",7589000);
        country.put("Fransa", 73254220);
        country.put("ABD",325147525);
        country.put("Italya",58585858);

        System.out.println("ulke isimleri ve nufuslari "+country);
        System.out.println("ulkeler : "+country.keySet());
        System.out.println("nufuslari : "+country.values());

        int sayac = 0; // sayac-->50 milyondan fazla olan ulke sayisi
        for (Integer buyukMu:country.values() ) { // ulke nufularina bak
            if (buyukMu>50000000){ // 50 milyondan buyukse 1 arttir
                sayac++;
            }

        }
        System.out.println("Nufusu 50 milyondan fazla olan ulke sayisi : " + sayac);

        int nufus =0;
        for (Integer toplam: country.values()) {
            nufus +=toplam;

        }
        System.out.println("Nufus toplami : "+nufus);

        for (Map.Entry<String, Integer> siralama : country.entrySet()) { // entrySet() = key+ value olarak dusunulebilir
            System.out.println(siralama);

        }

        //yukarida kullanilan entrySet ile hem nufus hem de ulkeler yazdirilabiliyor.
        // Ancak biz bunlari ayri ayri yazdirmak istiyorsak, keyset ve valuSet olarak asagidaki gibi yazdiririz

        for (String ulkeSirasi : country.keySet() // sadece key
             ) {
            System.out.println(ulkeSirasi);
        }
        for (Integer nufusSirasi : country.values() // sadece valur
        ) {
            System.out.println(nufusSirasi);
        }



    }
}
