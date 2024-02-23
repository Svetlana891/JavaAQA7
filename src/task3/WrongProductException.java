package task3;

public class WrongProductException extends Exception{
    @Override
    public String getMessage(){
        return "You have chosen the wrong product";
    }
}
