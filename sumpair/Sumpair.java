/*
 WAP to print k sum pairs

TIME COMPLEXITY
O()

SPACE COMPLEXITY
0(1)

TEST CASE
enter the size: 
4
Enter the elements: 
1 3 2 0
Enter the number: 
3
Pairs are: 
(1,2)
(3,0)
 */
package repo.bvicam_ds_practice.sumpair;
import sumpair.*;
import java.util.Scanner;

public class Sumpair {
    
    public static void sumpair(int arr[],int n,int num)
    {int i,j;
    System.out.println("Pairs are: ");
     for(i=0;i<n;i++)
     {
        
         for(j=i+1;j<n;j++)
         {
            if((arr[i]+arr[j])==num)
            System.out.println("("+arr[i]+","+arr[j]+")");//print pair
         }
     }
     
      
    }
          
    public static void main(String args[])
    { Scanner obj= new Scanner(System.in);
      int n,i,num;
      System.out.println("enter the size: ");
      n=obj.nextInt();//input array size
      int arr[] = new int[n];
      System.out.println("Enter the elements: ");
      for(i=0;i<n;i++)
      {
          arr[i]=obj.nextInt();//input array element
      }
      System.out.println("Enter the number: ");
      num=obj.nextInt();//input pair sum
      sumpair(arr,n,num);
    }
    
    
}
