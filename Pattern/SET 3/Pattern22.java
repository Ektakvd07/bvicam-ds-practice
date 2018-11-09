/*
WAP to print pattern

TIME COMPLEXITY
O((n*2)-2)

SPACE COMPLEXITY
O(n*n)

TEST CASES:
enter the odd array size:
7
   1   
  2 2  
 3   3 
4     4
 3   3 
  2 2  
   1   


enter the odd array size:
13
      1      
     2 2     
    3   3    
   4     4   
  5       5  
 6         6 
7           7
 6         6 
  5       5  
   4     4   
    3   3    
     2 2     
      1     
 */
package pattern;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Pattern22 {
    public static void main(String args[])
    {   Scanner obj=new Scanner(System.in);
       
        int i,j,mid,val,val2,n;
        i=0;
        j=0; 
        val=0;
        val2=0;
        System.out.println("enter the odd array size:");
        n=obj.nextInt();//input array size
        int arr[][]=new int[n][n];
        mid=n/2;
        while(i<n)//iterate from i=0 to n-1
        {++val; 
         
         if(i<=mid)//for upper half triangle
        {
          arr[i][mid-i] =val;//assigning value to array
          arr[i][mid+i]=val;//assigning value to array
          j=i-1;
          val2=i;
        }
        else//for lower half triangle
        {arr[i][abs(mid-i)]=val2;//assigning value to array
          arr[i][mid+j]=val2;//assigning value to array
         --val2; 
         --j;
        }   
            ++i;//incrementing i for next iteration
            
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {   if(arr[i][j]==0)
                System.out.print(" ");//print nothing for element=0
                else
                System.out.print(arr[i][j]);//print element other than 0
            }
            System.out.println();
        }
    }
    
}
