/* Matrix Rotation 90 degrees */
import java.util.*;
class Problem1_4_ZeroMatrix
{
	
	public static void zeroMatrix(int matrixArray[][], int m, int n)
	{
		try
		{
			
			System.out.println("Matrix Length:"+matrixArray.length);
			System.out.println("matrixArray[0].length"+matrixArray[0].length);
			boolean rows[] = new boolean[m];
			boolean cols[] = new boolean[n];
			//int copyArray[][] = matrixArray;
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(matrixArray[i][j] == 0)
					{
						rows[i]=true;
						cols[j]=true;
						System.out.println("Before return");
						return;
						
					}
				}
			}
			for(int i=0;i<m;i++)
			{
				if(rows[i])
				setRowsToZero(matrixArray,i,n);
			}
			for(int i=0;i<n;i++)
			{
				if(cols[i])
				setColumnsToZero(matrixArray,i,m);
			}
		System.out.println("Before try ends");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch");
		}
		finally
		{
			System.out.println("Inside Finally");
		}
		System.out.println("Before method ends");
	}
	public static void setRowsToZero(int matrix[][], int rowNumber, int cols)
	{
		for(int a=0;a<cols;a++)
		{
			matrix[rowNumber][a] = 0;
		}
	}
	public static void setColumnsToZero(int matrix[][], int colNumber, int rows)
	{
		for(int a=0;a<rows;a++)
		{
			matrix[a][colNumber] = 0;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int rows = 3;
		int columns = 3;
		int matrix[][] = new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		zeroMatrix(matrix,rows,columns);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println();
		}
	}
}