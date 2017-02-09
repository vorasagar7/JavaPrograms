/*
given a rectangular field or a square field, find out how it will be covered with sqaure tiles assuming that you can only use a square tile exactly once.

For eg: if area is 100 sq mt, a 10 mt square tile might fill it completely as 10 x 10 = 100, so display 100 as output.
If 50 , then one 7 sqaure tile and one 1 sqaure tile . 7X7 + 1x1 = 49+1 = 50. Output 49 , 1.

*/
import java.io.*;
import java.util.*;
class Foo_Bar_Question1
{
	public static int[] answer(int area)
	{
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		while(area>0)
		{
			double sqrt = Math.sqrt(area);
			int x = (int) sqrt;
			int sqaure_Of_X = (int)Math.pow(x,2);
			answerList.add(sqaure_Of_X);
			area = area - sqaure_Of_X;
		
		}
		int array[] = new int[answerList.size()];              
		for(int j =0;j<answerList.size();j++){
		  array[j] = (int)answerList.get(j);
		}
		return array;
	}
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the area length between 1 - 1000000");
		int area = Integer.parseInt(in.nextLine());
		int solution [] = answer(area);
		for(int i=0;i<solution.length;i++)
		{
			System.out.print(solution[i]+" ");
		}  
		  
	}
}
