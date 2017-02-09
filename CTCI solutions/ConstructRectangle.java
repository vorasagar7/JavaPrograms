import java.util.*;
public class ConstructRectangle 
{
    public static int[] constructRectangle(int area) 
	{
			int w = (int)Math.sqrt(area);
			while (area%w!=0) w--;
			return new int[]{area/w, w};
    } 
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number tp find the factor for");
		int numFactor = sc.nextInt();
		int[] perimterval = constructRectangle(numFactor); 
		System.out.println(perimterval[0]+" "+perimterval[1]);
	}
}