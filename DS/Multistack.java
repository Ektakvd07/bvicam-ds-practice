/*
 WAP to implement multistack

TIME COMPLEXITY
push O(1)
pop  O(1)
peek O(1)

SPACE COMPLEXITY
O(n)

TEST CASES
run:
enter the size: 
5
MENU
1.push
2.pop
3.peek
4.display
enter the choice;
1
where you want to push/pop/peek/display?
1.stack1
2.stack2
enter your choice
2
enter the number
900
element pushed
do you want to again enter your choice? (1 for yes, 0 for no)
1
MENU
1.push
2.pop
3.peek
4.display
enter the choice;
1
where you want to push/pop/peek/display?
1.stack1
2.stack2
enter your choice
2
enter the number
456
element pushed
do you want to again enter your choice? (1 for yes, 0 for no)
1
MENU
1.push
2.pop
3.peek
4.display
enter the choice;
1
where you want to push/pop/peek/display?
1.stack1
2.stack2
enter your choice
2
enter the number
789
stack overflow
do you want to again enter your choice? (1 for yes, 0 for no)
0


 */
package repo.bvicam_ds_practice.DS;
import java.util.Scanner;
public class Multistack {
    static Scanner obj;
    
    static {
        obj=new Scanner(System.in);
    }
    
    int n,arr[],top,top2;
    
    
    Multistack()
    {
        System.out.println("enter the size: ");
        n=obj.nextInt();//input size of stack
        arr=new int[n];
        top2=n;
        top=(n/2);
    }
    
    
    boolean push(int stackNumber, int num)//push operation
    {
       if(stackNumber==1)//block for pushing in stack1
       {
           if(top==0)//stack overflow
               return false;
           else
           {
               arr[--top]=num;//element pushed
               return true;
           }
       }
       else//block for pushing in stack2
       {
           if(top2==((n/2)+1))//stack overflow
                return false;
       else
        {
            arr[--top2]=num;//element pushed
            return true;
        }
       }
    }
    int peek(int stackNumber)//peek operation
    {
        if(stackNumber==1)
        {
            return(arr[top]);//top of stack1
        }
        else
        { return(arr[top2]);//top of stack2
            
        }
    }
    
    boolean pop(int ch)//pop operation
    { 
        if(ch==1)//block for pop from stack1
        {
            if(top==(n/2))//stack underflow
                return false;
            else
            {
                ++top;//element popped
                return true;
            }
    }
    else//block for pop from stack2
    {
        if(top2==n)//stack underflow
            return false;
        else
        {
            ++top2;//element popped
            return true;
        }
    }
}
    void display(int ch)
    {
        System.out.println("elements are:");
        if(ch==1)
        {
          for(int i=(n/2)-1;i>=top;i--)
              System.out.println(arr[i]);//print eleemnt of stack1
        }
        else
        {for(int i=n-1;i<=top2;i--)
              System.out.println(arr[i]);//print element of stack2
            
        }
    }
    public static void main(String args[])
    {
        Multistack obj2=new Multistack();
        
        int choice,choice2,num,flag;
        do{
        System.out.println("MENU\n1.push\n2.pop\n3.peek\n4.display");
        System.out.println("enter the choice;");
        choice=obj.nextInt();//input choice
        System.out.println("where you want to push/pop/peek/display?\n1.stack1\n2.stack2\nenter your choice");
        choice2=obj.nextInt();//input choice2
        
        switch(choice)
        {
            case 1:
                System.out.println("enter the number");
                num=obj.nextInt();//input num
                boolean r=obj2.push(choice2,num);
                if(r)
                    System.out.println("element pushed");
                else
                    System.out.println("stack overflow");
                break;
            case 2:
                boolean r2=obj2.pop(choice2);
                if(r2)
                    System.out.println("element popped");
                else
                    System.out.println("stack underflow");
                break;
            case 3:
                int r3=obj2.peek(choice2);
                System.out.println("top is "+r3);
                break;
            case 4:
                obj2.display(choice2);
                break;
            default:
                System.out.println("you entered wrong choice");
        }System.out.println("do you want to again enter your choice? (1 for yes, 0 for no)");
         flag=obj.nextInt();
        }while(flag==1);   
    }
}
