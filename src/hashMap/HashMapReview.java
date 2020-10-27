package hashMap;

import java.util.HashMap;

public class HashMapReview {
    public static void main(String[] args) {
/*
HashMap is not part of collections,
HashMap there is key and value
Keys should be unique
Value can be duplicated
 */

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Georgia");
        map.put(2, "New Jersey");
        map.put(3, "Georgia");

        map.replace(1, "Ohio");
        System.out.println(map);

        System.out.println(map.containsKey(2));  // check if you have that key
        System.out.println(map.containsValue("New York")); // check if you have that value in you map

        for (Integer m1 : map.keySet()) {
            System.out.println(m1);

        }

        for (String values : map.values()) {
            System.out.println("values: " + values);

        }


    }
}
