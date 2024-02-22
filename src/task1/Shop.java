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

        if (customer.getAgeCustomer() < 18) {
          if (product.getProductType().equals(ProductType.NOT_ALCOHOL) & seller.getReliability().equals(Reliability.HONEST) & customer.getDiscountCard().equals(DiscountCard.FULL_PRICE)) {
              System.out.println("Уважаемый " + customer.getNameCustomer() + " ,продавец " + seller.getNameSeller() + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + product.getName() + " ,в них есть алкогольная продукция, а ваш возратс " +
                      customer.getAgeCustomer() + " несоответствует. Стоимость вашей покупки равна " + product.getPrice());
                return product.getPrice();
            } else if (product.getProductType().equals(ProductType.NOT_ALCOHOL) & seller.getReliability().equals(Reliability.HONEST) & (customer.getDiscountCard().equals(DiscountCard.WITH_SELL))) {
              System.out.println("Уважаемый " + customer.getNameCustomer() + " ,продавец " + seller.getNameSeller() + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + product.getName() + " ,в них есть алкогольная продукция, а ваш возратс " +
                      customer.getAgeCustomer() + " несоответствует. Стоимость вашей покупки равна " + product.getPrice() * discount + " .Вот вам скидка 10%");
              return product.getPrice() * discount;

            } else if (product.getProductType().equals(ProductType.ALCOHOL) & seller.getReliability().equals(Reliability.HONEST)) {
              System.out.println("Уважаемый " + customer.getNameCustomer() + " ,продавец " + seller.getNameSeller() + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + product.getName() + " ,в них есть алкогольная продукция, а ваш возратс " +
                      customer.getAgeCustomer() + " несоответствует. Стоимость вашей покупки равна " + 0 + " .Вот вам скидка 10%");
                return 0;

            } else if (customer.getDiscountCard().equals(DiscountCard.FULL_PRICE) & seller.getReliability().equals(Reliability.NOT_HONEST)) {
              System.out.println("Уважаемый " + customer.getNameCustomer() + " ,продавец " + seller.getNameSeller() + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + product.getName() + " ,в них есть алкогольная продукция, а ваш возратс " +
                      customer.getAgeCustomer() + " сойдет. Стоимость вашей покупки равна" + product.getPrice());
                return product.getPrice();

            } else if (customer.getDiscountCard().equals(DiscountCard.WITH_SELL) & seller.getReliability().equals(Reliability.NOT_HONEST)) {
              System.out.println("Уважаемый " + customer.getNameCustomer() + " ,продавец " + seller.getNameSeller() + " нашего магазина " + nameShop
                      + ",продаст вам этот товар " + product.getName() + " ,в них есть алкогольная продукция, а ваш возратс " +
                      customer.getAgeCustomer() + " сойдет. Стоимость вашей покупки равна" + product.getPrice() * discount + "Вот вам скидка 10%");
                return product.getPrice() * discount;

            }

        }
        else {
            if (customer.getDiscountCard().equals(DiscountCard.FULL_PRICE)) {
                System.out.println("Уважаемый " + customer.getNameCustomer() + " ,продавец " + seller.getNameSeller() + " нашего магазина " + nameShop
                        + ",продаст вам этот товар " + product.getName() + " ,в них есть алкогольная продукция, а ваш возратс " +
                        customer.getAgeCustomer() + " соответствует. Стоимость вашей покупки равна" + product.getPrice());
                return product.getPrice();

            } else if (customer.getDiscountCard().equals(DiscountCard.WITH_SELL)) {
                System.out.println("Уважаемый " + customer.getNameCustomer() + " ,продавец " + seller.getNameSeller() + " нашего магазина " + nameShop
                        + ",продаст вам этот товар " + product.getName() + " ,в них есть алкогольная продукция, а ваш возратс " +
                        customer.getAgeCustomer() + " соответствует. Стоимость вашей покупки равна" + product.getPrice() * discount + "Вот вам скидка");
                return product.getPrice() * discount;

            }
        }
        return costSummary;

    }







}
