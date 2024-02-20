package task2;

public class DivisionNullOnNumberException extends Exception {
    @Override
    public String getMessage(){
        return "Division null on number";
    }
}
