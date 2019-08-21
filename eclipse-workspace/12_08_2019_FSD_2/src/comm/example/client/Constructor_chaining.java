package comm.example.client;

public class Constructor_chaining {
	private int x;
	private int y;
	private int z;
	public Constructor_chaining() {
		this(10);
	}
	public Constructor_chaining(int x) {
		this(x,20);
	}
	public Constructor_chaining(int x, int y) {
		this(x,y,30);
	}
	public Constructor_chaining(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void getDetails()
	{
		System.out.println("X="+x+"Y="+y+"Z="+z);
		
	}
	
}
