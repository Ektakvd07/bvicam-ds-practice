/*
WAP to sort array using Selectionsort

TIME COMPLEXITY
O(n*n)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of array: 
5
enter the elements of array: 
22 5 1 66 3
Sorted array is: 
1
3
5
22
66

 */
package selectionsort;
import java.util.Scanner;

public class SelectionSort 
{   static Scanner obj=new Scanner(System.in);
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
     selectionsort(arr,n);
    }
    public static void selectionsort(int arr[],int n)
    {int i,j,min,temp,min_index=0;
     i=0;
     j=0;
     
     for(i=0;i<n-1;i++)//loop on i=0 to n-2
     {min=arr[i];
         for(j=i;j<n;j++)
         {if(arr[j]<min)
         {min=arr[j];//assigning min
             min_index=j;//assigning min_index
         }
         }//swapping arr[i] with min
         temp=arr[i];
         arr[i]=min;
         arr[min_index]=temp;
     }
     System.out.println("Sorted array is: ");
     for(i=0;i<n;i++)
     {
       System.out.println(arr[i]);//print sorted array element
     }    
    }
     
}
