/*
  WAP to implement water tank problem

TIME COMPLEXITY
O(n)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of array:
7
enter the elements of array:
5 6 2 1 4 9 3
array is: 
0
0
4
5
2
0
0
total water need: 11

enter the size of array:
5
enter the elements of array:
9 3 5 1 0
array is: 
0
2
0
0
0
total water need: 2

 */
package Watertank;
import java.util.Scanner;
public class Watertank2 {
    static Scanner obj = new Scanner(System.in);
    public static void main(String args[])
    {
        int n;
        System.out.println("enter the size of array:");
        n=obj.nextInt();//input total partiotion
        int arr[] = new int[n]; 
        System.out.println("enter the elements of array:");//element signifies partition height within the tank
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();//input partition height
        }
        watercontain(arr,n);
    }
    static void watercontain(int arr[],int n)
    {
        int larr[] = new int[n];
        int rarr[] = new int[n];
        int i,j,lmax,rmax;
        
        for(i=0;i<n;i++)//iterate from i=0 to n-1 for assigning element to larr[]
        {lmax=arr[0];
            for(j=0;j<=i;j++)
            
         {if(arr[j]>lmax)
            lmax=arr[j];
            
         }larr[i]=lmax;//assign lmax to larr[i]
         
            
        }
        for(i=0;i<n;i++)//iterate from i=0 to n-1 for assigning element to rarr[]
        {rmax=arr[n-1];
            for(j=i;j<n;j++)
            {
                if(arr[j]>rmax)
                {rmax=arr[j];
                    
                }
                
            }rarr[i]=rmax;//assign rmax to rarr[i]
           
        }
        System.out.println("array is: ");
        int sum=0;
        for(i=0;i<n;i++)
        {if(larr[i]<rarr[i])
            arr[i]=larr[i]-arr[i];//assign difference of lmax[i] and arr[i] to arr[i]
         else
            arr[i]=rarr[i]-arr[i];//assign difference of rmax[i] and arr[i] to arr[i]
        sum+=arr[i];//for calculating total water need
        System.out.println(arr[i]);//print water need for each partition
        }
        System.out.println("total water need: "+sum);//print total water need
        
    }
}
