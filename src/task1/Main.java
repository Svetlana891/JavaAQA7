package task1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(ProductType.NOT_ALCOHOL, 50.5, "Milk");
        Seller seller1 = new Seller(Reliability.HONEST, "Steven");
        Customer customer1 = new Customer(DiscountCard.FULL_PRICE, 15, "Peter");

        Shop shop = new Shop("Auchan");

        shop.returnCost(product1, seller1, customer1);

    }
}
