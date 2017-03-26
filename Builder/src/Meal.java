import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by glab on 10/15/16.
 */
public class Meal {
    public List<Item> items = new ArrayList<Item>();

    public void addIteam(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
    public void showItem(){
        for(Item item:items){
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
