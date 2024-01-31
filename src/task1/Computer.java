package task1;

import java.util.Objects;

public class Computer {
    private String brand;
    private int price;
    private int rAm;
    private int videoCard;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getrAm() {
        return rAm;
    }

    public void setrAm(int rAm) {
        this.rAm = rAm;
    }

    public int getVideoCard() {
        return videoCard;
    }
    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public Computer(String brand, int price, int rAm, int videoCard) {
        this.brand = brand;
        this.price = price;
        this.rAm = rAm;
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "Создан РС." + "\nИмя = " + brand + "\nЦена = " + price + "\nОбьем видеокарты = " + videoCard +
                "\nОбьем оперативной памяти = " + rAm;
    }

    public void getInfo(){
        System.out.println(getBrand());
        System.out.println(getPrice());
        System.out.println(rAm);
        System.out.println(getVideoCard());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return rAm == computer.rAm && videoCard == computer.videoCard && Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, rAm, videoCard);
    }


}
