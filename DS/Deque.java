/*
 WAP to implement Dequeue using array

TIME COMPLEXITY
insertRear  O(1)
insertFront O(1)
deleteFront O(1)
deleteRear  O(1)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of deque: 
5
enter the deque operation:
1.insertRear
2.insertFront
3.deleteFront
4.deleteRear
5.display 
enter your choice: 
1
enter the value to be inserted: 
200
Element inserted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
2
enter the value to be inserted: 
800
Element inserted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
5
Deque elements are: 
800
200
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
3
Element deleted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
4
Element deleted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
5
Deque is empty 
do you want to again enter your choice? (1 for yes, 0 for no)
0

 */
package deque;

import java.util.Scanner;
public class Deque {
    static Scanner obj=new Scanner(System.in);
    int front,rear;
    void initialize()
    {
        front=0;//front initialize
        rear=0;//rear initialize
    }
    int insertRear(int queue[],int n,int num)
    { if(rear==(n))
       return 0;
       else
       {queue[rear++]= num;//element inserted
        return 1;
       }
    
        
    }
    int insertFront(int queue[],int n,int num)
    { if(rear==(n))
       return 0;
       else
       {for(int i=rear;i>=0;i--)
         queue[i+1]= queue[i];//element inserted
       queue[front]=num; 
       ++rear;
        return 1;
       }
    
        
    }
    
    int deleteFront(int queue[],int n)
    {  if(front==rear)
        return 0;
        else
        {front++;//element deleted
         return 1;
        }
        
    }
    int deleteRear(int queue[],int n)
    {  if(front==rear)
        return 0;
        else
        {rear--;//element deleted
         return 1;
        }
        
    }
    void display(int queue[],int n)
    {if(front==rear)
     {
      System.out.println("Deque is empty ");//print when front=rear
     }
    
    else
     {
     int i;
     System.out.println("Deque elements are: ");
        for(i=front;i<rear;i++)
        {
            System.out.println(queue[i]);//print deque element
        }
        
     }
        
    }
    public static void main (String args[])
    {int n,choice,num,flag;
        
        System.out.println("enter the size of deque: ");
        n=obj.nextInt();//input size of queue
        int[] deque=new int[n];
        System.out.println("enter the deque operation:\n1.insertRear\n2.insertFront\n3.deleteFront\n4.deleteRear\n5.display ");
        Deque obj2=new Deque();
        obj2.initialize();//initialize() call
        do{
        System.out.println("enter your choice: ");
        choice=obj.nextInt();//input user choice
        
        
        switch(choice)
        {
            case 1:
            { System.out.println("enter the value to be inserted: ");
              num=obj.nextInt();//input value
              int r = obj2.insertRear(deque,n,num);//value returned by insertRear() assign to r
              if(r==0)
                  System.out.println("Deque is full");
              else
                  System.out.println("Element inserted: ");
              break;  
            }
            case 2:
            {
                System.out.println("enter the value to be inserted: ");
              num=obj.nextInt();//input value
              int r = obj2.insertFront(deque,n,num);//value returned by insertFront() assign to r
              if(r==0)
                  System.out.println("Deque is full");
              else
                  System.out.println("Element inserted: ");
              break;
            }   
            case 3:
            {   int r = obj2.deleteFront(deque,n);//value returned by deleteFront() assign to r
                if(r==0)
                    System.out.println("Deque is empty");
                else
                    System.out.println("Element deleted: ");
                break;  
            }
            case 4:
            {
                int r = obj2.deleteRear(deque,n);//value returned by deleteRear() assign to r
                if(r==0)
                    System.out.println("Deque is empty");
                else
                    System.out.println("Element deleted: ");
                break; 
            }
            case 5:
            {
                obj2.display(deque,n);//display() call
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

