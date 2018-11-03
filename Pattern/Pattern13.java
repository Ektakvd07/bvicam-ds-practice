/*
 WAP to print pattern
1 0 1 0 1 0 1 0 
  1 0 1 0 1 0 
    1 0 1 0 
      1 0 
       1 
       0 
      1 0 
    1 0 1 0 
  1 0 1 0 1 0 
1 0 1 0 1 0 1 0 

 */
package pattern;

public class Pattern13 {
    public static void main(String args[])
    {int i,j;
    for(i=0;i<5;i++)
    {
        for(j=0;j<8;j++)
        {   
            if(j>=(i*2))
            { if(i%2==0)
             {if((i+j)%2==0)
                     
                System.out.print("1 ");
             else
                 System.out.print("0 ");
             }
            else
            {
                if((i+j)%2==0)
                     
                System.out.print("0 ");
             else
                 System.out.print("1 ");
            }
                
            }
            else if(j<(i*2))
            {   if(j==7)
                System.out.print("1 ");
                else 
                System.out.print(" ");
            }
           
        }
        System.out.println();
    }
    for(i=4;i>=0;i--)
    {
        for(j=0;j<8;j++)
        {
            if(j>=(i*2))
            {
                if(i%2==0)
             {if((i+j)%2==0)
                     
                System.out.print("1 ");
             else
                 System.out.print("0 ");
             }
            else
            {
                if((i+j)%2==0)
                     
                System.out.print("0 ");
             else
                 System.out.print("1 ");
            }
            }
            else if(j<(i*2))
            {   if(j==7)
                System.out.print("0 ");
                else 
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
        
    }
    
}
