package comm.array;
import java.util.Arrays;

public class MyArray {
	private int arr[];
	
	public boolean sortArray(int arr[])
	{
		this.arr=arr;
		System.out.println("Before sorting");
		for(int i: this.arr)
		{
			System.out.println(arr[i]);
		}
		
		Arrays.sort(arr);
		System.out.println("After sorting");
		for(int i: this.arr)
		{
			System.out.println(arr[i]);
		}
		
		public boolean findElement(int item)
		{
			int i=Arrays.binarySearch(arr, item);
			if(i>=0)
			{
				return true; 
			}
			else 
				return false;
		}
			
	}

}
