/*
gum and mug
python typhon
These are anagrams */

import java.util.Arrays;
import java.util.Scanner;
class anagram{
    public static void main(String[] args) {
        Scanner b1=new Scanner(System.in);
        String s1=b1.next();
        String s2=b1.next();
      //1.check their lengths if they are not same length then it is not anagram.
        if(s1.length()!=s2.length())
        {System.out.println("Not Anagram");
         System.exit(0);

        }
          //if they are same length then do 1.convert to lower cases 2.convert to char arrays 3.sort the arrays 4.if they have same 
          //characters then they are anagram
          
        else{
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char s3[]=s1.toCharArray();
        char s4[]=s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        if(Arrays.equals(s3,s4))
         {System.out.print("Anagram");


         }
        else
        {System.out.print("Not Anagram");

        }

 

        }

    }
}
