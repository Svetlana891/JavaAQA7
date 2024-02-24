package task3;

public class Shop {




    public double buyProducts(Father father, Product[] goods ) throws NotEnoughMoneyException, WrongProductException, IncorrectCountOfGoodsException {
        double summ;
        double summ1 = 0;
//        double summ2 = 0;

        Product[] goods = new Product[2];
        for (int i = 0, i < 2, i++){
            goods[i] = product[i].type;
        }



        // TODO: 23.02.2024 count of productType < 2


        if (foodCount > 0) {
            if (food.equals(ProductType.APPLE)) {
                summ1 = father.getMoney() - ProductType.APPLE.getCost() * foodCount;
            } else if (food.equals(ProductType.POTATO)) {
                summ1 = father.getMoney() - ProductType.POTATO.getCost() * foodCount;
            } else if (food.equals(ProductType.MILK)) {
                summ1 = father.getMoney() - ProductType.MILK.getCost() * foodCount;
            } else if (food.equals(ProductType.BEER)) {
                summ1 = father.getMoney() - ProductType.BEER.getCost() * foodCount;
            } else if (food.equals(ProductType.TOBACCO)) {
                summ1 = father.getMoney() - ProductType.TOBACCO.getCost() * foodCount;
            }
        }

//        if (productCount > 0) {
//            if (product.equals(Product.APPLE)) {
//                summ2 = father.getMoney() - ProductType.APPLE.getCost() * productCount;
//            } else if (product.equals(Product.POTATO)) {
//                summ2 = father.getMoney() - ProductType.POTATO.getCost() * productCount;
//            } else if (product.equals(Product.MILK)) {
//                summ2 = father.getMoney() - ProductType.MILK.getCost() * productCount;
//            } else if (product.equals(Product.BEER)) {
//                summ2 = father.getMoney() - ProductType.BEER.getCost() * productCount;
//            } else if (product.equals(Product.TOBACCO)) {
//                summ2 = father.getMoney() - ProductType.TOBACCO.getCost() * productCount;
//            }
//        }
        System.out.println("Уважаемый ...");

        summ = summ1 + summ2;
        if (summ > father.getMoney()) {
            throw new NotEnoughMoneyException();
        } else if (food.equals(ProductType.BEER) || product.equals(Product.BEER)) {
            throw new WrongProductException();
        } else if (foodCount % 3 != 0) {
            throw new IncorrectCountOfGoodsException();
        } else {
            return summ;
        }


    }
}
