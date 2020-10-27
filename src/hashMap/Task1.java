package hashMap;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
           /*
            Do this together

            Create a method name is check

            Return type is boolean

            This method will take one parameter map<String , String> m1 and one String s1

            Check if the m1 key is containing s1

            Call this method from main and print the result

         */

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("Germany", 8000);
        myMap.put("USA", 12000);
        myMap.put("France", 15000);

        String s2 = "USA";

        boolean checkResult = check(myMap, s2);

        System.out.println(checkResult);

    }

    public static boolean check(HashMap<String, Integer> m1, String s1) {
        boolean result = m1.containsKey(s1);
        return result;
    }


}
