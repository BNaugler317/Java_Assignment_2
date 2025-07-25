package animal;

public class Chicken extends Animal {
  private String eggColor;

  // Explicit constructor that calls Animal's Parameterized constructor
  public Chicken(String type, String eggColor) {
    super(type); // call's Animal's constructor with type
    
    if (isValidEggColor(eggColor)) {
      this.eggColor = eggColor;
    } else {
      this.eggColor = "Brown"; // default fall back color
      System.out.println("Invalid egg color (must be Brown or White). Defaulting to Brown.");
    }
  }
    private boolean isValidEggColor(String color) {
      return color.equalsIgnoreCase("Brown") ||
             color.equalsIgnoreCase("White");
             
    }
    
   // constructor

  // getters
  public String getEggColor() {
    return this.eggColor;
  }

  // setters
  public void setEggColor(String eggColor) {
    this.eggColor = eggColor;
  }
  
  @Override
  public String getDetails() {
    return String.format("Type: %s, Egg Color: %s", type, eggColor);
  }
}
