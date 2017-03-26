/**
 * Created by mhfrough on 11/12/16.
 */
public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza){
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Add Moz");
    }
    public String getDescription(){
        return tempPizza.getDescription() + ", Mozzarella";
    }
    public double getCost(){
        System.out.println("Cost of Moz: " + .50);
        return tempPizza.getCost() + .50;
    }
}
