package practice.arrays;


/**
 * KADANE ALGO:
 * 
 * Let’s look at the algorithm :
 * 
 * Initialize max_so_far = 0 
 * Initialize max_ending_here = 0 
 * Repeat steps 4 to 6
 * for each element of the array set max_ending_here = max_ending_here + a[i]
 * if(max_ending_here < 0) then set max_ending_here = 0 
 * if(max_so_far < max_ending_here) 
 * then set max_so_far = max_ending_here return max_so_far
 *
 */
public class LargestSubArraySum {

	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5};
		System.out.println("Largest sub array sum : "+getLargestSubArraySum(arr));
	}
	
	static int getLargestSubArraySum(int[] arr) {
		int max_sofar = 0;
		int max_ending_here = 0;
		for (int i = 0; i < arr.length; i++) {
			max_ending_here = max_ending_here + arr[i];
			if (max_sofar < max_ending_here) {
				max_sofar = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		return max_sofar;
	}
}
