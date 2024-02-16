package task10;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("DreamTown", "Alek", "Nelly", "Milk");
        shop.returnCost(100,16, Sell.PRODUCT, Seller.HONEST, 50);

    }
}
