/**
 * Created by mhfrough on 11/15/16.
 */
public class Cow implements Animal {
    public Cow() { System.out.println("Cow is Made"); }
    public Animal makeCopy() {
        System.out.println("Cow is Being Made");
        Cow cowObject = null;
        try {
            cowObject = (Cow) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("The Cow was Turned to Mush");
            e.printStackTrace();
        }
        return cowObject;
    }
    public String toString(){
        return "I wish, i was a Butterfly, Moo";
    }
}
