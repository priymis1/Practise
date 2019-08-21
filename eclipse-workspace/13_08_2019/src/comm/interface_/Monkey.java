package comm.interface_;

public class Monkey implements LivingThings {
	private String name;
	
	

	public Monkey() {
		super();
	}
	
	
	

	public Monkey(String name) {
		super();
		this.name = name;
	}







	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Monkey:"+getName()+"can also walk");

	}

}
