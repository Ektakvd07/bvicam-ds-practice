/*
 WAP to print pattern
1 
4 9 16 
25 36 49 64 81 
100 121 144 169 196 225 256 
289 324 361 400 441 484 529 576 625 
 */
package pattern;

public class Pattern9 {
    public static void main(String args[])
    {int i,j;
     j=1;
     for(i=1;i<=5;i++)
     {
         for(;j<=i*i;j++)
         {
             System.out.print((j*j)+" ");
         }
         System.out.println();
     }
        
    }
    
}
