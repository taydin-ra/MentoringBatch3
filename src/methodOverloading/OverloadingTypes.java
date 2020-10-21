package methodOverloading;

import java.util.Arrays;

public class OverloadingTypes {
    // Why do we need methods ?
    /*
    -to make our codes reusable
    - to make our life easier
     */

    public static void getSum() {
        int a = 6;
        int b = 8;
        System.out.println(a + b);

    }

    // 3 types method overloading
    // 1)same return type, amount of parameters is different
    public static void getSum(int num) {
        int b = 8;
        System.out.println(num + b);
    }

    public static void getSum(int num, int num2) {
        System.out.println(num + num2);

    }

    //2) different return type

    public static double getMultiply(double number, double number2) {

        return number * number2;
    }

    public static int getMultiply(int number, int digit) {

        return number *digit;
    }

    // 3) order of the parameters is different

    public static int myNameLength(int len, String myName){
        len=myName.length();
        return len;
    }

    public static int myNameLength(String myName,int len){
        len=myName.length();
        return len;
    }

    public static void main(String[] args) {
       double result= getMultiply(4.6,9.1);
        System.out.println(result);
    }
}