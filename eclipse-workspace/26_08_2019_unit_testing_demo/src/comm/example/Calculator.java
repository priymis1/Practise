package comm.example;

public class Calculator {
	
	private int x;
	private int y;
	private int result;
	public Calculator() {
		super();
	}
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int addMethod(/*int x, int y*/)
	{
		/*this.x=x;
		this.y=y;*/
		result = x+y;
		return result;
	}
	
	public int subMethod(/*int x, int y*/)
	{
		/*this.x=x;
		this.y=y;*/
		result = x-y;
		return result;
	}
	
	public int firstGreaterThanSecond()
	{
		if(x>y)
			return 1;
		else 
			return -1; 
	}
	

}
