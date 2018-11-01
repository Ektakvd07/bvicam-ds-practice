/*
 WAP to print pattern
1
123
12345
1234567
123456789
1234567
12345
123
1

 */
package pattern;

public class Pattern8 {
    public static void main(String args[])
    {int i,j;
    for(i=0;i<=5;i++)
    {
        for(j=1;j<=9;j++)
        {   if(j<(i*2))
            System.out.print(j);
            
        }
        System.out.println();
    }
    for(i=4;i>=1;i--)
    {
        for(j=1;j<=9;j++)
        {if(j<(i*2))
            System.out.print(j);
            
        }
        System.out.println();
    }
        
    }
    
}
