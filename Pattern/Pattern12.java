/*
 WAP to print pattern

123456789
12345678
123456
12345
123
12
98
987
98765
987654
98765432
987654321

 */
package pattern;

public class Pattern12 {
    public static void main(String args[])
    {
        int i,j;
        for(i=6;i>=0;i=i-3)
        {
            for(j=1;j<=i+3;j++)
            {System.out.print(j);
                
            }System.out.println();
            for(j=1;j<=i+2;j++)
            {
               System.out.print(j);
            }
            System.out.println();
        }
        for(i=6;i>=0;i=i-3)
        {
            for(j=9;j>=i+2;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            for(j=9;j>=i+1;j--)
            {   System.out.print(j);
                
            }
            System.out.println();
        }
        
    }
    
}

