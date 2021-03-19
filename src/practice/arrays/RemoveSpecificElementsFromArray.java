package practice.arrays;

public class RemoveSpecificElementsFromArray {

	public static void main(String[] args) {
		int arr1[] = { 3, 2, 2, 3 };
		int arr2[] = { 1, 2, 2, 1, 2 };
		removeSpecificElementsFromArray(arr1, 3);
	}

	static int removeSpecificElementsFromArray(int arr1[], int ele) {
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != ele) {
				arr1[count] = arr1[i];
				count++;
			}
		}
		return count;
	}
	
}
