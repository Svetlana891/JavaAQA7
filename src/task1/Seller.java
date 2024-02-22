package task1;

public class Seller {
    private Reliability reliability;
    private String nameSeller;

    public String getNameSeller() {
        return nameSeller;
    }

    public void setNameSeller(String nameSeller) {
        this.nameSeller = nameSeller;
    }

    public Reliability getReliability() {
        return reliability;
    }

    public void setReliability(Reliability reliability) {
        this.reliability = reliability;
    }

    public Seller(Reliability reliability, String nameSeller) {
        this.reliability = reliability;
        this.nameSeller = nameSeller;
    }




}
