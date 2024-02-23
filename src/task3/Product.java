package task3;

public enum Product {
    APPLE(40), POTATO(30), MILK(50),BEER(60), TOBACCO(70);
    public int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    Product(int cost) {
        this.cost = cost;
    }
}
