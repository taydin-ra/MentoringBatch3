package exceptions;

public class ExceptionCalling {

    static void password(String password) throws MyOwnException {
        if(password.contains("$")){
            throw new MyOwnException("You can't have $ sign");
        }
    }

    public static void main(String[] args){
        try {
            ThrowAndThrows.checkName(" "); //checked exception
        }catch (Exception e){

        }
        ThrowAndThrows.checkAge(17); //unchecked exception
    }


}
