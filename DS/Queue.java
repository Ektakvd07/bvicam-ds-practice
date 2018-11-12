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
package queue;

import java.util.Scanner;


public class Queue {
    static Scanner obj=new Scanner(System.in);
    int front,rear;
    void initialize()
    {
        front=0;//front initialize
        rear=0;//rear initialize
    }
    int insert(int queue[],int n,int num)
    { if(rear==(n))
       return 0;
       else
       {queue[rear++]= num;//element inserted
        return 1;
       }
    
        
    }
    int delete(int queue[],int n)
    {  if(front==rear)
        return 0;
        else
        {front++;//element deleted
         return 1;
        }
        
    }
    void display(int queue[],int n)
    {if(front==rear)
     {
      System.out.println("Queue is empty ");//print when front=rear
     }
    
    else
     {
     int i;
     System.out.println("Queue elements are: ");
        for(i=front;i<rear;i++)
        {
            System.out.println(queue[i]);//print queue element
        }
        
     }
        
    }
    public static void main (String args[])
    {int n,choice,num,flag;
        flag=1;
        System.out.println("enter the size of queue: ");
        n=obj.nextInt();//input size of queue
        int[] queue=new int[n];
        System.out.println("enter the stack operation:\n1.insert\n2.delete\n3.display ");
        Queue obj2=new Queue();
        obj2.initialize();//initialize() call
        do{
        System.out.println("enter your choice: ");
        choice=obj.nextInt();//input user choice
        
        
        switch(choice)
        {
            case 1:
            { System.out.println("enter the value to be inserted: ");
              num=obj.nextInt();//input value
              int r = obj2.insert(queue,n,num);//value returned by insert() assign to r
              if(r==0)
                  System.out.println("Queue is full");
              else
                  System.out.println("Element inserted: ");
              break;  
            }
            case 2:
            {   int r = obj2.delete(queue,n);//value returned by delete() assign to r
                if(r==0)
                    System.out.println("Queue is empty");
                else
                    System.out.println("Element deleted: ");
                break;  
            }
            
            case 3:
            {
                obj2.display(queue,n);//display() call
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
    
    


