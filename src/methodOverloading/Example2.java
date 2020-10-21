package methodOverloading;

import java.util.ArrayList;

public class Example2 {
    // you have an integer arraylist
    // just find the numbers are less than 100

    public static ArrayList<Integer> myNewList(ArrayList<Integer> list) {
        ArrayList<Integer> list2=new ArrayList<>();
        for (int eachNumber : list) {
            if (eachNumber < 100) {
                list2.add(eachNumber);
            }
        }
        return list2;
    }

    public static ArrayList<Integer> myNewList(ArrayList<Integer> list, int num) {
        ArrayList<Integer> list2=new ArrayList<>();
        for (int eachNumber : list) {
            if (eachNumber < num) {
                list2.add(eachNumber);
            }
        }
        return list2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(25);
        list3.add(200);
        list3.add(78);
        System.out.println("the method with two parameters: "+myNewList(list3,30));
        System.out.println("the method with one parameter: "+myNewList(list3));
    }
}
