package arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        // you have a string "HeySiri"
        // change it to "ByeSiri"

        String str="HeySiri";
        char [] array=str.toCharArray();
        System.out.println("before reinitialize the array: "+Arrays.toString(array));

        array[0]='B';
        array[1]='y';
        array[2]='e';

        System.out.println("after reinitialize the array: "+Arrays.toString(array));

    }
}
