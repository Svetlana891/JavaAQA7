package task1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(ProductType.NOT_ALCOHOL, 50.5, "Молоко");
        Seller seller1 = new Seller(Reliability.NOT_HONEST, "Леопольд");
        Customer customer1 = new Customer(DiscountCard.FULL_PRICE, 15, "Лео");

        Shop shop = new Shop("Aшан");
        shop.returnCost(product1, seller1, customer1);

    }
}
