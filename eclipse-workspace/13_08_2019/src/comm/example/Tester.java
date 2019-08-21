package comm.example;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Flyer flyer = new Bird();
		flyer.takeoff();
		flyer=new SuperMan(); //Dynamic method dispatching
		flyer.takeoff();*/
		
		Model model=new Line(0,20);
		Model model1=new Line(0,10);
		model.isGreater(model, model1);
		model.isEqual(model1)

	}

}
