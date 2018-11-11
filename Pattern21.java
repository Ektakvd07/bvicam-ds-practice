/*
 WAP to print pattern

TIME COMPLEXITY
O(n*n)

SPACE COMPLEXITY
O(n*n)

TEST CASES:
enter the even array size: 
10
pattern: 
1 2 3 4 5 6 7 8 9 10 
36 37 38 39 40 41 42 43 44 11 
35 64 65 66 67 68 69 70 45 12 
34 63 84 85 86 87 88 71 46 13 
33 62 83 96 97 98 89 72 47 14 
32 61 82 95 100 99 90 73 48 15 
31 60 81 94 93 92 91 74 49 16 
30 59 80 79 78 77 76 75 50 17 
29 58 57 56 55 54 53 52 51 18 
28 27 26 25 24 23 22 21 20 19 

enter the even array size: 
6
pattern: 
1 2 3 4 5 6 
20 21 22 23 24 7 
19 32 33 34 25 8 
18 31 36 35 26 9 
17 30 29 28 27 10 
16 15 14 13 12 11 
 */
package pattern;
import java.util.Scanner;
public class Pattern21 {
    public static void main(String args[])
    {Scanner obj=new Scanner(System.in);
      int i,j,k,a,lu,lb,ru,rb,n;
      i=1;
      j=0;
      k=0;
      lu=0;
      a=1;
      System.out.println("enter the even array size: ");
      n=obj.nextInt();//input array size
      int arr[][]=new int[n][n];
      
      rb=n-1;
    while(i<=n/2)//iterate from i=1 to half of the array size
    {
        while(j<rb)
        {
           arr[lu][j++] =a++;  //assigning upper row
        }
        while(k<rb)
        {
          arr[k++][rb]=a++;//assigning right column
        }
        while(j>lu)
        {
          arr[rb][j--]=a++;//assigning bottom row
        }
        while(k>lu)
        { 
            arr[k--][lu]=a++;//assigning left column 
        }
         ++j;//increment i for next iteration
         ++k;//increment k for next iteration
         ++lu;//increment lu for next iteration
         --rb;//decrement rb for next iteration
         ++i;//increment i for next iteration
        
    }System.out.println("pattern: ");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
          System.out.print(arr[i][j]+" ");//print array element
        }
        System.out.println();
    }
    }
    
}
