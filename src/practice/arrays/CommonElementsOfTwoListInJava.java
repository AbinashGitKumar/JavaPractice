package practice.arrays;

import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsOfTwoListInJava {

	public static void main(String[] args) {
		getCommonElementsInJava();
	}

	public static void getCommonElementsInJava() {
		List<String> list1 = List.of("Abinash", "Divya", "Abhishek", "Bijay", "Renu", "Devilliers");
		List<String> list2 = List.of("Abinash", "Divya", "Abhishek", "Bijay", "Renu", "Sunil", "Sweety", "Shreya");
		List<String> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(list3);
	}
}
