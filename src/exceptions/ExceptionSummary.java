package exceptions;

public class ExceptionSummary {
    public static void main(String[] args) {
        /*
        An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time,
        that disrupts the normal flow of the program’s instructions.

           Error vs Exception

Error: An Error indicates serious problem that a reasonable application should not try to catch.
Exception: Exception indicates conditions that a reasonable application might try to catch.
         */
        int c=0;
        try {
            int a = 10;
            int b = 0;
             c = a / b; // exception occurs here

        }catch(NullPointerException e){
            System.out.println(c);
            System.out.println("You handled your exception");
        }catch(ArithmeticException e){
            System.out.println("You have the correct exception");
        }
         // unchecked exception
        int sum = 5 * 8;
        System.out.println(sum);
        String s = "Tugba";
        System.out.println(s);


    }
}
