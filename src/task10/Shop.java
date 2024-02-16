package task10;

public class Shop {
    private String nameShop;
    private String nameSeller;
    private String nameCostomer;
    private String nameProduct;
    private int cost;
    private int ageCostomer;
    private int alcohol;


    public Shop(String nameShop, String nameSeller, String nameCostomer, String nameProduct) {
        this.nameShop = nameShop;
        this.nameSeller = nameSeller;
        this.nameCostomer = nameCostomer;
        this.nameProduct = nameProduct;
    }

    public int returnCost(int cost, int ageCostomer, Sell product, Seller quality, int alcohol) {
        if (ageCostomer < 18) {
        } else if (product.equals(Sell.PRODUCT) & quality.equals(Seller.HONEST)) {
            alcohol = 0;
            return cost = cost;
            System.out.println("Уважаемый " + nameCostomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                    + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                    ageCostomer + " несоответствует. Стоимость вашей покупки равна " + cost);
        } else if (product.equals(Sell.PRODUCTWITHSELL) & quality.equals(Seller.HONEST)) {
            alcohol = 0;
            return cost = cost - (cost * 0,1);
            System.out.println("Уважаемый " + nameCostomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                    + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                    ageCostomer + " несоответствует. Стоимость вашей покупки равна " + cost + " .Вот вам скидка 10%");
        } else if (product.equals(Sell.PRODUCT) & quality.equals(Seller.NOTHONEST)) {
            return cost = cost + alcohol;
            System.out.println("Уважаемый " + nameCostomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                    + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                    ageCostomer + " сойдет. Стоимость вашей покупки равна" + cost);
        } else if (product.equals(Sell.PRODUCTWITHSELL) & quality.equals(Seller.NOTHONEST)) {
            return cost = cost - ((cost + alcohol) * 0,1);
            System.out.println("Уважаемый " + nameCostomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                    + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                    ageCostomer + " сойдет. Стоимость вашей покупки равна" + cost + "Вот вам скидка 10%");
        }

        if (ageCostomer > 18) {
        } else if (product.equals(Sell.PRODUCT)) {
            return cost = cost + alcohol;
            System.out.println("Уважаемый " + nameCostomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                    + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                    ageCostomer + " соответствует. Стоимость вашей покупки равна" + cost);
        } else if (product.equals(Sell.PRODUCTWITHSELL)) {
            return cost = (cost + alcohol) - ((cost + alcohol) * 0,1);
            System.out.println("Уважаемый " + nameCostomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                    + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                    ageCostomer + " соответствует. Стоимость вашей покупки равна" + cost + "Вот вам скидка");
        }

    }







}
