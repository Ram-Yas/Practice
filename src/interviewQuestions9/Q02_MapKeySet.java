package interviewQuestions9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q02_MapKeySet {
    // create a map of zipcodes and Cities, at least 3 entries
    // get the keySet and iterate over it, print the map like below:
    // zipcode1 => city1
    // zipcode2 => city2
    // part 2: print all the keys of the map

    public static void main(String[] args) {

        Map<Integer, String> zipcodeAndCities = new HashMap<Integer, String>();
        zipcodeAndCities.put(85000, "Arizona");
        zipcodeAndCities.put(87280, "Beaubreuil");
        zipcodeAndCities.put(80001,"Colorado");

        Set<Integer> keys = zipcodeAndCities.keySet();
        for (Integer key : keys) {
            System.out.println(key+ "=>"+ zipcodeAndCities.get(key));
        }
        /*
        80001=>Colorado
        87280=>Beaubreuil
        85000=>Arizona
         */
        System.out.println(keys); // [80001, 87280, 85000]


    }
}
