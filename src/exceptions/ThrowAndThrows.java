package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class ThrowAndThrows {
    /*
    Checked & Unchecked
     */

    static void checkAge(int age) {
        if (age < 18) {
            throw new NullPointerException("Access denied - You must be at least 18 years old");
        } else {
            System.out.println("Access granted - You are old enough");
        }
    }

    public static void checkName(String username) throws IOException, FileNotFoundException,Exception {

        if (username.equals(" ")) {
            throw new FileNotFoundException("You have to have a name"); //checked exception have to handle it
        } else {
            System.out.println("You are good");
        }
    }

    public static void main(String[] args) {
        // checkName(null);
        // checkAge(2);
        // ArrayExceptionEx ae = new ArrayExceptionEx(); // instance variable of the class
    }
}
