/**
 * Created by mhfrough on 11/12/16.
 */
public class Sheep implements Animal{
    public Sheep(){
        System.out.println("Sheap is Made");
    }
    public Animal makeCopy(){
        System.out.println("Sheap is Being Made");
        Sheep sheepObject = null;
        try{
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("The Sheep was Turned to Mush");
            e.printStackTrace();
        }
        return sheepObject;
    }
    public String toString(){
        return "Dolly is my Hero, Baaaaa";
    }
}
