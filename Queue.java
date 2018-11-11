/*
 WAP to implement queue using array

TIME COMPLEXITY
insert  O(1)
delete  O(1)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of queue: 
4
enter the stack operation:
1.insert
2.delete
3.display 
enter your choice: 
1
enter the value to be inserted: 
23
Element inserted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
2
Element deleted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
3
Queue is empty 
do you want to again enter your choice? (1 for yes, 0 for no)
0

 */
package pattern;

import java.util.Scanner;


public class Queue {
    static Scanner obj=new Scanner(System.in);
    int front=0,rear=0;
    void insert(int queue[],int n,int num)
    { if(rear==(n))
       System.out.println("Queue is full");
       else
       {queue[rear++]= num;
       System.out.println("Element inserted: ");
       }
    
        
    }
    void delete(int queue[],int n)
    {if(front==rear)
        System.out.println("Queue is empty");
        else
        {front++;
        System.out.println("Element deleted: ");
        }
        
    }
    void display(int queue[],int n)
    {if(front==rear)
     {
      System.out.println("Queue is empty ");
     }
    
    else
     {
     int i;
     System.out.println("Queue elements are: ");
        for(i=front;i<rear;i++)
        {
            System.out.println(queue[i]);
        }
        
     }
        
    }
    public static void main (String args[])
    {int n,choice,num,flag;
        flag=1;
        System.out.println("enter the size of queue: ");
        n=obj.nextInt();
        int[] queue=new int[n];
        System.out.println("enter the stack operation:\n1.insert\n2.delete\n3.display ");
        Queue obj2=new Queue();
        do{
        System.out.println("enter your choice: ");
        choice=obj.nextInt();
        
        
        switch(choice)
        {
            case 1:
            { System.out.println("enter the value to be inserted: ");
              num=obj.nextInt();
                obj2.insert(queue,n,num);
              break;  
            }
            case 2:
            {   obj2.delete(queue,n);
                break;  
            }
            
            case 3:
            {
                obj2.display(queue,n);
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
    
    


