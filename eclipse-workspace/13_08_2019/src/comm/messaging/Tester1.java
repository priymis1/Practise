package comm.messaging;
import java.util.Arrays;

public class Tester1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k;
		k=30;

		int arr[]=
			{
					100,1,-20,30,0
			};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				System.out.println("Element Found");
				break;
			}
			else
				continue;
		}
		int j=0;
		if(j==arr.length)
		{
			System.out.println("Element does not exist in the array ");
			
		}
		
	}

}
