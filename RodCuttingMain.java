import java.io.*;
import java.util.*;
class RodCutting
{
	public static  void rodcutMethod(double arr[][], int length, double costOfCut)
	{
		int bestSolution[] = new int[length+1];
		int cutArray[] = new int[length+1];
		bestSolution[0]=0;;
		for(int i=0; i<length; i++)
		{
			double maxValue = Integer.MIN_VALUE;
			for(int j=0;j<=i;j++)
			{
				System.out.println("Inside J:::"+arr[1][j]);
				if(i==j) 
				{
						if(maxValue < arr[1][j] + bestSolution[i-j])
						{
							maxValue = arr[1][j];
							cutArray[i+1] = j+1;
							System.out.println("************************************Cut for length"+(i+1)+"::::::::"+(j+1));
						}
				}
				else
				{
					if(maxValue < arr[1][j] + bestSolution[i-j] - costOfCut)
					{
						maxValue = arr[1][j]+ bestSolution[i-j] - costOfCut;
						cutArray[i+1] = j+1;
						System.out.println("************************************Cut for length"+(i+1)+"::::::::"+(j+1));
					}
				}
				System.out.println("maxvalue::::"+maxValue);	
				
				System.out.println("Bestsolution[j+1]:::"+bestSolution[i+1]);
			}
			bestSolution[i+1] = (int)maxValue;
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
		System.out.println("The maximum Revenue generated is:"+bestSolution[bestSolution.length-1]);
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		//int rodcutArray[][] = {{1,2,3,4,5},{2,3,7,8,9}};
		double[][] rod_price = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 5, 8, 9, 10, 17, 17, 20, 24, 30}};
		//int[][] rod_price = {{1, 2, 3, 4, 5, 6, 7, 8}, {5, 5, 8, 9, 10, 17, 17, 20}};
		System.out.println("Enter the length of the Rod");
		
		int n =  sc.nextInt();
		double cutCost = 0;
		int y=Math.max(3,4);
		System.out.println("YYYYYYYYYY"+y+"nnn"+n);
		rodcutMethod(rod_price,n,cutCost);
		//System.out.println(n);
	}
}