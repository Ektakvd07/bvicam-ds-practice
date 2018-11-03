/*
 WAP to print pattern
*
***
*****
*******
*********
 */
package pattern;

public class Pattern5 {
    public static void main(String args[])
    {int i,j;
    for(i=0;i<5;i++)
    {
        for(j=0;j<=9;j++)
        {   if(j<=(i*2))
            System.out.print("*");
            
        }
        System.out.println();
    }
        
    }
    
}
