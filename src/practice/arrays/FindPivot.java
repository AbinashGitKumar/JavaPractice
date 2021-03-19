package practice.arrays;

public class FindPivot {

	public static void main (String args[])
	{
		int arr[] = {4,5,6,7,1,2,3};
		System.out.println(findPivot(arr, 0, arr.length-1));
	}
	
	
	public static int findPivot(int arr[] , int start , int end )
	{
		while(start <=end)
		{
			int mid = (start+end)/2;
			
			int size= arr.length;
			int next = (mid+1)%size;
			int prev = (mid+size-1)% size;
			
			if(arr[mid] < arr[next] && arr[mid] < arr[prev])
			{
				return arr[mid];
			}
			
			
			if(arr[start] < arr[mid])
			{
				start = mid+1;
			}
			
			else {
				end=mid-1;
			}
			
		}
		return -1;
	}
	
}
