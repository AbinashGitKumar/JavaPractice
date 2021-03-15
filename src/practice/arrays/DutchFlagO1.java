package practice.arrays;

public class DutchFlagO1 {

	public static void main(String[] args) {
		int arr[] = {1,0,1,0};
		dutchFlagWith01(arr);
		System.out.println(arr);
	}
	
	public static void dutchFlagWith01(int arr[])
	{
		int low = 0;
		int mid=0;
		int len=arr.length-1;
		
		while(mid<=len);
		{
			int temp =0;
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
			
		}
	}
}
