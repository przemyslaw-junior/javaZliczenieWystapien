package PrzemekT.ZadanieRekrutacyjne;

// int[] numbers = new int []{1,2,3,4,2,2,1,3}

import java.util.HashMap;
import java.util.Map;

public class ZliczenieWystąpień {

    public static void main(String[] args) {
        liczbaWystapien(new int[]{1,2,3,4,2,2,1,3});
    }

    public static void liczbaWystapien(int[] numbers) {
        Map<Integer,Integer> liczby = new HashMap<>();

        for (int i = 0; i<numbers.length; i++){
            if (liczby.containsKey(numbers[i])){
                Integer vartosc = liczby.get(numbers[i]);
                liczby.put(numbers[i],vartosc +1);
            } else {
                liczby.put(numbers[i],1);
            }
        }
        for (Integer key : liczby.keySet()){
            System.out.println("liczba " + key + " wystąpień " + liczby.get(key));
        }
    }

}
