package task3;

public class NotEnoughMoneyException extends Exception{
    @Override
    public String getMessage(){
        return "You have a little cash";
    }

}
