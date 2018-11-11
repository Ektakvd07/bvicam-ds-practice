/*
 WAP to print pattern
1111
1  1 
1  1 
1111
 */
package pattern;

public class Pattern7 {
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                if(i==0)
                    System.out.print("1");
                else if(i==3)
                    System.out.print("1");
                else
                {
                    if(j==0)
                      System.out.print("1"); 
                    else if(j==3)
                      System.out.print("1"); 
                    else
                        System.out.print(" ");  
                }
                
                
            }
            System.out.println();
        }
    }
    
}
