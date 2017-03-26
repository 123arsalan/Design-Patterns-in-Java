/**
 * Created by mhfrough on 11/26/16.
 */
public class Main {
    public static void main(String[] args){
        ShapeFactory obj = new ShapeFactory();
        IShape shapeA = obj.getSape("circle");
        IShape shapeB = obj.getSape("circle");
        IShape shapeC = obj.getSape("circle");
    }
}
