import java.util.Scanner;
public class reverse_number{
    public static void main(String[] args) {
        Scanner b1=new Scanner(System.in);
        int n=b1.nextInt();
        int rev=0;
        while(n>0)
        {int remainder=n%10;
         rev=rev*10+remainder;
         n=n/10;

        }
        System.out.println(rev);
        b1.close();
    }
}
