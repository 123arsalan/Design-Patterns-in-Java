/**
 * Created by mhfrough on 11/12/16.
 */
public class Tikka extends ToppingDecorator {
    public Tikka(Pizza newPizza){
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Add Botti");
    }
    public String getDescription(){
        return tempPizza.getDescription() + ", Tikka Botti";
    }
    public double getCost(){
        System.out.println("Cost of Botti: " + .56);
        return tempPizza.getCost() + .56;
    }
}
