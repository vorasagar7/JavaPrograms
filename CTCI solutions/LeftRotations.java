import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotations {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner (System.in);
		int numberOfelements = sc.nextInt();
		int inputArray[] = new int[numberOfelements];
		int destArray[] = new int[numberOfelements];
		int numberOfLeftShifts = sc.nextInt();
		for(int i=0; i<numberOfelements;i++)
		{
			inputArray[i] = sc.nextInt();
		}
		for(int i=0; i<numberOfelements;i++)
		{
			System.out.print(inputArray[i]+" ");
		}
		for(int i=0; i<numberOfelements;i++)
		{
			destArray[(i+numberOfelements-numberOfLeftShifts)%numberOfelements] = inputArray[i];
		}
		for(int i=0; i<numberOfelements;i++)
		{
			System.out.print(destArray[i]+" ");
		}
	}
}