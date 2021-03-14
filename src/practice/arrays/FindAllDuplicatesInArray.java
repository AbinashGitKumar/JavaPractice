package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInArray {

	public static void main(String[] args) {
		int arr[] = {4,3,2,7,8,2,3,1};
		findDuplicatesInArray(arr);
	}
	
	
	
	public static List<Integer> findDuplicatesInArray(int arr[]) {
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i] == arr[i + 1]) {
				list.add(arr[i]);
			}
		}
		return list;
	}
}
