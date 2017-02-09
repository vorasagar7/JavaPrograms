import java.util.*;

/*aaaabbccdde
a4b2c2d2e1 */
class Problem1_6StringCompression
{
	public static void CompressedString (String inputStr)
	{
		if(inputStr == null)
		{
			System.out.println("Entered String is Null");
		
		}
		StringBuilder strBuild = new StringBuilder();
		int counter = 1;
		for(int i=0;i<inputStr.length()-1;i++)
		{
			if(inputStr.charAt(i) == inputStr.charAt(i+1))
			{
				counter++;
			}
			else
			{
				strBuild.append(inputStr.charAt(i));
				strBuild.append(counter);
				counter = 1;
			}
			if(i+1 == inputStr.length()-1)
			{
				strBuild.append(inputStr.charAt(i));
				strBuild.append(counter);
			}
		}
		System.out.println("The Original   String is:"+inputStr.toString());
		System.out.println("The Compressed String is:"+strBuild.toString());
		if(inputStr.length() >= strBuild.length())
		{
			System.out.println("The output String is:"+strBuild.toString());
		}
		else
		{
			System.out.println("The output String is:"+inputStr.toString());
		}
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String inputString1 = sc.next();
		CompressedString(inputString1);
	}
}