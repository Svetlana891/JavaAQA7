package task3;

public enum Food {

   APPLE(5), POTATO(3), MILK(20),BEER(15), TOBACCO(30);

   public int cost;


   public int getCost() {
      return cost;
   }

   public void setCost(int cost) {
      this.cost = cost;
   }


   Food(int cost) {
      this.cost = cost;
   }
}
