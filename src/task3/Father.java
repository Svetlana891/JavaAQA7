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

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }


    public Father(String nameFather, int money, Food food, Product goods, int foodCount, int productCount) {
        this.nameFather = nameFather;
        this.money = money;
        this.food = food;
        this.goods = goods;
        this.foodCount = foodCount;
        this.productCount = productCount;
    }

    public int getPrice() throws NotEnoughMoneyException, WrongProductException, IncorrectCountOfGoodsException{
        int summ;
        int summ1 = 0;
        int summ2 = 0;

        if(foodCount > 0) {
            if (food.equals(Food.APPLE)) {
                summ1 = money - Food.APPLE.getCost() * foodCount;
            } else if (food.equals(Food.POTATO)) {
                summ1 = money - Food.POTATO.getCost() * foodCount;
            } else if (food.equals(Food.MILK)) {
                summ1 = money - Food.MILK.getCost() * foodCount;
            } else if (food.equals(Food.BEER)) {
                summ1 = money - Food.BEER.getCost() * foodCount;
            } else if (food.equals(Food.TOBACCO)) {
                summ1 = money - Food.TOBACCO.getCost() * foodCount;
            }
        }

        if(productCount > 0) {
            if (goods.equals(Product.APPLE)) {
                summ2 = money - Food.APPLE.getCost() * productCount;
            } else if (goods.equals(Product.POTATO)) {
                summ2 = money - Food.POTATO.getCost() * productCount;
            } else if (goods.equals(Product.MILK)) {
                summ2 = money - Food.MILK.getCost() * productCount;
            } else if (goods.equals(Product.BEER)) {
                summ2 = money - Food.BEER.getCost() * productCount;
            } else if (goods.equals(Product.TOBACCO)) {
                summ2 = money - Food.TOBACCO.getCost() * productCount;
            }
        }

        summ = summ1 + summ2;
        if(summ > money){
            throw new NotEnoughMoneyException();
        } else if (food.equals(Food.BEER) || goods.equals(Product.BEER)) {
            throw new WrongProductException();
        } else if (foodCount % 3 != 0) {
            throw new IncorrectCountOfGoodsException();
        } else {
            return summ;
        }



    }

    public static void main(String[] args) {
        Father father1 = new Father("Mark", 200, Food.APPLE, Product.BEER, 3, 2);
        System.out.println(father1.getPrice());

    }



}































