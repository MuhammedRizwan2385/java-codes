//using euclidean repeated division
import java.util.Scanner;
class lcm{
    static int lcm(int a,int b)
    {return ((a*b)/gcd(a, b));

    }
    static int gcd(int a,int b){
        if(b==0)
        {return a;

        }
        else
        {return gcd(b,a%b);

        }
    }

    public static void main(String[] args) {

        Scanner b1=new Scanner(System.in);
        int a=b1.nextInt();
        int b=b1.nextInt();
        System.out.println(lcm(a,b));

    }
}
