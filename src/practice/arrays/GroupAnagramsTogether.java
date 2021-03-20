package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagramsTogether {

	public static void main(String[] args) {
		String[] stringArr = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(stringArr);
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> anagramsList = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (String current : strs) {
			char ch[] = current.toCharArray();
			Arrays.sort(ch);
			String sorted = new String(ch);

			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}

			List<String> entryList = map.get(sorted);
			entryList.add(current);
			map.put(sorted, entryList);
		}

		anagramsList = map.values().stream().collect(Collectors.toList());
		return anagramsList;
	}
		
		
		

	
}
