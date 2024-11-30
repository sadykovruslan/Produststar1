package Collections.HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap <Integer, String> codeCity = new HashMap<>();
        HashMap <String, Integer> cityCode = new HashMap<>();

        codeCity.put(199, "Moscow");
        codeCity.put(116, "Kazan");
        codeCity.put(134, "Volgograd");
        codeCity.put(162, "Nizhniy Novgorod");

        for(Map.Entry<Integer, String> entry: codeCity.entrySet()) {
            cityCode.put(entry.getValue(), entry.getKey());
            System.out.println(entry);
        }

        for(Map.Entry<String, Integer> entry: cityCode.entrySet()) {
            System.out.println(entry);
        }
    }
}