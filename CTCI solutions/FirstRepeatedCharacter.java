import java.util.*;
class FirstRepeatedCharacter
{
	public static char firstRepeatedChar(String str)
	{
		if(str == null)
		{
			return '\0';
		}
		else
		{
			int charArray[] = new int[128];
			for(int i=0;i<str.length();i++)
			{
				int ch = str.charAt(i);
				charArray[ch]++;
			}
			for(int i=0;i<str.length();i++)
			{
				int ch = str.charAt(i);
				if(charArray[ch] >= 2)
				{
					return str.charAt(i);
				}
			}
		}
		return '\0';
		
		
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		char repeatedCharPos = firstRepeatedChar(str);
		if(repeatedCharPos == '\0')
		{
			System.out.println("Invalid String entered or String doesn't have repeated characters");
		}
		else
		{
			System.out.println("First repeated char is: "+repeatedCharPos);
		}
	}


}