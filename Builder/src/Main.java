import org.apache.xmlbeans.impl.jam.mutable.MElement;

/**
 * Created by glab on 10/15/16.
 */
public class Main {
    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg meal");
        vegMeal.showItem();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVeg = mealBuilder.preapareChickenMeal();
        System.out.print("Non-Veg Meal");
        nonVeg.showItem();
        System.out.println("Total cost: " + vegMeal.getCost());

        //MElement user = mealBuilder.prepareUser()

        //Meal user = mealBuilder.prepareUser(new Coke(),nw);

//        Meal user = mealBuilder.prepareUser(new Coke());
//        System.out.print("Non-Veg Meal");
//        nonVeg.showItem();
//        System.out.println("Total cost: " + vegMeal.getCost());
    }
}
