/*
 WAP to implement stack using array

TIME COMPLEXITY
push O(1)
pop  O(1)
peek O(1)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of stack: 
5
enter the stack operation:
1.push
2.pop
3.peek
4.display 
enter your choice: 
1
enter the value to be pushed: 
90
Element pushed: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
1
enter the value to be pushed: 
78
Element pushed: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
4
stack elements: 
78
90
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
2
Element popped: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
4
stack elements: 
90
do you want to again enter your choice? (1 for yes, 0 for no)
0
 */
package stack;
import java.util.Scanner;

public class Stack {
    static Scanner obj=new Scanner(System.in);
    
    static int top=-1;
    
    void push(int stack[],int num,int n)
    {  if(top==(n-1))
       System.out.println("Stack overflow");
       else
       {stack[++top]= num;
       System.out.println("Element pushed: ");
       }
    
    }
    void pop(int stack[])
    {   if(top<0)
        System.out.println("Stack underflow");
        else
        {top--;
        System.out.println("Element popped: ");
        }
     
            
    }
    void peek(int stack[])
    {if(top<0)
    {
         System.out.println("Stack underflow");
    }
    else
        System.out.println("Stack top: "+stack[top]);
    
    }
    void display(int stack[])
    {if(top<0)
    {
      System.out.println("stack empty ");
    }
    else
    {
     int i;
     System.out.println("stack elements are: ");
        for(i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
        
    }
    }
    public static void main(String args[])
    {
        int n,choice,num,flag;
        flag=1;
        System.out.println("enter the size of stack: ");
        n=obj.nextInt();
        int[] stack=new int[n];
        System.out.println("enter the stack operation:\n1.push\n2.pop\n3.peek\n4.display ");
        do{
        System.out.println("enter your choice: ");
        choice=obj.nextInt();
        Stack obj2=new Stack();
        
        switch(choice)
        {
            case 1:
            { System.out.println("enter the value to be pushed: ");
              num=obj.nextInt();
                obj2.push(stack,num,n);
              break;  
            }
            case 2:
            {   obj2.pop(stack);
                break;  
            }
            case 3:
            {   obj2.peek(stack);
                break;  
            }
            case 4:
            {
                obj2.display(stack);
                break;
            }
            default:
            {
               System.out.println("entered wrong choice");
            }
        }System.out.println("do you want to again enter your choice? (1 for yes, 0 for no)");
         flag=obj.nextInt();
        }while(flag==1);
    }
    
}
