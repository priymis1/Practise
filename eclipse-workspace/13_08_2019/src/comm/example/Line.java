package comm.example;

public class Line extends Model {
	private int startPoint;
	private int endPoint;
	
	

	public Line() {
		super();
	}
   
	
	public Line(int startPoint, int endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	

	public int getStartPoint() {
		return startPoint;
	}


	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}


	public int getEndPoint() {
		return endPoint;
	}


	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}


	public int calculatelength()
	{
		return getEndPoint() - getStartPoint();
	}
	@Override
	public boolean isGreater(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		
		Line l1=(Line)obj1;
		Line l2=(Line)obj2;
		
		return l1.calculatelength()>l2.calculatelength();
	}
//implementing same using a single object
	@Override
	public boolean isLess(Object obj) {
		// TODO Auto-generated method stub
		Line l1=(Line)obj;
		return l1.calculatelength()<this.calculatelength();
	}

	@Override
	public boolean isEqual(Object obj) {
		// TODO Auto-generated method stub
		Line l1=(Line)obj;
		return l1.calculatelength()==this.calculatelength();
	}

}
