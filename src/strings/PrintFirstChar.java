package strings;

public class PrintFirstChar {

	public static void main(String[] args) {
		String str = "Abinash Kumar Singh";
		printFirstChar(str);
	}
	
	public static void printFirstChar(String str)
	{
		String [] strArray = str.split(" ");
		
		for(String ele : strArray)
		{
			System.out.println(ele.charAt(0));
		}
	}
}
