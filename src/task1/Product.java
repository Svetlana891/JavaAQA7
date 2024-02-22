package task1;

public class Product {
    private ProductType productType;
    private double price;
    private String name;

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(ProductType productType, double price, String name) {
        this.productType = productType;
        this.price = price;
        this.name = name;
    }
}
