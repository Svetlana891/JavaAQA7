package task3;

public class Main1 {
    public static void main(String[] args) {
        Father father1 = new Father("Mark", 200);

        double summ;
        try {
            summ = father1.buyProducts(3,4, ProductType1.APPLE, ProductType2.POTATO);
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }catch (WrongProductException e){
            System.out.println(e.getMessage());
        }catch (IncorrectCountOfGoodsException e){
            System.out.println(e.getMessage());
        }





    }
}
