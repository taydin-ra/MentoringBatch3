package whileDoWhile;

import java.util.Scanner;

public class WhileLoopTask2 {
    public static void main(String[] args) {
        /*
        Find the square of the numbers between 1 and 7
        1 4 9 16 25 36 49

         */

        int num = 1;
        int square = 0;
        while (num <= 7) {
            square = num * num;
            System.out.println("square of the number: " + square);
            num++;
        }
    }
}

