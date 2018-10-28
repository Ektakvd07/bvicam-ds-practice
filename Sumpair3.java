/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumpair3;
import java.util.Scanner;
public class Sumpair3 {
    static Scanner obj;
    static
    {
        obj=new Scanner(System.in);
    }
    
    public static void sum(int arr[],int n)
    {int b[]=new int[arr[n-1]+1];
     int i;
    for(i=0;i<n;i++)
    {
        b[arr[i]]++;
    }
    for(i=0;i<b.length;i++)
    {
        System.out.println(b[i]);
    }
    int j;
    i=0;
    for(j=0;j<b.length;j++)
    { 
     if(b[j]>0)
     {  
        int c=b[j];
        while(c>0)
        
        {
         if(i==n)
          break;
         arr[i++]=j;
         --c;
         
        }
        if(i==n)
         break;
        
       
        
     }
     
    }System.out.println("array is : ");
     for(i=0;i<n;i++)
     {System.out.println(arr[i]);
         
     }
     int num;
     System.out.println("Enter the number: ");
     num=obj.nextInt();
         i=0;
         j=arr.length-1;
         System.out.println("pair are: ");
        while(i<j)
        {
        if((arr[i]+arr[j])>num)
         {
            j--;
         }
        
        if((arr[i]+arr[j])==num)
         {  System.out.println("("+arr[i]+","+arr[j]+")");
            i++;
            j--;
         }
        
        }
     
     
        
    }
    
    public static void main(String args[])
    {int n,i;
    
     System.out.println("Enter the size of the array: ");
     n=obj.nextInt();
     int arr[]=new int[n];
     System.out.println("Enter the elemets of the array: ");
     for(i=0;i<n;i++)
     {
         arr[i]=obj.nextInt();
     }
     sum(arr,n);
        
    }
    
}
