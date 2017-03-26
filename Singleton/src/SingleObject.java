public class SingleObject {
    private  static SingleObject instance;
    private SingleObject(){}
    public static  SingleObject getInstance(){
    	if(instance==null)
    	{
    		return instance = new SingleObject();
    	}
    	
        return null;
    }
    public void showMessage(){
        System.out.println("Singleton");
    }
}
