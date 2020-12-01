package polymorphism;

public class Summary {
    /*
   2 types of polymorphism
   - Compile Time (Static) Method Overloading
   - Runtime (Dynamic)  Method Overriding
   - Constructors can not be inherited
   -Data variables can not be overridden
   -You cannot override static methods (method hiding)
   - final methods can not be overridden
   -privates are not inherited




     */
    public static void main(String[] args) {
        Device device = new Device(); // reference is from parent class and pointing to again parent class
       // device.call();
       // System.out.println(device.name);
        System.out.println("I am calling static method");
        device.text();


        Device device2 = new iphone();
        //device2.call();
       // System.out.println(device2.name);
        device2.text();

        iphone iphone=new iphone();
        //System.out.println(iphone.name);
        iphone.text();


    }
}

class Device {
    public String name = "Device";

    public void call() {
        System.out.println("You can make calls with your device");

    }
    public static void text(){
        System.out.println("you can send text messages through your device");
    }
    private  void version(){
        System.out.println("My version is 14.0.1");
    }
}

class iphone extends Device {

    public String name="iphone";
    public void call() {
        System.out.println("You can also use your iphone");
    }
    public static void text(){
        System.out.println("you can send text messages through your IPHONE");
    }


}

class android extends Device {
    public void call() {
        System.out.println("You can also use your android");
    }

}