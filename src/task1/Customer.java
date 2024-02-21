package task1;

public class Customer {
    private DiscountCard discountCard;
    private int age;
    private String nameCustomer;

    public int getAge() {
        return age;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public Customer(DiscountCard discountCard, int age, String nameCustomer) {
        this.discountCard = discountCard;
        this.age = age;
        this.nameCustomer = nameCustomer;
    }
}
