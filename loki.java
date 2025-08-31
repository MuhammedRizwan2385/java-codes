'''Loki, the God of mischief can brainwash any living person by touching him/her with his Mind stone, and has 
decided to break the avengers (a warrior group) to face into each other, so that they can turn against each other
 and make Loki’s evil plans easier. Now all the avengers have some amount of strength that is denoted in integers.
 Loki wants to brainwash the least amount of people possible, because he is lazy. But he wants his team of avengers 
 to win the battle. What is the number of avengers Loki will get brainwashed. 
 Input Format: First line contains an integer n, denoting the number of total avengers the next line contains n 
 space separated integers denoting the power of each avenger. 
 Output Format: One line denoting the total number of avengers brainwashed by Loki’s Mind stone. 
 Constraints: 2<=n<=10^6 Test case: Sample Input: 6         9 3 1 2 4 2 Sample Output: 2 
 Output Specifications: Loki can brainwash the avengers with power 9 and 3, or with 9 and 2, or with 9,4, 
 and the rest will be losing cause cumulative power of rest avengers is less than the brainwashed total power by 
 Loki.'''


import java.util.*;
class loki
{public static void main(String args[])
    {int n;
     int count=0;
     int remaining_sum=0;
     int brainwashed_sum=0;
     System.out.println("Enter n:");
     Scanner b1=new Scanner(System.in);
     n=b1.nextInt();
     System.out.println("Enter the powers:");
     int arr[]=new int[n];
     for(int i=0;i<arr.length;i++)
     {arr[i]=b1.nextInt();
      remaining_sum+=arr[i];
     }
     Arrays.sort(arr);
     for(int i=arr.length-1;i>=0;i--)
     { if(brainwashed_sum>remaining_sum)
        {break;
        }
        else
        {
            brainwashed_sum+=arr[i];
            count+=1;
            remaining_sum-=arr[i];
      

     }


    }
    System.out.println(count);

}
}
