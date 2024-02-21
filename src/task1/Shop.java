package task1;

public class Shop  {
    // TODO: 22.02.2024 shop implemens interfase ShopI du 
    private String nameShop;
    private double discount = 0.9;


    public Shop(String nameShop) {
        this.nameShop = nameShop;
    }

    public double returnCost( Product product, Seller seller, Customer customer) {
        double costSummary = 0;

        if (customer.getAge() < 18) {
          if (product1.equals(DiscountCard.FULL_PRICE) & quality.equals(Trustful.HONEST)) {
              System.out.println("Уважаемый " + Customer.nameCustomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                      ageCustomer + " несоответствует. Стоимость вашей покупки равна " + cost);
                return cost;

            } else if (product1.equals(DiscountCard.WITH_SELL) & quality.equals(Trustful.HONEST)) {
              System.out.println("Уважаемый " + nameCustomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                      ageCustomer + " несоответствует. Стоимость вашей покупки равна " + (cost * discount) + " .Вот вам скидка 10%");
                return cost * discount;

            } else if (product1.equals(DiscountCard.FULL_PRICE) & quality.equals(Trustful.NOT_HONEST)) {
              System.out.println("Уважаемый " + nameCustomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                      ageCustomer + " сойдет. Стоимость вашей покупки равна" + cost + alcohol);
                return cost + alcohol;

            } else if (product1.equals(DiscountCard.WITH_SELL) & quality.equals(Trustful.NOT_HONEST)) {
              System.out.println("Уважаемый " + nameCustomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                      ageCustomer + " сойдет. Стоимость вашей покупки равна" + ((cost + alcohol) * discount) + "Вот вам скидка 10%");
                return (cost + alcohol) * discount;

            }

        }
        else {
            if (product1.equals(DiscountCard.FULL_PRICE)) {
                System.out.println("Уважаемый " + nameCustomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                        + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                        ageCustomer + " соответствует. Стоимость вашей покупки равна" + cost + alcohol);
                return cost + alcohol;

            } else if (product1.equals(DiscountCard.WITH_SELL)) {
                System.out.println("Уважаемый " + nameCustomer + " ,продавец " + nameSeller + " нашего магазина " + nameShop
                        + ",продаст вам этот товар " + nameProduct + " ,в них есть алкогольная продукция, а ваш возратс " +
                        ageCustomer + " соответствует. Стоимость вашей покупки равна" + ((cost + alcohol) * discount) + "Вот вам скидка");
                return (cost + alcohol) * discount;

            }
        }
        return cost;

    }







}
