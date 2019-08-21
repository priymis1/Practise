package comm.messaging;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messaging m=Messaging.createMessagingObject("Name");
		System.out.println(m);  //calls m.toString
		Messaging m1=Messaging.createMessagingObject();
		System.out.println(m==m1);
		
		//shows true because it is a single object and only the method is overloaded
		//single tone pattern - making constructor private
	}

}
