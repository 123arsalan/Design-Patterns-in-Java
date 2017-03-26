/**
 * Created by mhfrough on 11/12/16.
 */
public class ExtraCheese extends ToppingDecorator {
    public ExtraCheese(Pizza newPizza){
        super(newPizza);
        System.out.println("Adding Cheese");
    }
    public String getDescription(){
        return tempPizza.getDescription() + ", Cheese";
    }
    public double getCost(){
        System.out.println("Cost of cheese: " + .32);
        return tempPizza.getCost() + .32;
    }
}
