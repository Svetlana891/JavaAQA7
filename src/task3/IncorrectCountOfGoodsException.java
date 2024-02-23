package task3;

public class IncorrectCountOfGoodsException extends Exception{
    @Override
    public String getMessage(){
        return "You don't have the right amount of goods";
    }
}
