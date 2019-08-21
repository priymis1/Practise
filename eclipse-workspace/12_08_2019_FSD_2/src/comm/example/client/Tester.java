package comm.example.client;
//import comm.example.MyDate;
import comm.example.client.Constructor_chaining;


public class Tester {

	public static void main(String[] args) {
		/*MyDate myDate = null;
		myDate = new MyDate();
		myDate.createDate(12, 10, 1997);
		System.out.println(myDate.getdetails());*/
		//new MyDate().createDate(8,10,1997); creates an orphan object
		Constructor_chaining myC = new Constructor_chaining();
		myC.getDetails();
		System.out.println();
	}

}
