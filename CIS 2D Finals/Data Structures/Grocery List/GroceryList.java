import java.util.ArrayList;
import java.util.Arrays;


public class GroceryList {

    public static void main(String[] args) {
        ArrayList<String> foodList = new ArrayList<>(Arrays.asList("cookies",
                "marshmellow", "ice cream", "flamin hot cheetos", "popcorn"));

        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList("water", "milk", "orange juice",
                "coca cola", "root beer", "dr.pepper", "mountain dew", "bang energy"));

        foodList.add("Pizza");
        //foodList.addAll(drinkList) will combine the food list and drink list together
        foodList.addAll(drinkList);

        System.out.println(foodList);

        //this will remove an item from the list
        if (foodList.contains("coca cola"))
            foodList.remove("coca cola");

        //it will print out the original list of items and a second same list but the
        // item that has been chosen to be removed on line 22 wont be shown
        System.out.println(foodList);

    }
}
