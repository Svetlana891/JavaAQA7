package task2;

public class ExitOnBoundException extends Exception {
    @Override
    public String getMessage(){
        return "Exit on bound";
    }
}
