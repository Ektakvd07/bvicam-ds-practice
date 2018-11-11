/*
 WAP to sort array using Quicksort

TIME COMPLEXITY
O(n*n)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of array: 
5
Enter the array elements: 
3 7 11 4 0
Sorted array is: 
0
3
4
7
11

 */
package quicksort;

import java.util.Scanner;

public class PivotMid {
     public static void main(String args[])
    {  Scanner obj=new Scanner(System.in);
       int n,i;
       
       System.out.println("enter the size of array: ");
       n=obj.nextInt();//input array size
       int arr[]=new int[n];
       System.out.println("Enter the array elements: ");
       for(i=0;i<n;i++)
       {
           arr[i]=obj.nextInt();//input array element
       }i=0;
       quicksort(arr,i,n-1);
       System.out.println("Sorted array is: ");
       for(i=0;i<n;i++)
       {
           
           System.out.println(arr[i]);//print sorted array element
       }
               
    }
    public static int partition(int arr[],int i,int j)
    {
        int pivot=(i+j)/2;//pivot index
        while(arr[i]<arr[pivot])//comparing with pivot value
        {
            i++;//increment i if condition is true
        }
        while(arr[j]>arr[pivot])//comparing with pivot value
        {
            j--;//decrement j if condition is true
        }
        if(i<j)//swaping of arr]i] and arr[j]
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return j;//returning partion index to pi
    }
     public static void quicksort(int arr[],int i,int j)
        {
           if(i<j)
           {
               int pi=partition(arr,i,j);//partion index from partition(int arr[],int i,int j)
               quicksort(arr,i,pi-1);//quicksort on first sub array
               quicksort(arr,pi+1,j);//quicksort on second sub array
           }
        }
    
}
