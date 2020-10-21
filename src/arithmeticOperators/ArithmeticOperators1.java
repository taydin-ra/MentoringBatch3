package arithmeticOperators;

public class ArithmeticOperators1 {
    public static void main(String[] args) {
        //Addition
        int number = 6;  // int is primitive data type
        int number2 = 8;
        int sum = number + number2;
        System.out.println("my total: " + sum);
        //Subtraction
        int subtraction = number2 - number;
        System.out.println(subtraction);
        // Multiplication
        int multiplication = number * number2;
        System.out.println(multiplication);

        // Division
        int dividend = 56;
        int divisor = 8;
        int quotient = dividend / divisor;
        System.out.println("quotient: "+quotient);

        //Modulo
        int num = 67;
        int result = num % 8;
        System.out.println("remainder " + result);

        int Number = num % 2;
        System.out.println(Number);

        // 2 4 6 8 10 12  even numbers
        // 1 3 5 7
    }
}
