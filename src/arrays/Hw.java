package arrays;

import java.util.*;

public class Hw {

        public static void main(String[] args) {
            String myString = "I love Java";
            System.out.println(middleWord(myString));
            myString = " Registered users can sign-in";
            System.out.println(middleWord(myString));
        }
    public static String middleWord(String str){
        String[] strArray = str.split(" ");
        String midWord = strArray[strArray.length/2];

        return midWord;
    }


}


