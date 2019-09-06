package comm.example.spring.model;

public class HelloWorldModel {
	
	private String firstname;
	private String email;
	
	public HelloWorldModel() {
		super();
	}

	public HelloWorldModel(String firstname, String email) {
		super();
		this.firstname = firstname;
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "HelloWorldModel [firstname=" + firstname + ", email=" + email + "]";
	}
	
	
	
	

}
