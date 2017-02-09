	import java.util.*;
	import java.util.Stack;
	class FindMatchingPair
	{
		static int findMatchingPairMethod(String input) 
		{
			int res = -1;
			Stack s = new Stack();
			for (int i = 0; i <input.length(); i++) 
			{
				char ch = input.charAt(i);
				
				if(!(Character.isLetter(ch)))
				{
					break;
				}
				if(Character.isUpperCase(ch))
				{
					s.push(ch);
				}
				else
				{
					if(s.empty())
					{
						break;
					}
					else
					{
						if((char)s.peek() == Character.toUpperCase(ch))
						{
							res = i;
							s.pop();
						}
						else
						{
							break;
						}
					}
				}
			}
			return res;
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner (System.in);
			String inp = sc.next();
			int pos = findMatchingPairMethod(inp);
			System.out.println(pos);
		}
	}

