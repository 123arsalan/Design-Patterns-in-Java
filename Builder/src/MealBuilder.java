import com.intellij.lexer.__XmlLexer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by glab on 10/15/16.
 */
public class MealBuilder {
    Meal meal  = new Meal();

    public Meal prepareVegMeal(){
        meal.addIteam(new VegBurger());
        meal.addIteam(new Coke());
        return meal;
    }
    public Meal preapareChickenMeal(){
        meal.addIteam(new ChickenBurger());
        meal.addIteam(new Pepsi());
        return meal;
    }

    //private List<Meal> m = new ArrayList<Meal>();

    public Meal prepareUser(Meal abc){
        meal.items.addAll(abc.addIteam());
        return meal;
    }


}
