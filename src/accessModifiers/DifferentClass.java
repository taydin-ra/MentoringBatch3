package accessModifiers;

public class DifferentClass {
    // public static void main(String[] args) {


//        Summary summary = new Summary();
//
//        summary.age=56;
//        summary.name="Aydin";
//        summary.num=7.8;
    // summary.isFriday=false;  it is not accessible in the different class


    // Task
    // 1. create a method named as stateTax,
    // which is accessible just within the same package!
    // return type is double, parameter is String.
    // remove any $ and , signs from the String, convert into double and calculate state tax
    // by getting the 7.75 percent of the double value.


   protected double stateTax(String num) {
        num = num.replace("$", "");
        num = num.replace(",", "");

        double tax = Double.valueOf(num); // Double.parseDouble(num);

        double result = tax * 0.0775;

        return result;

    }
}