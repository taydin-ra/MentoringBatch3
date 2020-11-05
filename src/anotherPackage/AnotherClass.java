package anotherPackage;

import accessModifiers.Summary;

public class AnotherClass extends Summary { // child class
    public static void main(String[] args) {
        Summary summary=new Summary();
        summary.age=34;

        AnotherClass anotherClass=new AnotherClass();
        anotherClass.age=23;
        anotherClass.num=12.9;

    }
}
