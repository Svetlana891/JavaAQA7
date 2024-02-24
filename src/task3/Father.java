package task3;

public class Father {
    private String nameFather;
    private double money;


    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Father(String nameFather, double money) {
        this.nameFather = nameFather;
        this.money = money;
    }







//    public double getPrice() throws NotEnoughMoneyException, WrongProductException, IncorrectCountOfGoodsException{
//        double summ;
//        double summ1 = 0;
//        double summ2 = 0;
//
//        if(foodCount > 0) {
//            if (food.equals(Food.APPLE)) {
//                summ1 = money - Food.APPLE.getCost() * foodCount;
//            } else if (food.equals(Food.POTATO)) {
//                summ1 = money - Food.POTATO.getCost() * foodCount;
//            } else if (food.equals(Food.MILK)) {
//                summ1 = money - Food.MILK.getCost() * foodCount;
//            } else if (food.equals(Food.BEER)) {
//                summ1 = money - Food.BEER.getCost() * foodCount;
//            } else if (food.equals(Food.TOBACCO)) {
//                summ1 = money - Food.TOBACCO.getCost() * foodCount;
//            }
//        }
//
//        if(productCount > 0) {
//            if (product.equals(Product.APPLE)) {
//                summ2 = money - Food.APPLE.getCost() * productCount;
//            } else if (product.equals(Product.POTATO)) {
//                summ2 = money - Food.POTATO.getCost() * productCount;
//            } else if (product.equals(Product.MILK)) {
//                summ2 = money - Food.MILK.getCost() * productCount;
//            } else if (product.equals(Product.BEER)) {
//                summ2 = money - Food.BEER.getCost() * productCount;
//            } else if (product.equals(Product.TOBACCO)) {
//                summ2 = money - Food.TOBACCO.getCost() * productCount;
//            }
//        }
//        System.out.println("Уважаемый");
//
//        summ = summ1 + summ2;
//        if(summ > money){
//            throw new NotEnoughMoneyException();
//        } else if (food.equals(Food.BEER) || product.equals(Product.BEER)) {
//            throw new WrongProductException();
//        } else if (foodCount % 3 != 0) {
//            throw new IncorrectCountOfGoodsException();
//        } else {
//            return summ;
//        }
//
//
//
//
//
//
//    }







}































