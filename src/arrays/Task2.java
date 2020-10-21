package arrays;

public class Task2 {
    public static void main(String[] args) {

        /*
        check your array's first and last elements are same
         */
        int []arr={1,6,4,8,2}; // last element is index 4

        boolean myCon=false;


//        for (int i = 0; i < arr.length; i++) {
//            if(arr[0]==arr[arr.length-1]){
//                myCon=true;
//            }else{
//                myCon=false;
//            }
//        }
        System.out.println(arr[0]==arr[arr.length-1]);
    }

}
