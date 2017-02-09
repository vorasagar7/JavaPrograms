import java.util.*;
class ZigZagPatternLeetCode
{
	public static String convert(String s, int numRows) 
	{
        StringBuilder sb[] = new StringBuilder[numRows];
		if(s == null)
		{
			return null;
		}
		for(int i=0;i<numRows; i++)
		{
			sb[i] = new StringBuilder();
		}
		int len = 0;
		while(len < s.length())
		{
			for(int i=0;i<numRows && len < s.length();i++)
			{
				sb[i] = sb[i].append(s.charAt(len));
				len++;
			}
			for(int j=numRows-2;j>=1 && len < s.length();j--)
			{
				sb[j] = sb[j].append(s.charAt(len));
				len++;
			}
		}
		for(int i=1;i<numRows; i++)
		{
			sb[0] = sb[0].append(sb[i]);
			
		}
		return sb[0].toString();
		
    }
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		String convertedPattern = convert(str,3);
		if(convertedPattern == null)
		{
			System.out.println("String is Null");
		}
		else
		{
			System.out.println(convertedPattern);
		}
	}


}