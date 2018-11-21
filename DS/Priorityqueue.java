/*
 WAP to implement priorityqueue

TIME COMPLEXITY
insert  O(1)
delete  O(n)

SPACE COMPLEXITY
O(n)

TEST CASES
enter the size of priorityqueue: 
2
MENU
1.insert
2.delete
3.display
enter the choice;
1
enter the number
34
enter the priority
2
element inserted
do you want to again enter your choice? (1 for yes, 0 for no)
1
MENU
1.insert
2.delete
3.display
enter the choice;
1
enter the number
45
enter the priority
0
element inserted
do you want to again enter your choice? (1 for yes, 0 for no)
1
MENU
1.insert
2.delete
3.display
enter the choice;
2
highest priority:2
element deleted
45
do you want to again enter your choice? (1 for yes, 0 for no)
1
MENU
1.insert
2.delete
3.display
enter the choice;
2
highest priority:0
element deleted
45
do you want to again enter your choice? (1 for yes, 0 for no)
1
MENU
1.insert
2.delete
3.display
enter the choice;
2
queue underflow
do you want to again enter your choice? (1 for yes, 0 for no)
0
 */
package repo.bvicam_ds_practice.DS;
import java.util.Scanner;

public class Priorityqueue {
     static Scanner obj=new Scanner(System.in);
     int n;
     int queue[];
     int arr2[];//for storing priority of element of queue[]
     int rear;
     Priorityqueue()
     {System.out.println("enter the size of priorityqueue: ");
      n=obj.nextInt();
      queue = new int[n];
      arr2 = new int[n];
      rear=-1;
     }
     boolean insert(int num,int priority)//insert operation 
     {if(rear==n)
         return false;
     else
     {
         queue[++rear]=num;
         arr2[rear]=priority;
         return true;
     }
         
     }
     int delete()//delete operation for deleting element with highest priority
     {int max=arr2[0],index=0;
     if(rear==-1)
     {
         return 0;
     }
     else
     {
      for(int i=0;i<n;i++)
      {if(arr2[i]>max)
       { max=arr2[i];
         index=i;
       }
      }
      for(int i=index;i<n-1;i++)
      {queue[i]=queue[i+1];  
      }
      --rear; 
     for(int i=index;i<n-1;i++)
     {
       arr2[i]=arr2[i+1];  
     }
     --n;
     System.out.println("highest priority:"+max);
     return queue[index];
     }
     }
     void display()//display operation
     { if(rear==-1)
     {
      System.out.println("queue empty");
     }
     else
     {System.out.println("elements are: ");
         for(int i=0;i<=rear;i++)
         {
          System.out.println(queue[i]);//print element
         }
     }
     }
     public static void main(String args[])
     {Priorityqueue obj2=new Priorityqueue();
        
        int choice,num,priority,flag;
        do{
        System.out.println("MENU\n1.insert\n2.delete\n3.display");
        System.out.println("enter the choice;");
        choice=obj.nextInt();//input choice
        
        
        switch(choice)
        {
            case 1:
                System.out.println("enter the number");
                num=obj.nextInt();//input num
                System.out.println("enter the priority");
                priority=obj.nextInt();//input priority
                boolean r=obj2.insert(num,priority);
                if(r)
                    System.out.println("element inserted");
                else
                    System.out.println("queue overflow");
                break;
            case 2:
                int r2=obj2.delete();
                if(r2==0)
                    System.out.println("queue underflow");
                else
                 {System.out.println("element deleted");
                    System.out.println(r2);
                 }
                break;
            
            case 4:
                obj2.display();
                break;
            default:
                System.out.println("you entered wrong choice");
        }System.out.println("do you want to again enter your choice? (1 for yes, 0 for no)");
         flag=obj.nextInt();
        }while(flag==1); 
         
     }
}
