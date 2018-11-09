/*
WAP to prit pattern
*****
 ****
  ***
   **
    *
    *
   **
  ***
 ****
*****

 */
package pattern;

public class Pattern14 {
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(i<=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(i=4;i>=0;i--)
        {
            for(j=0;j<5;j++)
            {
                if(i<=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
