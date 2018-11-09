/*
 WAP to print pattern
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
 */
package pattern;

public class Pattern10 {
    public static void main(String args[])
    {
        int i,j,c,k;
        for(i=1;i<=5;i++)
        {
                c=5;
                k=i;
            for(j=1;j<=i;j++)
            {   
                
                System.out.print(k+" ");
                c--;
                k=k+c;
                
                
            }
            System.out.println();
        }
    }
    
}
