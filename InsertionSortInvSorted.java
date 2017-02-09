/*
Program to implement Insertion Sort
Input: Unsorted Array of elements
Outpur: Sorted Array using Insertion Sort

*/
import java.io.*;
import java.util.*;
import java.math.*;

public class InsertionSortInvSorted
{
    /*
	start - insertionSort()
	The method takes the input array and 
	Argumments - elements[] - elements which are to be partitioned
				 left - left most index in the array
				 right - right most index in the array
	returns - void 
	*/
	public static void insertionSort(int elements[]) // Insertion method which accepts the array
    {
        for(int j=1;j<elements.length;j++)
			{
			
				int k=j-1;
				int q=j;
				while(k>=0 && elements[q] <= elements[k])
				{
					int temp =  elements[k];  // 
					elements[k] = elements[q]; // 
					elements[q] = temp; // 
					k=k-1;
					q=q-1;
				}
			}
    }   
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
		Random randomNum = new Random();
        System.out.println("Enter the Number of Elements you want to be Sorted (N):");
        int nElements = in.nextInt();
        int elements[] = new int[nElements];
        int f=0;
        for(int i=nElements-1;i>=0;i--)
        {
            /*int num = randomNum.nextInt(1000);
			if(i%2==0)
			{
				elements[i] = num;
			}
			else
			{
				num=num*-1;
				elements[i] = num;
			}
			*/
			elements[i]=f;
			f++;
        }
         //Sorted Array
		/*for(int i=0;i<nElements;i++)
        {
            System.out.print(elements[i]+" ");
        }*/
		//System.out.println();
		//System.out.println("Sorted List::::::");
        long startTime = System.nanoTime();
        insertionSort(elements);
		long endTime = System.nanoTime();
		 
        //Sorted Array
        /*for(int i=0;i<nElements;i++)
        {
            System.out.print(elements[i]+" ");
        }
        System.out.println(" ");
		*/
		System.out.println("*******Took*********: "+(endTime - startTime) + " ns");
		
    }
}

/*
For Sorted Input of 2000: it took 13 ms
for sorted inout of 1000: it took 5.644174 ms
for sorted input of 500:it took 3.693474 ms

*/