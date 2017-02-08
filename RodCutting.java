import java.io.*;
import java.util.*;
class RodCutting
{
	public static  void cut_rod(double rodCuttingArray[][], int lengthOfRod, double costOfCut)
	{
		if(lengthOfRod <= rodCuttingArray[0].length && lengthOfRod > 0)
		{
			int bestSolution[] = new int[lengthOfRod+1]; // declaring a new array for storing the maximum profit for each length of rod
			int cutArray[] = new int[lengthOfRod+1]; // delcaring a new array for storing the no of cuts yeilding the maximum profit
			bestSolution[0]=0; // initializing the 0th value for the best solution array as 0
			/* The outer for loop which keeps track of each rod length */
			for(int i=0; i<lengthOfRod; i++)
			{
				double maxValue = Integer.MIN_VALUE; // initializing the maxValue as the least integer number i.e -2147483648
				/* The inner loop checks for all the cuts till the length i */
				for(int j=0;j<=i;j++)
				{
					if(i==j) // There is no cut for the rod
					{
							if(maxValue < rodCuttingArray[1][j] + bestSolution[i-j]) // If the price of entire rod is more than the maxValue for that length, assign the same to max value
							{
								maxValue = rodCuttingArray[1][j];
								cutArray[i+1] = j+1;
							}
					}
					else // There is a cut for the rod
					{
						if(maxValue < rodCuttingArray[1][j] + bestSolution[i-j] - costOfCut) //If the price of the cut along with cost for cut is more than the maxValue for that length, assign the same to max value.
						{
							maxValue = rodCuttingArray[1][j]+ bestSolution[i-j] - costOfCut;
							cutArray[i+1] = j+1;
						}
					}
				} // End of inner for
				bestSolution[i+1] = (int)maxValue; // maximum profit for the length
			} // End of outer for
			
			System.out.println("The Following Rod lengths are used for maximum profit:");
			/* Logic to get the length of rod used for cutting */
			while(lengthOfRod>0)
			{
				System.out.println("Length:"+cutArray[lengthOfRod]);
				lengthOfRod = lengthOfRod - cutArray[lengthOfRod];
			}
			/* Logic ends */
			
			/* Displaying the maximum Profit */
			System.out.println("The maximum Profit is :"+bestSolution[bestSolution.length-1]);
		} 
		else
		{
			System.out.println("The value of length of rod entered is incorrect or input array is blank");
		}
	}
	// End of the cut_rod
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		double[][] rodcutArray = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 5, 8, 9, 10, 17, 17, 20, 24, 30}};
		System.out.println("Enter the length of the Rod");
		int n =  sc.nextInt();
		double cutCost = 4;
		cut_rod(rodcutArray,n,cutCost);
	}
}