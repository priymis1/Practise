package comm.messaging;

public class Search {
	
	public void search(int k1, int arr1[])
	{
		int arr[]=arr1;
		int j=arr.length;
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(k1==arr[i])
			{System.out.println("Element Found");
			break;
			}
			else
				continue;
		}
		if(j==i) 
		{
			System.out.println("Element does not exist");
		}
	}

}
