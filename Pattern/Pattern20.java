/*
 WAP to print pattern
     1 
    1 2 
   1 2 3 
  1 2 3 4 
 1 2 3 4 5 
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 

 */
package pattern;
import java.util.Scanner;
public class Pattern20 {
    public static void main(String args[])
    {
        int i,j,k;
        
        for(i=1;i<=6;i++)
        {k=1;
            for(j=6;j>=1;j--)
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
        for(i=1;i<6;i++)
        {
            for(j=1;j<=6;j++)
            {
                if(j>i)
                    System.out.print(j+" ");
                else
                    System.out.print(" ");
                
            }
            System.out.println();
            
        }
    }
    
}
