package task3;

public class Main {
    public static void main(String[] args) {
        Father father1 = new Father("Mark", 200, Food.APPLE, Product.BEER, 3, 2);

        try {
            father1.getPrice();
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }catch (WrongProductException e){
            System.out.println(e.getMessage());
        }catch (IncorrectCountOfGoodsException e){
            System.out.println(e.getMessage());
        }


    }
}
