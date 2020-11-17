package exceptions;

public class CheckedException {
    public static int sum() {
        try {
            Thread.sleep(3000); //checked exception

        } catch (Exception e) {

        }
        return 2;
    }
}
