/**
 * Created by mhfrough on 11/26/16.
 */
public class ShapeFactory {
    public IShape getSape(String shapeType){
        if(shapeType.equals("circle")){
            return new Circle();
        }
        if(shapeType.equals("square")){
            return new Circle();
        }
        if(shapeType.equals("rectangle")){
            return new Circle();
        } else {
            return null;
        }
    }
}
