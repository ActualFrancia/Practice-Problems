import java.util.*;

public class CCC_06_J1_CanadianCalorie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int calorieTotal = burgerCalories(in.nextInt()) 
                            + sideCaloires(in.nextInt())
                            + drinkCaloires(in.nextInt()) 
                            + dessertCaloires(in.nextInt());

        System.out.println("Your total Calorie count is " + calorieTotal + ".");
        in.close();
    }

    public static int burgerCalories(int digitChoice) {
        switch (digitChoice) {
            case 1: // Cheeseburger
                return 461;
            case 2: // Fish Burger
                return 431;
            case 3: // Veggie Burger
                return 420;
            default: // No Burger
                return 0;
        }
    }

    public static int drinkCaloires(int digitChoice) {
        switch (digitChoice) {
            case 1: // Soft Drink
                return 130;
            case 2: // Orange Juice
                return 160;
            case 3: // Milk
                return 118;
            default: // No Drink
                return 0;
        }
    }

    public static int sideCaloires(int digitChoice) {
        switch (digitChoice) {
            case 1: // Fries
                return 100;
            case 2: // Baked Potatoe
                return 57;
            case 3: // Chef Salaf
                return 70;
            default: // No Side
                return 0;
        }
    }

    public static int dessertCaloires(int digitChoice) {
        switch (digitChoice) {
            case 1: // Apple Pie
                return 167;
            case 2: // Sundae
                return 266;
            case 3: // Fruit Cup
                return 75;
            default: // No Dessert
                return 0;
        }
    }

}
