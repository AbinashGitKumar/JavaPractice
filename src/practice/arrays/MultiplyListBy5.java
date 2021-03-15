package practice.arrays;

import java.util.List;
import java.util.stream.Collectors;

public class MultiplyListBy5 {

	public static void main(String[] args) {
		multiplyBy5();
	}

	public static void multiplyBy5() {
		List<Integer> list = List.of(1, 2, 3, 4, 5);

		List<Integer> mulList = list.stream().map(num -> num * 5).collect(Collectors.toList());
		System.out.println(mulList);
	}

}
