package comm.example.client;

public class Electronics extends Product {
	
	private int manufacturing_year;

	public Electronics() {
		super();
	}

	public Electronics(int manufacturing_year) {
		super();
		this.manufacturing_year = manufacturing_year;
	}
	
	public String getDetails()
	{
		return "manufacturing_year:"+manufacturing_year;
	}

}
