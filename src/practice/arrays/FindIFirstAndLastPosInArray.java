package practice.arrays;

public class FindIFirstAndLastPosInArray {
	
	public static void main(String[] args) {
			
		/*int [] nums = {1,2,3,3,3,4,5};*/
		int [] nums = {1,2,2,2,2,2,2,2,3,3,3,4,5};
		
		System.out.println("First position : "+findFirstPosition(nums, 2));
		System.out.println("Last position : "+findLastPosition(nums, 2));
	}
	
	
	public static int findFirstPosition(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int result = -10;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				result = mid;
				end = mid - 1;
			}

			else if (target < nums[mid]) {
				end = mid - 1;
			}

			else if (target > nums[mid]) {
				start = mid + 1;
			}
		}
		return result;
	}
	
	public static int findLastPosition(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int result = -10;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				result = mid;
				start = mid + 1;
			}

			else if (target > nums[mid]) {
				start = mid + 1;
			}

			else if (target < nums[mid]) {
				end = mid - 1;
			}
		}
		return result;
	}
	
	
}

	