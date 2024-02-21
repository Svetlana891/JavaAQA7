package task1;

public class Seller {
    private Trustful trustful;

    public Trustful getTrustful() {
        return trustful;
    }

    public void setTrustful(Trustful trustful) {
        this.trustful = trustful;
    }

    public Seller(Trustful trustful) {
        this.trustful = trustful;
    }
}
