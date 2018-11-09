/*
 WAP to prnt pattern
7
76
765
7654
76543
765432
7654321
 */
package pattern;

public class Pattern4 {
    public static void main(String args[])
    {int i,j;
     for(i=7;i>=1;i--)
     {
         for(j=7;j>=i;j--)
         {
             System.out.print(j);
         }
         System.out.println();
     }
        
    }
    
}
