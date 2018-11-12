/*
 WAP to implement water tank problem

TIME COMPLEXITY
O(n*n)

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
package pattern.Watertank;
import java.util.Scanner;
public class Watertank1 {
    static Scanner obj=new Scanner(System.in);
    public static void main(String args[])
    {   int n;
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
        int arr2[],lmax,rmax,i,j;
        arr2 = new int[n];
        
        for(i=0;i<n;i++)//iterate from i=0 to n-1
        {lmax=arr[0];
         rmax=arr[n-1];
            for(j=i;j<n;j++)//loop for calculating rmax
            {
                if(arr[j]>rmax)
                {
                    rmax=arr[j];
                }
            }
            for(j=0;j<=i;j++)//loop for calculating lmax
            {
                if(arr[j]>lmax)
                {
                    lmax=arr[j];
                }
            }
            if(lmax<rmax)
            {arr2[i]=lmax-arr[i];//assign arr2[i] on condition lmax<rmax
                
            }
            else if(rmax<=lmax)
                arr2[i]=rmax-arr[i];//assign arr2[i] on condition lmax>=rmax
            
            
        }int sum=0;
        System.out.println("array is: ");
        for(i=0;i<n;i++)
        {   sum+=arr2[i];//calculating total water need
            System.out.println(arr2[i]);//print water need for each partition
        }
        System.out.println("total water need: "+sum);//print total water need
    }
}
