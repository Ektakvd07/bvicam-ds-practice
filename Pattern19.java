/*
 WAP to print pattern
Enter the value of n: 
6
     1 
    1 2 
   1 2 3 
  1 2 3 4 
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 

 */
package pattern;

import java.util.Scanner;

public class Pattern19 {
      public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,j,k,n;
        System.out.println("Enter the value of n: ");
        n=obj.nextInt();
        for(i=1;i<=n-2;i++)
        {k=1;
            for(j=n;j>=1;j--)
            {  if(j<=i)
              {
               System.out.print(k+" ");
               k++;
              }
            else
              System.out.print(" ");  
            }
            System.out.println();
            
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j>=i)
                    System.out.print(j+" ");
                else
                    System.out.print(" ");
                
            }
            System.out.println();
            
        }
    }
    
}
