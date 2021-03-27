package practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class SumAllDigits {

	public static void main(String[] args) {
		System.out.println(new SumAllDigits().sumAllDigits(785));
	}
	
	public int sumAllDigits(int num) {
		if (num == 0)
			return 0;

		List<Integer> digits = getDigits(num);

		int sum = digits.stream().mapToInt(Integer::intValue).sum();
		while (sum > 9) {
		sum =	sumAllDigits(sum);
		}
		return sum;
	}

	public List<Integer> getDigits(int num)
	{
		  List<Integer> list = new ArrayList<>();
		  int dig=0;
		  while(num>0)
		  {
		  dig = num%10;
		   num=num/10;
		   list.add(dig);
		  }
	return list;

	}
	
	
	
}
