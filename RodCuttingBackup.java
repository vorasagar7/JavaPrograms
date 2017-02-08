import java.io.*;
class RodCutting
{
	public static  void rodcutMethod(int arr[][], int length)
	{
		int bestSolution[] = new int[length+1];
		int cutArray[] = new int[length+1];
		bestSolution[0]=0;
		int noOfcuts=0;
		/*for(int q=0;q<noOfCuts.length;q++)
		{
			noOfCuts[q] = 1;
			
		}*/
		for(int i=0; i<length; i++)
		{
			int maxValue = -1;
			for(int j=0;j<=i;j++)
			{
				System.out.println("Inside J:::"+arr[1][j]);
				if(maxValue < arr[1][j] + bestSolution[i-j])
				{
					maxValue = arr[1][j]+ bestSolution[i-j];
					cutArray[i+1] = j+1;
					System.out.println("************************************Cut for length"+(i+1)+"::::::::"+(j+1));
				}
				System.out.println("maxvalue::::"+maxValue);	
				
				System.out.println("Bestsolution[j+1]:::"+bestSolution[i+1]);
			}
			bestSolution[i+1] = maxValue;
			System.out.println("ENd of inside for loop:::::::::::::::::::::");
		}
		System.out.println("Best Solution Array");
		for(int i=0;i<bestSolution.length;i++)
		{
			System.out.print(bestSolution[i]+" ");
		}
		System.out.println("Cutsssss:::::::::::::::::::::");
		for(int q=0;q<cutArray.length;q++)
		{
			System.out.print(cutArray[q]+" ");
		}
		while(length>0)
		{
			System.out.println("The lengths are:"+cutArray[length]);
			length = length - cutArray[length];
		}
	}
	public static void main (String args[])
	{
		//int rodcutArray[][] = {{1,2,3,4,5},{2,3,7,8,9}};
		int[][] rod_price = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {5, 5, 8, 9, 10, 17, 17, 20, 24, 30}};
		//int[][] rod_price = {{1, 2, 3, 4, 5, 6, 7, 8}, {5, 5, 8, 9, 10, 17, 17, 20}};
		int n = rod_price[0].length; 
		int y=Math.max(3,4);
		System.out.println("YYYYYYYYYY"+y+"nnn"+n);
		rodcutMethod(rod_price,8);
		//System.out.println(n);
	}
}