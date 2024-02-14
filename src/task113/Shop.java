package task11;

public class Shop {
    private String nameShop;
    private String nameSeller;
    private String nameCustomer;
    private String nameProduct;

    public Shop(String nameShop, String nameSeller, String nameCustomer, String nameProduct) {
        this.nameShop = nameShop;
        this.nameSeller = nameSeller;
        this.nameCustomer = nameCustomer;
        this.nameProduct = nameProduct;
    }

//    public int returnCost(boolean honest; boolean alcohol; boolean sale; int cost; int age){
//        if (age < 18){
//            else if(honest == true & alcohol == true){
//                return cost = 0;
//            }
//            else if(honest == false & alcohol == true){
//                return cost = cost - (cost * 10%);
//            }
//        }
//        if(sale == true){
//            return cost = cost - (cost * 10%);
//            }
//        if(sale == false){
//                return cost;
//            }
//        System.out.println("Уважаемый покупатель " + nameCustomer +  ", продавец" + nameSeller +  " нашего магазина" + nameShop +
//                        ", продаст вам этот товар" + nameProduct +
//                ", \nв них есть алкогольная продукция, а ваш возвраст" + age + "Стоимость вашей покупки равна " + cost + "Ваша скидка");
//    }


}
