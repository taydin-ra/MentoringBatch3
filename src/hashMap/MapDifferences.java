package hashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDifferences {
    public static void main(String[] args) {
        /*
        HashMap -> random order
        TreeMap -> sorted order

         */

        HashMap<Integer, String> h1 = new HashMap<>();

        h1.put(1, "Apple");
        h1.put(2, "Berry");
        h1.put(3, "Kiwi");
        h1.put(4, null);
        h1.put(10, null);
        h1.put(6, "Orange");
        h1.put(12, "Banana");
        h1.put(5, "Pineapple");
        h1.put(9, "Orange");
        h1.put(13, "Banana");
      //  System.out.println(h1);

        TreeMap<Integer , String > t1 = new TreeMap<>();

        t1.put(1, "Apple");
        t1.put(2, "Berry");
        t1.put(3, "Kiwi");
        t1.put(4, "Banana");
        t1.put(10, "Pineapple");
        t1.put(6, "Orange");
        t1.put(12, null);
        t1.put(5, null);
        t1.put(9, "Orange");
        t1.put(18, "Banana");
        t1.put(19, "Pineapple");
        t1.put(8, "Orange");

        for(Integer i1: t1.keySet()){
            System.out.println(i1+" "+ t1.get(i1));
        }


    }
}
