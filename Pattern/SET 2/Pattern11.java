/*
 WAP to print pattern

  *  
 * * 
* * *
 * * 
  *  

 */
package pattern;

public class Pattern11 {
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {   if(i==0)
                {if(j==0)
                   System.out.print(" ");
                else if(j==4)
                    System.out.print(" ");
                else if(((i+j)%2)==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
                    
                }
                else if(i==4)
                {if(j==4)
                    System.out.print(" ");
                else if(j==0)
                    System.out.print(" ");
                else if(((i+j)%2)==0)
                    System.out.print("*");
                else
                    System.out.print(" ");
                   
                    
                }
                else if(((i+j)%2)==0)
                {
                    System.out.print("*");
                    
                }
                
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
