package task1;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Aшан");

        // Test 1
        Product product1 = new Product(ProductType.NOT_ALCOHOL, 80.5, "Апельсины");
        Seller seller1 = new Seller(Reliability.NOT_HONEST, "Геннадий Добрый");
        Customer customer1 = new Customer(DiscountCard.FULL_PRICE, 15, "Леопольд Виноградов");
        shop.returnCost(product1, seller1, customer1);

        // Test 2
        Product product2 = new Product(ProductType.ALCOHOL, 10.5, "");
        Seller seller2 = new Seller(Reliability.HONEST, "Геннадий Добрый");
        Customer customer2 = new Customer(DiscountCard.WITH_SELL, 15, "Леопольд Виноградов");
        shop.returnCost(product2, seller2, customer2);

        // Test 3
        Product product3 = new Product(ProductType.ALCOHOL, 20.5, "Апельсины");
        Seller seller3 = new Seller(Reliability.NOT_HONEST, "Геннадий Добрый");
        Customer customer3 = new Customer(DiscountCard.WITH_SELL, 15, "Леопольд Виноградов");
        shop.returnCost(product3, seller3, customer3);

    }
}
