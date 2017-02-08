/*
Program to implement QuickSort when taking the 1st element or leftmost element in the array as the pivot
Input: Unsorted Array to Sorted Array
Outpur: Sorted Array using QuickSort

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RandomisedQuicksort 
{
    public static void quickSort(int elements[], int left, int right) // Quicksort method which accepts the array , left index of the array and right index of the array
    {
        if(left < right) // if left is less than right than only do the partitioning because if there is one element then left=right, so no need to sort
        {
            int p = partition(elements, left, right); // This method returns the pivot index 
            quickSort(elements,left,p-1); // call quicksort to partition from left to pivot - 1
            quickSort(elements,p+1,right); // call quicksort to partition from pivot+1 to right
        }
    }
    public static int partition(int elements[], int left, int right)
    {
        Random randomNum = new Random();
        int num = randomNum.nextInt(right-left+1)+left; // logic to get the random number between left & right 
		System.out.println("left****************************:"+left);
		System.out.println("Radom Number****************************:"+num);
		System.out.println("right****************************:"+right);
		int temporary = elements[num];
		elements[num] = elements[left];
		elements[left]=temporary;
		int pivot=elements[left];
        int i=left+1; // ith pointer points to the right of the pivot position
        for(int j=left+1;j<=right;j++) // J loops runs from one position right of pivot i.e i or (left+1) to last
        {
            if(elements[j] <= pivot) // if element at j is less than pivot means there is one element which is smaller to pivot n is on the right hand side, so need to swap with the ith place which keeps a border between less than pivot n greater than pivot
            {
                // Swap a[j] & a[i]
                int temp = elements[j];
                elements[j] = elements[i];
                elements[i]=temp;
                i++;
            }
        }
            // Swap a[i-1] & a[left] (pivot) // why i-1 because i stores the 1st element greater than pivot, so i-1 has all elements smaller than pivot, so i-1
            int temp1 = elements[i-1];
            elements[i-1]=elements[left];
            elements[left]=temp1;
			System.out.print("After Partition::::::::::::");
			for(int m=0;m<elements.length;m++)
			{
				System.out.print(elements[m]+" ");
			}
            return (i-1); // return pivot index
    }
        
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of Elements to be Sorted");
        int nElements = in.nextInt();
        int elements[] = new int[nElements];
        for(int i=0;i<nElements;i++)
        {
            //System.out.println("Enter the "+i+"th Element");
            // elements[i] = in.nextInt();
			 Random randomNum = new Random();
			 int num = randomNum.nextInt(nElements);
			 elements[i] = num;
        }
        
        // Input Array
        for(int i=0;i<nElements;i++)
        {
            System.out.print(elements[i]+" ");
        }
        int l=0;
        int r=elements.length-1;
        System.out.println("\n"+l+" "+r);
		long startTime = System.nanoTime();
        quickSort(elements,l,r);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
        //Sorted Array
		System.out.println("Sorted Array:");
        for(int i=0;i<nElements;i++)
        {
            System.out.print(elements[i]+" ");
        }
        System.out.println(" ");
    }
}

/*
For input N: 12 23 23 34 45 54 56 N=7 - took 2.217629
Took 34. 440692 ms for N=70
Sorted Array: -6 -5 -3 -2 3 4 4 6 7 8 21 33 34 42 42 45 45 45 56 56 56 56 56 56 64 65 65 65 66 67 67 67 67 67 67 76 78 78 78 78 98 234 423 423 423 432 534 546 554 566 645 654 678 767 2312 2334 2423 3213 3756 4234 4234 4564 4645 6456 6456 6464 7567 42342 42423 34
122312 

For 2000 N random numbers:
8780.934067 ms

for 2000 sorted input
3.480512 ms

for 1000 sorted input
3.911335

for 500 sorted input
1.851889
*/
