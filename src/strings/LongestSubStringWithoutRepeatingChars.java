package strings;

import java.util.LinkedHashMap;

public class LongestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		String longestSubString = findLongestSubString(str);
		System.out.println(longestSubString);
	}
	
	public static String findLongestSubString(String str) {
		char ch[] = str.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		String longestSubString = "";
		int longestStringSize = Integer.MIN_VALUE;

		for (int i = 0; i <= ch.length - 1; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], i);
			} else {
				i = map.get(ch[i]);
				map.clear();
			}
	
			
			if (map.size() > longestStringSize) {
				longestStringSize = map.size();
				longestSubString = map.keySet().toString();
            }
			
		}
		System.out.println("Input String : " + str);
        System.out.println("Longest Substring : " + longestSubString);
        System.out.println("Longest Substring Length : " + longestStringSize);
		return longestSubString;
	}
	
	
}
