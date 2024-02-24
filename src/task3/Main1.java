package task3;

public class Main1 {
    public static void main(String[] args) {
        Father father1 = new Father("Mark", 200);
        double summ;
        try {
            summ = father1.getPrice();
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
        }catch (WrongProductException e){
            System.out.println(e.getMessage());
        }catch (IncorrectCountOfGoodsException e){
            System.out.println(e.getMessage());
        }


        Product[] goods = new Product[2];
        Product product = new Product(ProductType.APPLE, 20, 3);
        Product product1 = new Product(ProductType.APPLE, 30, 4);
        goods[0] = product;
        goods[1] = product1;



    }
}
