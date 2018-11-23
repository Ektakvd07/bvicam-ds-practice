/*
 WAP to print k sum pairs

TIME COMPLEXITY
O(n/2)

SPACE COMPLEXITY
0(1)

TEST CASE
enter the size of array: 
6
enter the sorted elements
0 1 2 3 7 19
Enter the number: 
3
Pairs are: 
(0,3)
(1,2)
 */
package repo.bvicam_ds_practice.sumpair;
import sumpair3.*;
import java.util.Scanner;
public class Sumpair2 {
    
    public static void main(String args[])
    { Scanner obj=new Scanner(System.in);
        int arr[];
        int i,j,num,k,n;
        k=0;
        System.out.println("enter the size of array: ");
        n=obj.nextInt();//input array size
        arr = new int[n];
        System.out.println("enter the sorted elements");
        for(i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();//input array element
           
        }
        System.out.println("Enter the number: ");
        num=obj.nextInt();
                i=0;
         j=n-1;
         System.out.println("Pairs are: ");
        while(i<j)
        {
        if((arr[i]+arr[j])>num)
        {
            j--;
        }
        if((arr[i]+arr[j])==num)
        {  System.out.println("("+arr[i]+","+arr[j]+")");//print pair
            i++;
            j--;
        }
        
        }
    }
    
}
