import java.util.*;
class IslandAndWater
{
	public static int perimeterOfIsland(int [][]matrix)
	{
		int island = 0;
        int neighbourIsland = 0;
		int perimter = 0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j] == 1)
				{
					island+=1;
					if(j<matrix[0].length - 1 && matrix[i][j+1] == 1)
					{
						neighbourIsland+=1;
					}
					if(i<matrix.length - 1 && matrix[i+1][j] == 1)
					{
						neighbourIsland+=1;
					}
				}
				
			}
		}
		perimter = island*4 - neighbourIsland*2;
		return perimter;
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Inmatrix[][] = new int[4][4]; 
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				inmatrix[i][j] = sc.nextInt;
			}
		}
		int perimterval = perimeterOfIsland(inmatrix); 
		System.out.println("Perimter is:"+perimterval);
	}



}