/*
WAP to print pattern
*  ****
*  *  
*  *  
*******
   *  *
   *  *
****  *

 */
package pattern;

public class Pattern1 {
    public static void main(String args[])
    {int i,j;
    i=j=0;
    for(i=0;i<7;i++)
    {
        for(j=0;j<7;j++)
        {
    
        if(i==3)
        System.out.print("*");
        else if(j==3)
        System.out.print("*");
        else if(i==0)
        {
            if(j>3)
                System.out.print("*");
            else if(j==0)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        else if(j==0)
        {if(i<3)
            System.out.print("*");
        else if(i==6)
            System.out.print("*");
            else
                System.out.print(" ");
            
        }
        else if(i==6)
        {   if(j<3)
              System.out.print("*");
            else if(j==6)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        else if(j==6)
        {
          if(i>3)   
            System.out.print("*");  
        }
        else
        System.out.print(" ");
        }
        System.out.println();
    }
        
    }
    
}
