/*
 WAP to print pattern

*               * 
  *           *   
*   *       *   * 
  *   *   *   *   
*   *   *   *   * 
  *   *   *   *   
*   *       *   * 
  *           *   
*               * 

 */
package pattern.Pattern;

public class Pattern3
{public static void main(String args[])
    {
        int i,j;
        for(i=0;i<9;i++)
        {
            for(j=0;j<9;j++)
            { if(i==j)
            {System.out.print("* ");}
            else if(i>j)
            {if((i+j)<=8)
            {
                if((i+j)%2==0)
                {
                System.out.print("* ");
                }
                else
                    System.out.print("  "); 
                    
            }
            else
                System.out.print("  "); 
            }
            else if(j>i)
            {if((i+j)>=8)
            {
                if((i+j)%2==0)
                {
                System.out.print("* ");
                }
                else
                    System.out.print("  "); 
            }
             else
                System.out.print("  "); 
            }
            
            }
            System.out.println();
        }
    }
}
    
    
    

