package comm.example.client;

public class Permanent_Employee extends Employee{
	private int salary;

	public Permanent_Employee() {
		super();
	}

	public Permanent_Employee(int salary) {
		super();
		this.salary = salary;
	}
	
	protected String getDetails()
	{
	return getDetails()+"Salary:"+salary;

}
}
