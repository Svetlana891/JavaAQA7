package task2;

public class ExitOnBoundArrayException extends Exception {
    @Override
    public String getMessage(){
        return "Exit on bound array";
    }
}
