/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"
*/

class Solution {
   public String reverseVowels(String s) {
   int n=s.length();
   int start=0;
   int end=n-1;
   char [] words=s.toCharArray();
   String vowels="AEIOUaeiou";
   while(start<end)
   {    while(start<end&& vowels.indexOf(words[start])==-1)
       {start++;

       }
       while(start<end && vowels.indexOf(words[end])==-1)
       {
        end--;
       }
       char temp=words[start];
       words[start]=words[end];
       words[end]=temp;
       start++;
       end--;
   }
   return new String(words);
   
   
   
    }
   
    }
