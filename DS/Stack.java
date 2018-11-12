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
    int top;
    void initialize()
    {
    top=-1;//top initialize
    }
    
    int push(int stack[],int num,int n)
    {  if(top==(n-1))
       return 0;
       else
       {stack[++top]= num;//element pushed
       return 1;
       }
    
    }
    int pop(int stack[])
    {   if(top<0)
        return 0;
        else
        {top--;//element popped
        return 1;
        }
     
            
    }
    int peek(int stack[])
    {if(top<0)
    {
         return 0;
    }
    else
        return stack[top];//return top element
    
    }
    void display(int stack[])
    {if(top<0)
    {
      System.out.println("stack empty ");//print when top<0
    }
    else
    {
     int i;
     System.out.println("stack elements are: ");
        for(i=top;i>=0;i--)
        {
            System.out.println(stack[i]);//print stack element
        }
        
    }
    }
    public static void main(String args[])
    {
        int n,choice,num,flag;
        flag=1;
        System.out.println("enter the size of stack: ");
        n=obj.nextInt();//input size of stack
        int[] stack=new int[n];
        System.out.println("enter the stack operation:\n1.push\n2.pop\n3.peek\n4.display ");
        Stack obj2=new Stack();
        obj2.initialize();//initialize() call
        do{
        System.out.println("enter your choice: ");
        choice=obj.nextInt();//input user choice
        
        switch(choice)
        {
            case 1:
            { System.out.println("enter the value to be pushed: ");
              num=obj.nextInt();//input value
              int r = obj2.push(stack,num,n);//value retuned by push() assign to r
              if(r==0)
                  System.out.println("Stack overflow");
              else
                  System.out.println("Element pushed: ");
              break;  
            }
            case 2:
            {   int r = obj2.pop(stack);//value retuned by pop() assign to r
            if(r==0)
                System.out.println("Stack underflow");
            else
                System.out.println("Element popped: ");
                break;  
            }
            case 3:
            {   int r = obj2.peek(stack);//value retuned by peek() assign to r
             if(r==0)
                 System.out.println("Stack underflow");
             else
                 System.out.println("Stack top: "+r);
                break;  
            }
            case 4:
            {
                obj2.display(stack);//display() call 
                break;
            }
            default:
            {
               System.out.println("entered wrong choice");//print on wrong choice entered by user
            }
        }System.out.println("do you want to again enter your choice? (1 for yes, 0 for no)");
         flag=obj.nextInt();
        }while(flag==1);
    }
    
}
