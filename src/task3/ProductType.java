package task3;

public enum ProductType {

   APPLE(5.0), POTATO(3.0), MILK(20.0),BEER(15.0), TOBACCO(30.0);

   public double cost;


   public double getCost() {
      return cost;
   }

   public void setCost(double cost) {
      this.cost = cost;
   }


   ProductType(double cost) {
      this.cost = cost;
   }
}
