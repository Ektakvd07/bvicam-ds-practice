/*
 WAP to sort array using Insertionsort

TIME COMPLEXITY
O(n*2)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of array: 
6
enter the elemesnts of array: 
77 9 0 33 4 5
Sorted array is: 
0
4
5
9
33
77

 */
package insertionsort;
import java.util.Scanner;
public class InsertionSort {
    static Scanner obj=new Scanner(System.in);
    
    public static void insertionsort(int arr[],int n)
    {int i,j,element;
    for(i=1;i<n;i++)
    {   element=arr[i];//assigning traversed element
        for(j=i-1;j>=0;j--)//loop on arr[0] to traversed element
        {   
            if(arr[j]>=element)
            {
                arr[j+1]=arr[j];//copy array element to next position
                if(j==0)
                {
                   arr[j]=element; 
                }
            }
            else//if arr[j]<element
            {
                arr[j+1]=element;
                break;//exit from the second for loop
            }
        }
    }
    System.out.println("Sorted array is: ");
    for(i=0;i<n;i++)
    {
       System.out.println(arr[i]);//print sorted array element
    }
        
    }
    public static void main(String args[])
    { int n,i;
     System.out.println("enter the size of array: ");
     n=obj.nextInt();//input array size
     int arr[]=new int[n];
     System.out.println("enter the elements of array: ");
     for(i=0;i<n;i++)
     {
         arr[i]=obj.nextInt();//input array element
     }
     insertionsort(arr,n);
    }
    
}
