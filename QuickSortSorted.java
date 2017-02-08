/*
Program to implement QuickSort when taking the 1st element or leftmost element in the array as the pivot
Input: Unsorted Array to Sorted Array
Outpur: Sorted Array using QuickSort

*/
import java.io.*;
import java.util.*;
import java.math.*;

public class QuickSortSorted 
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
        int pivot=elements[left]; // pivot's value to be the leftmost in the array
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
            return (i-1); // return pivot index
    }
        
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
		Random randomNum = new Random();
        System.out.println("Enter the Number of Elements to be Sorted");
        int nElements = in.nextInt();
        int elements[] = new int[nElements];
		
        for(int i=0;i<nElements;i++)
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
			elements[i]=i;
        }
        int l=0;
        int r=elements.length-1;
        //System.out.println("\n"+l+" "+r);
		long startTime = System.nanoTime();
        quickSort(elements,l,r);
		long endTime = System.nanoTime();
		System.out.println("********Took:********** "+(endTime - startTime) + " ns"); 
        //Sorted Array
        /*for(int i=0;i<nElements;i++)
        {
            System.out.print(elements[i]+" ");
        }
        System.out.println(" "); */
    }
}