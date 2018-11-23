/*
 WAP to merge sorted array

TIME COMPLEXITY
O(size)

SPACE COMPLEXITY
O(n2)

TEST CASE
enter the size of merge array: 
10
enter the size of the first array:
4
enter the sorted array elements: 
3 5 12 44
so, the size of the second array is 6
enter the sorted array elements: 
3 7 9 10 89 122
merge array is: 
3
3
5
7
9
10
12
44
89
122
 */
package repo.bvicam_ds_practice.mergesortedarray;
import java.util.Scanner;
public class Mergesortedarray {
    static Scanner obj= new Scanner(System.in);
    void merge(int size,int n1,int n2,int arr[],int arr2[])
    {int j,k,size2;
     j=n1-1;
     k=n2-1;
     size2=size;
        while(size!=0)
        {if(j>=0&&k>=0)
        {
            if(arr[j]>arr2[k])
            {
                arr[size-1]=arr[j];//assign arr[j] to arr[size-1]
                --j;
            }
            else if(arr2[k]>=arr[j])
            {
                arr[size-1]=arr2[k];//assign arr2[k] to arr[size-1]
                --k;
            }
             
        }
        
        else if(j<0)
        {
          arr[size-1]=arr2[k];
          --k;
        }
        else if(k<0)
        {
            arr[size-1]=arr[j];
            --j;
        }
        --size;//decrement size
        }
        System.out.println("merge array is: ");
        for(int i=0;i<size2;i++)
        {
            System.out.println(arr[i]);//print merge sorted array
        }
    } 
    public static void main(String args[])
    {int size,arr[],arr2[],n1,n2;
    Mergesortedarray obj2=new Mergesortedarray();
    System.out.println("enter the size of merge array: ");
    size=obj.nextInt();//input size 
    arr=new int[size];//first array
    System.out.println("enter the size of the first array:");
    n1=obj.nextInt();//input size of first array
    System.out.println("enter the sorted array elements: ");
    for(int i=0;i<n1;i++)
    {
        arr[i]=obj.nextInt();//input elements of first array
    }
   
    n2=size-n1;//size of second array
    System.out.println("so, the size of the second array is "+n2);
    arr2=new int[n2];//second array
    System.out.println("enter the sorted array elements: ");
    for(int i=0;i<n2;i++)
    {
        arr2[i]=obj.nextInt();//input elements of second array
    }
    obj2.merge(size,n1,n2,arr,arr2);//calling of merge()
        
    }
    
}
