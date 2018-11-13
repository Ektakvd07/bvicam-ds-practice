/*
 WAP to implement linkedlist using array

TIME COMPLEXITY:
insert O(1)
delete O(1)

SPACE COMPLEXITY:
O(n)

TEST CASES:
enter the size of array: 
6
enter the size of LinkedList
4
enter the linkedList elements
200 500 400 100
LinkedList created
enter the LinkedList operation:
1.insert
2.delete
3.display 
enter your choice: 
2
enter the position: 
2
Element deleted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
3
LinkedList elements are: 
200
400
100
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
1
enter the value to be inserted: 
500
enter the position: 
2
Element inserted: 
do you want to again enter your choice? (1 for yes, 0 for no)
1
enter your choice: 
3
LinkedList elements are: 
200
500
400
100
do you want to again enter your choice? (1 for yes, 0 for no)
0
 */
package linkedlist;

import java.util.Scanner;

public class LinkedList {
    static Scanner obj=new Scanner(System.in);
    int next;
    void create(int LinkedList[],int size)
    {  
       System.out.println("enter the linkedList elements");
       for(int i=0;i<size;i++)
       {
           LinkedList[i]=obj.nextInt();//input linkedlist element
           next=i;
       }
       System.out.println("LinkedList created");
    }
    int insert(int LinkedList[],int n)
    { if(next==(n-1))
       return 0;
       else
       {System.out.println("enter the value to be inserted: ");
        int num=obj.nextInt();//input num
        System.out.println("enter the position: ");
        int pos=obj.nextInt();//input pos
           for(int i=next;i>=pos-1;i--)
        {
           LinkedList[i+1]=LinkedList[i];
        }
           LinkedList[pos-1]=num;//element inserted
           next++;
        return 1;
       }
    
        
    }
    int delete(int LinkedList[])
    {  if(next<0)
        return 0;
        else
        {System.out.println("enter the position: ");
         int pos=obj.nextInt();//input pos
         for(int i=pos-1;i<next;i++)
         {LinkedList[i]=LinkedList[i+1];
          
         }
         next--;//element deleted
         }
        return 1;
        
    }
    void display(int LinkedList[])
    {if(next<0)
     {
      System.out.println("LinkedList is empty ");//print when next<0
     }
    
    else
     {
     int i;
     System.out.println("LinkedList elements are: ");
        for(i=0;i<=next;i++)
        {
            System.out.println(LinkedList[i]);//print LinkedList element
        }
        
     }
        
    }
    public static void main (String args[])
    {int n,choice,flag;
        flag=1;
        System.out.println("enter the size of array: ");
        n=obj.nextInt();//input size of array
        int[] LinkedList=new int[n];
        System.out.println("enter the size of LinkedList");
        int size = obj.nextInt();//input size of linkedlist
        LinkedList obj2=new LinkedList();
        obj2.create(LinkedList,size);//create() call
        
        System.out.println("enter the LinkedList operation:\n1.insert\n2.delete\n3.display ");
       
        do{
        System.out.println("enter your choice: ");
        choice=obj.nextInt();//input user choice
        
        
        switch(choice)
        {
            case 1:
            { 
              int r = obj2.insert(LinkedList,n);//value returned by insert() assign to r
              if(r==0)
                  System.out.println("no space for inserting new node");
              else
                  System.out.println("Element inserted: ");
              break;  
            }
            case 2:
            {   
                int r = obj2.delete(LinkedList);//value returned by delete() assign to r
                if(r==0)
                    System.out.println("LinkedList is empty");
                else
                    System.out.println("Element deleted: ");
                break;  
            }
            
            case 3:
            {
                obj2.display(LinkedList);//display() call
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
