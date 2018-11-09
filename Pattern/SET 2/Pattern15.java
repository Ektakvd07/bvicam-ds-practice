/*
 WAP to print pattern
***********
***********
*         *
* *     * *
*    *    *
* *     * *
*         *
***********
***********

 */
package pattern;

public class Pattern15 {
    public static void main(String args[])
    {
        int i,j;
        for(i=0;i<9;i++)
        {
            for(j=0;j<11;j++)
            {
                if(i==0)
                    System.out.print("*");
                else if(i==1)
                    System.out.print("*");
                else if(i==7)
                    System.out.print("*");
                else if(i==8)
                    System.out.print("*");
                else if(i>1&&i<7)
                {if(j==0)
                    System.out.print("*");
                else if(j==10)
                    System.out.print("*");
                else if(i>j)
                {
                    if(((i%2)!=0)&&((j%2)==0)&&(i+j)==7)
                        System.out.print("*");
                    else if(((i%2)!=0)&&(j%2==0)&&(i+j)==5)
                        System.out.print("*");
                    else
                    System.out.print(" ");
                }
                else if(i<j)
                {
                    if(((i%2)!=0)&&((j%2)==0)&&(i+j)==13)
                        System.out.print("*");
                    else if((i==3)&&(j==8))
                        System.out.print("*");
                    else if((i==4)&&(j==5))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    
                }
                
                   else
                    System.out.print(" "); 
                
                }
                else
                    System.out.print(" ");
            }
            
                    System.out.println();
        }
    }
    
}
