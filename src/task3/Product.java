package task3;

public class Product {
    private ProductType type;
    private double price;
    private int amount;

    public Product(ProductType type, double price, int amount) {
        this.type = type;
        this.price = price;
        this.amount = amount;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
