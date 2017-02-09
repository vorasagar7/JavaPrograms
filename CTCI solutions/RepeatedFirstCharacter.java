import java.util.*;
class RepeatedFirstCharacter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		
		int n = inputString.length();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<n;i++)
		{
			int count = 1;
			char ch = inputString.charAt(i);
			if(map.get(ch) != null)
			{
				map.put(ch,(map.get(ch) + 1));
			}
			else
			{
				map.put(ch,count);
			}
		}
		for(int i=0;i<n;i++)
		{
			char ch = inputString.charAt(i);
			if(map.get(ch) > 1)
			{
				System.out.println(ch);
				break;
			}
		}
	
	}


}