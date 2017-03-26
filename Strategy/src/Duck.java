/**
 * Created by glab on 10/1/16.
 */
public abstract class Duck {
    public IQuack Quack;
    public IFly Fly;
    public Duck(IQuack q, IFly f){
        this.Quack = q;
        this.Fly= f;
    }

    public void Swim(){
        System.out.println("Swimming");
    }
    public void Display(){
        System.out.println("Picture");
    }
}
