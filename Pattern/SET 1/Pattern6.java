/*
 WAP to print pattern
12344321
123**321
12****21
1******1

 */
package pattern;

public class Pattern6 {
    public static void main(String args[])
    {int i,j,k;
    for(i=4;i>=1;i--)
    {
        for(j=1;j<=4;j++)
        {if(j<=i)
            System.out.print(j);
        else
            System.out.print("*");
            
        }
        
        for(k=4;k>=1;k--)
        {if(k<=i)
            System.out.print(k);
        else
            System.out.print("*");
              
        }
        System.out.println();
    }
        
    }
    
}
