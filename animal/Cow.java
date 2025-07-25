package animal;

public class Cow extends Animal {
  private int milkPerDay;

   // Explicit constructor that calls Animal's Parameterized constructor
   public Cow(String type) {
    super(type); // calls parent's constructor
    this.milkPerDay = Animal.randNum.nextInt(6) + 10; // 10 - 15
   } // constructor

   // getters
   public int getMilkPerDay(){
    return this.milkPerDay;
   }

   // setters
   public void setMilkPerDay(int milkPerDay) {
    this.milkPerDay = milkPerDay;
   }

    @Override
    public String getDetails() {
      return String.format("Type %s, Milk per day: %dL", type, milkPerDay);
    }
   
}