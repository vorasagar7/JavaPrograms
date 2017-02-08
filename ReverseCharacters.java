import java.util.*;
class ReverseCharacters
{
	public static StringBuilder reverseCharactersInString(String input)
	{
		String inputArray[] = input.split("\\ ");
		System.out.println(inputArray.length);
		StringBuilder outputString = new StringBuilder();
		for(String w : inputArray)
		{
			outputString.append( new StringBuilder(w).reverse());
			outputString.append(" ");
		}
		return outputString;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(reverseCharactersInString(s));
	}

}