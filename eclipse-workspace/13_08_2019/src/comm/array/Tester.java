package comm.array;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDemo arrayDemo=new ArrayDemo();
		arrayDemo.createArray(26);
		char[] arr=arrayDemo.getArray();
		
		for(char c:arr)
		{
			System.out.print(c+" ");
		}

	}

}
