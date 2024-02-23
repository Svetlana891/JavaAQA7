package task3;

public class Father {
    private String nameFather;
    private int money;
    private Food food;
    private Product goods;
    private int foodCount;
    private int productCount;

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Product getGoods() {
        return goods;
    }

    public void setGoods(Product goods) {
        this.goods = goods;
    }



    public int getPrice() {
        int summ = 0;
        int summ1 = 0;
        int summ4 = 0;

        if (food.equals(Food.APPLE) || goods.equals(Product.APPLE)) {
            summ1 = money - (Food.APPLE.getCost() * count);
        } else if (food.equals(Food.POTATO) || goods.equals(Product.POTATO)) {
            int summ2 = money - Food.POTATO.getCost() * count;
        } else if (food.equals(Food.MILK) || goods.equals(Product.MILK)) {
            int summ3 = money - Food.MILK.getCost() * count;
        } else if (food.equals(Food.BEER) || goods.equals(Product.BEER)) {
            summ4 = money - Food.BEER.getCost() * count;
        } else if (food.equals(Food.TOBACCO) || goods.equals(Product.TOBACCO)) {
            int summ5 = money - Food.TOBACCO.getCost() * count;
        }

        summ = summ1 + summ4;

        return summ;

    }

    public static void main(String[] args) {
        Father father1 = new Father("Mark", 200, Food.APPLE, Product.BEER);
        System.out.println(father1.getPrice());

    }



}































