/*
 WAP to sort array using Countingsort

TIME COMPLEXITY
O(n+m)

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
package countingsort;
import java.util.Scanner;
public class CountingSort {
    public static void main (String args[])
   {Scanner obj=new Scanner(System.in);
    int n,i;
    System.out.println("enter the size of array: ");
    n=obj.nextInt();//input array size
    int arr[]=new int[n];
    System.out.println("enter the elements: ");
    for(i=0;i<n;i++)
    {
        arr[i]=obj.nextInt();//input array element
        
    }
    for(i=0;i<n-1;i++)
    {int t;
        if(arr[i]>arr[i+1])
        {
            t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }  
        
    }
    
       sort(arr,n);
   }
    
   public static void sort(int arr[],int n)
   {int b[]=new int[arr[n-1]+1];
   int i;
    for(i=0;i<n;i++)
    {
        b[arr[i]]++;//assigning frequecy of element in array a[] to array b[]
    }
    
    int j;
    i=0;
    for(j=0;j<b.length;j++)//traversing array b[] and assigning index of array element to original array a[] on condition b[j]>0
    { 
     if(b[j]>0)
     {  
        int c=b[j];
        while(c>0)
        
        {
         if(i==(n))
          break;
         arr[i++]=j;
         --c;
         
        }
        if(i==(n))
             break;  
     }
     
    }
     System.out.println("sorted array is : ");
     for(i=0;i<n;i++)
     {System.out.println(arr[i]);//print sorted array element    
     } 
       
   }
   
}
