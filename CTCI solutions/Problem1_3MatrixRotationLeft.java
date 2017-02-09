/* Matrix Rotation 90 degrees */
import java.util.*;
class Problem1_3MatrixRotationLeft
{
	public static boolean rotation(int matrixArray[][])
	{
		System.out.println("Matrix Length:"+matrixArray.length);
		System.out.println("matrixArray[0].length"+matrixArray[0].length);
		if(matrixArray.length == 0 || matrixArray.length != matrixArray[0].length)
			return false; // no square matrix
		int n = matrixArray.length;
		for(int layers=0;layers<n/2;layers++)
		{
			int first = layers;
			int last = n-1-layers;
			
			for(int i=first;i<last;i++)
			{
				int offset = i - first;
				int top = matrixArray[first][i];
				matrixArray[first][i] = matrixArray[i][last];
				matrixArray[i][last] = matrixArray[last][last-offset];
				matrixArray[last][last-offset] = matrixArray[last-offset][first];
				matrixArray[last-offset][first] = top;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		boolean isStringUnique = rotation(matrix);
		if(isStringUnique)
		{
			System.out.println("The entered Strings are permutable of each other");
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
			System.out.println();
			}
		}
		else
		{
			System.out.println("The entered Strings are not permutable of each other");
		}
	
	}
}