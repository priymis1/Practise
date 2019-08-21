package comm.example.client;

public class Employee {
	
	private int eId;
	private String fName, lName, department ;

	public Employee() {
		super();
	}

	public Employee(int eId, String fName, String lName, String department) {
		super();
		this.eId = eId;
		this.fName = fName;
		this.lName = lName;
		this.department = department;
	}
	
	protected String getDetails() {
		return "eId:"+eId+"First name:"+fName+"Last name:"+lName+"Department:"+department;
	}
	
}

