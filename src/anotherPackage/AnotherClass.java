package anotherPackage;

import accessModifiers.DifferentClass;
import accessModifiers.Summary;

public class AnotherClass extends DifferentClass { // child class
    public static void main(String[] args) {
        Summary summary=new Summary();
        summary.age=34;

        AnotherClass anotherClass=new AnotherClass();
        double tax=anotherClass.stateTax("$5,6");

        System.out.println(tax);



        String name="Turkana";
        name=name.concat("Mammadova");  // Strings are reference type, not primitive data type

        System.out.println(name);






    }
}
