/**
 * Created by mhfrough on 11/12/16.
 */
public class TestCloning {
    public static  void main(String[] args){
        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();
        Sheep wally = sally;
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally HashCode: "+System.identityHashCode(sally));
        System.out.println("Wally HashCode: "+System.identityHashCode(wally));
        System.out.println("Clone HashCode: "+System.identityHashCode(clonedSheep));

//        Cow taylor = new Cow();
//        Cow clonedCow = (Cow) animalMaker.getClone(taylor);
//        System.out.println(clonedCow);
//        System.out.println("Taylor HashCode: "+System.identityHashCode(taylor));
//        System.out.println("Clone HashCode: "+System.identityHashCode(clonedSheep));
    }
}
