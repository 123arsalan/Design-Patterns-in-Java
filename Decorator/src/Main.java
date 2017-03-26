/**
 * Created by mhfrough on 11/12/16.
 */
public class Main {
    public static void main(String[] args){
        Pizza PizzaTypeA = new TomatoSauce(new TomatoSauce(new Mozzarella(new PlainPizza())));
        System.out.println("Ingredients: " + PizzaTypeA.getDescription());
        System.out.println("Price: " + PizzaTypeA.getCost());
    }
}
