package practice.arrays;

/**
 *  MID WILL TAKE CARE OF MOVEMENT.
 *  
 *  https://www.youtube.com/watch?v=sEQk8xgjx64&ab_channel=takeUforward
 *
 */
public class DutchFlagProblem
{
	
	public static void main(String[] args) {
		
		int arr [] = {0,1,2,0,1,2};
		 dutchFlagProblem(arr);
		System.out.println(arr);
		
	}
	
	public static void dutchFlagProblem(int arr[])
	{
		 
		int low =0;
		int mid=0;
		int high =arr.length-1;
		
		while(mid<=high)
		{
			int temp=0;
			if(arr[mid]==0)
			{
				temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				mid++;
				low++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else if(arr[mid]==2)
			{
				temp =arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
		}
		
	}
	
	
	
}