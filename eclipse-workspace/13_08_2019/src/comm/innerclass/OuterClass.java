package comm.innerclass;

public class OuterClass {
	
	private int x;
	private int y;
	
	public OuterClass() {
		super();
	}
	
	public OuterClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void outerMethod()
	{
		//innerMethod();  cant call method of inner class in the outer class 
	}
	
	public Innerclass{
		public void innerMethod() {
			x=10;
			y=20;
			outerMethod();//inner class can call method of outer classs
		}
	}

}
