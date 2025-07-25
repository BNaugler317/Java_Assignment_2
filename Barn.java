import animal.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Barn {
  private static Scanner input = new Scanner(System.in);
  private static ArrayList<Cow> cows = new ArrayList<>();
  private static ArrayList<Chicken> chickens = new ArrayList<>();

  public static void main(String [] args) {

    System.out.print("How many animals are there in the barn?");
    int barnCount = input.nextInt();

    // loop for animal creation
    for(int i = 0; i < barnCount; i++) {
      while (true) {
        System.out.printf("%nEnter Animal: %d type (cow/chicken): ", i + 1);
        String type = input.next().toLowerCase();

        if(type.equals("cow")) {
          Cow cow = new Cow("Cow"); // creates a new cow
          cows.add(cow);
        
          break; // if valid moves on to next animal
        
          }else if  // creates a new chicken

          (type.equals("chicken")) {
          String [] eggColors = {"Brown", "White"};
          String randomColor = eggColors[Animal.randNum.nextInt(eggColors.length)];
          Chicken newChicken = new Chicken("Chicken", randomColor);
          chickens.add(newChicken);

          break; // if vaild moves on to next animal

          } else {
            System.out.println("Invalid animal type. Please try again.");
          }
          }
    } // for

    // printing animal details
    // print cow
    for(int i = 0; i < cows.size(); i++) {
      System.out.printf("Type: %s Jugs of milk: %d (per day)%n", cows.get(i).getType(), cows.get(i).getMilkPerDay());
    }
    // print chicken
    for(int i = 0; i < chickens.size(); i++) {
      System.out.printf("Type: %s Egg Color: %s%n", chickens.get(i).getType(), chickens.get(i).getEggColor());
    }

    input.close();
    
  }
}