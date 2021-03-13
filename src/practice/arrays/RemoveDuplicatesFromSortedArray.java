package practice.arrays;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each
 * element appears only once and returns the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 * 
 * 
 * LINK USED TO STUDY : https://www.youtube.com/watch?v=zIHe2V5Py3U&ab_channel=KevinNaughtonJr.
 * 
 * 
 */
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,1,2};
		arr =removeDuplicatesFromSortedArray(arr);
		System.out.println(arr);
	}

	/**
	 *  ARRAY WILL CONTAIN DUPLICATE ELEMENTS.
	 */
	public static int [] removeDuplicatesFromSortedArray(int arr[])
	{
		int index=1;
		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[index++] = arr[i+1];
			}
		}
		return arr;
	}
	
	
}
