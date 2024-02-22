package task1;

public class Customer {
    private DiscountCard discountCard;
    private int ageCustomer;
    private String nameCustomer;

    public int getAgeCustomer() {
        return ageCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setAgeCustomer(int ageCustomer) {
        this.ageCustomer = ageCustomer;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public Customer(DiscountCard discountCard, int age, String nameCustomer) {
        this.discountCard = discountCard;
        this.ageCustomer = age;
        this.nameCustomer = nameCustomer;
    }
}
