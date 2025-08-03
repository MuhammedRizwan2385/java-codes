//using euclidean repeated division
import java.util.Scanner;
class gcd{
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
        System.out.println(gcd(a,b));

    }
}
