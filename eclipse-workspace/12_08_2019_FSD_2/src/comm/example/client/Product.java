package comm.example.client;

public class Product {
	private int current_rate;
	private static int item;
	static {
		item = 0;
	}
	public Product() {
		item++;
	}
	public Product(int current_rate) {
		super();
		this.current_rate = current_rate;
	}
	

}
