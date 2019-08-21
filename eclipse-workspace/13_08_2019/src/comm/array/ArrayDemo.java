package comm.array;

public class ArrayDemo {
	
	private char[] arr;
	//private Integer a=new Integer(10);
	//private Integer a=10; // same as above known as autoboxing
	//int b=a.intValue();
	//int b=a; //same as above known as auto unboxing
	
	public ArrayDemo() {
		super();
	}
	
	public void createArray(int length)
	{
		arr=new char[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (char) ('A'+i);
		}
	}
		
		public char[] getArray()
		{
			return arr;
		}
	}
	

