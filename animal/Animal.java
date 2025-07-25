package animal;
import java.util.Random;

public abstract class Animal { // declare abstract class is ref'ed by cow and chicken
  protected String type;

  public static final Random randNum = new Random();

  public Animal(String type){ // Animal constructor
    this.type = type;
  }

  public String getType() { // getter method
    return type;
  }

  public abstract String getDetails();
}