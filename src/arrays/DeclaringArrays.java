package arrays;

import java.util.Arrays;

public class DeclaringArrays {
    public static void main(String[] args) {
        // initializing with length
        int[] array = new int[5];
        array[0]=2;
        array[1]=78;

        double []doubleArray={1.2,  2.3,5.0};

       // System.out.println(Arrays.toString(doubleArray));

        int[] arr = new int[4];
        arr[0] = 4;
        arr[1] = 2;

       // System.out.println(arr[0]+ " and "+ arr[3]);

        String[] str = new String[4];
        str[0] = "Samil";
        str[1] = "Dogan";
        System.out.println(str[1] + " " + str[3]);

    }

}
