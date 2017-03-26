
public class Subtraction implements INumber{
private INumber next_;
	
	public void next(INumber next){
		next_=next;
	}
	public void cal(Number num){
		
		if(num.getvalue().equals("Sub")){
			
			System.out.println(num.getnum1()-num.getnum2());
		}
		else
		{
			next_.next(next_);
		}		
	}
}
