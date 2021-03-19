package practice.arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
	
		int a1[]= {1,12,15,26,38};
		int a2[]= {2,13,17,30,45};
		
		System.out.println(getMedianOfTwoSortedArrays(a1, a2));
		
	}
	
	static int getMedianOfTwoSortedArrays(int arr1[], int arr2[]) {
		int i = 0;
		int j = 0;
		int m1 = 0;
		int m2 = 0;

		int n = (arr1.length + arr2.length) / 2;

		for (int count = 0; count <= n; count++) {

			if (i == n) {
				m1 = m2;
				m2 = arr2[0];
				break;
			}

			else if (j == n) {
				m1 = m2;
				m2 = arr1[0];
				break;
			}

			if (arr1[i] <= arr2[j]) {
				m1 = m2;
				m2 = arr1[i];
				i++;
			}

			else {
				m1 = m2;
				m2 = arr2[j];
				j++;
			}

		}
		return (m1 + m2) / 2;
	}
	
	
}
