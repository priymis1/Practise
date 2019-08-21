package comm.example.client;

public class Contractual_Employee extends Employee{
	private int rate_per_hour;

	public Contractual_Employee() {
		super();
	}

	public Contractual_Employee(int rate_per_hour) {
		super();
		this.rate_per_hour = rate_per_hour;
	}
	
	protected String getDetails()
	{
		return getDetails()+"Rate per Hour:"+rate_per_hour;
	}
	

}
