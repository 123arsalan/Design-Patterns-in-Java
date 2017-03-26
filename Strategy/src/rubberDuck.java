/**
 * Created by glab on 10/1/16.
 */
public class rubberDuck extends Duck {
    public rubberDuck(){
        super(new notQuack(), new notFly());
        super.Display();
        super.Swim();
    }
}
