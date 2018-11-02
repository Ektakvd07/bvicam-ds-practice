/*
 WAP to print pattern
1
121
12321
1234321
123454321

 */
package pattern;

public class Pattern17 {
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
               System.out.print(j);
            }
            for(k=j-2;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}
