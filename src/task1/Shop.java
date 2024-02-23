package task1;

public class Shop implements GlobalShop {
    private String nameShop;
    private double discount = 0.9;

    public Shop(String nameShop) {
        this.nameShop = nameShop;
    }

    @Override
    public double returnCost(Product product, Seller seller, Customer customer) {
        double costSummary = 0;

        if (customer.getAgeCustomer() < 18) {
            if (product.getProductType().equals(ProductType.NOT_ALCOHOL) && seller.getReliability().equals(Reliability.HONEST) &&
                    customer.getDiscountCard().equals(DiscountCard.FULL_PRICE)) {
                costSummary = product.getPrice();
                System.out.println("Уважаемый " + customer.getNameCustomer() + ", продавец " + seller.getNameSeller() +
                        " нашего магазина " + nameShop + ", продаст вам этот товар " + product.getName() +
                        ". Стоимость вашей покупки равна " + costSummary);
            } else if (product.getProductType().equals(ProductType.NOT_ALCOHOL) && seller.getReliability().equals(Reliability.HONEST)
                    && (customer.getDiscountCard().equals(DiscountCard.WITH_SELL))) {
                costSummary = product.getPrice() * discount;
                System.out.println("Уважаемый " + customer.getNameCustomer() + ", продавец " + seller.getNameSeller() +
                        " нашего магазина " + nameShop + ", продаст вам этот товар " + product.getName() +
                        ". Стоимость вашей покупки равна " + costSummary + ". Вот вам скидка 10%");
            } else if (product.getProductType().equals(ProductType.ALCOHOL) && seller.getReliability().equals(Reliability.HONEST)) {
                System.out.println("Уважаемый " + customer.getNameCustomer() + ", продавец " + seller.getNameSeller() +
                        " нашего магазина " + nameShop + ", не продаст вам этот товар " + product.getName() +
                        ". Это алкогольная продукция, а ваш возратс " + customer.getAgeCustomer() +
                        " лет - несоответствует. Стоимость вашей покупки равна " + costSummary);
            } else if (customer.getDiscountCard().equals(DiscountCard.FULL_PRICE) && seller.getReliability().equals(Reliability.NOT_HONEST)) {
                costSummary = product.getPrice();
                System.out.println("Уважаемый " + customer.getNameCustomer() + ", продавец " + seller.getNameSeller() +
                        " нашего магазина " + nameShop + ", продаст вам этот товар " + product.getName() +
                        ". В них есть алкогольная продукция, а ваш возратс " + customer.getAgeCustomer() +
                        " лет - соответствует. Стоимость вашей покупки равна" + costSummary);
            } else if (customer.getDiscountCard().equals(DiscountCard.WITH_SELL) && seller.getReliability().equals(Reliability.NOT_HONEST)) {
                costSummary = product.getPrice() * discount;
                System.out.println("Уважаемый " + customer.getNameCustomer() + ", продавец " + seller.getNameSeller() +
                        " нашего магазина " + nameShop + ", продаст вам этот товар " + product.getName() +
                        ". В них есть алкогольная продукция, а ваш возратс " + customer.getAgeCustomer() +
                        " лет - соответствует. Стоимость вашей покупки равна " + costSummary + ". Вот вам скидка 10%");
            }
        } else {
            if (customer.getDiscountCard().equals(DiscountCard.FULL_PRICE)) {
                costSummary = product.getPrice();
                System.out.println("Уважаемый " + customer.getNameCustomer() + ", продавец " + seller.getNameSeller() +
                        " нашего магазина " + nameShop + ", продаст вам этот товар " + product.getName() +
                        ". Стоимость вашей покупки равна " + costSummary);
            } else if (customer.getDiscountCard().equals(DiscountCard.WITH_SELL)) {
                costSummary = product.getPrice() * discount;
                System.out.println("Уважаемый " + customer.getNameCustomer() + ", продавец " + seller.getNameSeller() +
                        " нашего магазина " + nameShop + ", продаст вам этот товар " + product.getName() +
                        ". Стоимость вашей покупки равна " + costSummary + ". Вот вам скидка 10%");
            }
        }
        return costSummary;

    }


}
