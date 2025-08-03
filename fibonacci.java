import java.util.Scanner;
class fibonacci{
    public static void main(String[] args) {
    Scanner b1=new Scanner(System.in);
    int n=b1.nextInt();
   int  n1=0;
    int n2=1;
    int n3;

    if(n==1)
    {System.out.println(n1);

    }
    else if(n==2)
    {System.out.print(n1+"\t");
    System.out.print(n2);


    }
    else{
        System.out.print(n1+"\t");
        System.out.print(n2+"\t");
        for(int i=3;i<=n;i++)
        {n3=n1+n2;
        System.out.print(n3+"\t");
        n1=n2;
        n2=n3;

        }
    }

    }
}
