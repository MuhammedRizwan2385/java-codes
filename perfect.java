/*A perfect number is a positive integer that equals the sum of its proper divisors (divisors excluding the number itself). 
For example, 6 is a perfect number because its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. */

import java.util.Scanner;
class perfect{
    public static void main(String[] args) {
        Scanner b1=new Scanner(System.in);
        int n=b1.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            {sum+=i;
             
            }

        }
        if(sum==n)
        {
            System.out.println("Perfect number");
        }
        else
        {System.out.println("Not a perfect number");

        }

    }
}
