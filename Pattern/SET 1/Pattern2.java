/*
 WAP to print pattern
*************************
 *     * *     * *     * 
  *   *   *   *   *   *  
   * *     * *     * *   
    *       *       *    
   * *     * *     * *   
  *   *   *   *   *   *  
 *     * *     * *     * 
*************************

 */
package pattern;

public class Pattern2 {
    public static void main(String args[])
    {int i,j;
    
    for(i=0;i<9;i++)
    {
        for(j=0;j<25;j++)
        {
        if(i==j)
        {System.out.print("*");}
        else if(i==0)
        {if(j>0)
            System.out.print("*");}
        else if(i==8)
        {
            System.out.print("*");}
        else if((i+j)==8)
        {
            System.out.print("*");
        }
        else if((i+j)==16)
        {
          System.out.print("*");  
        }
        else if((i+j)==24)
        {
          System.out.print("*");  
        }
        else if((j-i)==8)
        {
          System.out.print("*");  
        }
        else if((j-i)==16)
        {
          System.out.print("*");  
        }
        
        else
        {System.out.print(" ");}
        }
        System.out.println();
    }
        
    }
    
}
