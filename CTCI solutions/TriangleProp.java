import java.util.*;
class TriangleProp
{
	public static void typeOfTriangle(int side1, int side2, int side3)
	{
		if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2) && (side1 > 0) && (side2 > 0) && (side3> 0))
		{
			if(side1 == side2 && side2 == side3)
			{
				System.out.println("Equilateral Triangle");
				
			}
			else if(side1 == side2 || side2 == side3 || side3 == side1)
			{
				System.out.println("Isosceles Triangle");
			}
			else
			{
				System.out.println("Scalene Triangle");
			}
		
		}
		else
		{
			System.out.println("Not a valid triangle");
		}
		
		
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Side");
		int triside1 = sc.nextInt();
		System.out.println("Enter 2nd Side");
		int triside2 = sc.nextInt();
		System.out.println("Enter 3rd Side");
		int triside3 = sc.nextInt();
		typeOfTriangle(triside1,triside2,triside3);
	}


}