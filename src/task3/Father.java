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

    public double buyProducts(int type1Count, int type2Count, ProductType1 type1, ProductType2 type2)
            throws NotEnoughMoneyException, WrongProductException, IncorrectCountOfGoodsException {

        double summ;
        double summ1 = 0;
        double summ2 = 0;

        if (type1Count > 0) {
            if (type1.equals(ProductType1.APPLE)) {
                summ1 = money - ProductType1.APPLE.getCost() * type1Count;
            } else if (type1.equals(ProductType1.POTATO)) {
                summ1 = money - ProductType1.POTATO.getCost() * type1Count;
            } else if (type1.equals(ProductType1.MILK)) {
                summ1 = money - ProductType1.MILK.getCost() * type1Count;
            } else if (type1.equals(ProductType1.BEER)) {
                summ1 = money - ProductType1.BEER.getCost() * type1Count;
            } else if (type1.equals(ProductType1.TOBACCO)) {
                summ1 = money - ProductType1.TOBACCO.getCost() * type1Count;
            }
        }

        if (type2Count > 0) {
            if (type2.equals(ProductType2.APPLE)) {
                summ2 = summ1 - ProductType2.APPLE.getCost() * type2Count;
            } else if (type2.equals(ProductType2.POTATO)) {
                summ2 = summ1 - ProductType2.POTATO.getCost() * type2Count;
            } else if (type2.equals(ProductType2.MILK)) {
                summ2 = summ1 - ProductType2.MILK.getCost() * type2Count;
            } else if (type2.equals(ProductType2.BEER)) {
                summ2 = summ1 - ProductType2.BEER.getCost() * type2Count;
            } else if (type2.equals(ProductType2.TOBACCO)) {
                summ2 = summ1 - ProductType2.TOBACCO.getCost() * type2Count;
            }
        }

        System.out.println("Уважаемый ...");

        summ = summ2;
        if (summ > money) {
            throw new NotEnoughMoneyException();
        } else if (type1.equals(ProductType1.BEER) || type2.equals(ProductType2.BEER)) {
            throw new WrongProductException();
        } else if (type1Count % 3 != 0 || type2Count % 3 != 0) {
            throw new IncorrectCountOfGoodsException();
        } else {
            return summ;
        }


    }
}
