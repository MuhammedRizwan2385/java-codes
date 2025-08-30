import java.util.Scanner;
public class palindrome {
    public static void main(String args[])
    {Scanner b1=new Scanner(System.in);
     System.out.println("Enter the String:");
     String name=b1.next();
     int len=name.length();
     int flag=0;
     int i,j;
     for(i=0,j=len-1;i<len/2;i++,j--)
      {if(name.charAt(i)!=name.charAt(j))
        {flag=1;
         break;
        

        }

      }
      if(flag==0)
      {System.out.println("Palindrome");

      }
      else{
        System.out.println("Not palindrome");
      }
    }
    
}
