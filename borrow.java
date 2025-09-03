import java.util.Scanner;
public class borrow {
    public static void main(String args[])
    {Scanner b1=new Scanner(System.in);
    System.out.println("Enter the numbers:");
    int num1=b1.nextInt();
    int num2=b1.nextInt();
    int borrow=0;
    if(num1<num2)
    {System.out.println("Not Possible...");
   
    }
    else{
    while(num1>0&&num2>0)
    {int r1=num1%10;
     int r2=num2%10;
     if(r1<r2)
      {borrow+=1;
        num1=(num1/10)-1;
        num2=num2/10;

      }
      else{
        num1=num1/10;
        num2=num2/10;
      }

    }
    System.out.println(borrow);
  }
      
    }
    
}
