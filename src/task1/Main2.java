package task1;

public class Main2 {
    public static void main(String[] args) {
        Shop shop = new Shop("Aшан");

        // Test 1
        Product product1 = new Product(ProductType.NOT_ALCOHOL, 80.5, "Апельсины");
        Seller seller1 = new Seller(Reliability.HONEST, "Никита Добрынич");
        Customer customer1 = new Customer(DiscountCard.FULL_PRICE, 25, "Леопольд Виноградов");
        shop.returnCost(product1, seller1, customer1);

        // Test 2
        Product product2 = new Product(ProductType.ALCOHOL, 200.5, "Вино");
        Seller seller2 = new Seller(Reliability.HONEST, "Феликс Воронин");
        Customer customer2 = new Customer(DiscountCard.WITH_SELL, 15, "Эдуард Цветков");
        shop.returnCost(product2, seller2, customer2);

        // Test 3
        Product product3 = new Product(ProductType.ALCOHOL, 250.5, "Шампанское");
        Seller seller3 = new Seller(Reliability.NOT_HONEST, "Владимир Новиков");
        Customer customer3 = new Customer(DiscountCard.WITH_SELL, 13, "Егор Аксенов");
        shop.returnCost(product3, seller3, customer3);

    }
}
