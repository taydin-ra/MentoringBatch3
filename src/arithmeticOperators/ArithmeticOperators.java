package arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
    /*
    Task1
    Find the sum of first 5 integers and average of them

    Task 2

    Find the 6 factorial (6!)
    1*2*3*4*5*6

    Task3
    Find if 239 is divisible by 4 or not

    Task 4
    int num=5;
    What is the result of
    System.out.println(++num + " Hello")

    A)5 Hello
    B)6 Hello

    Task 5
    int number = 15;
        int result = number + ++number + number++ + --number - number--;
        result?

     */

        //Task 1 Solution
        // n * (n+1)/2   (sum of the numbers)
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        int sum = a + b + c + d + e;
        int average = sum / 5;

       // System.out.println("my average is :" + average);

        //System.out.println("---------------");

        int sumOf8Numbers = (8 * 9) / 2;
        //System.out.println("sumOf8Numbers: " + sumOf8Numbers);

        // Task 2 Solution
        int num = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;

        int factorial=num*num2*num3*num4*num5*num6;

        //System.out.println("factorial: " +factorial);


        // increment
        int myNumber=5;
        int y= myNumber++; //post increment  //myNumber is still 5 // it is gonna do the addition later
       // it is gonna do the addition here
        System.out.println(myNumber+" is my number");
        System.out.println("y is :" + y);

        // pre increment
        int differentNumber=12;
        int anotherNumber=++differentNumber; // pre increment // it is gonna do the addition right away

        System.out.println("anotherNumber: "+ anotherNumber);
        System.out.println("differentNumber is :" +differentNumber);



        int number=5;
        System.out.println(++number + " Hello");



    }
}
