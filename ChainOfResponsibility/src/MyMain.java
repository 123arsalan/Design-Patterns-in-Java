
public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INumber obj=new Addition();
		INumber obj1=new Subtraction();
		Number num=new Number(7,3,"Add");
		obj.next(obj1);
		obj.cal(num);
		
	}

}
