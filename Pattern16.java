/*
 WAP to print pattern
* * * * * 
  * * * 
   * * 
    * 

 */
package pattern;

public class Pattern16 {
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
            {   if((j==0)&&(i==0))
                    System.out.print("* ");
                else if((j>i))
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
