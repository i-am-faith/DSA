import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static boolean isPalindrome(String word)
    {
        int left = 0;
        int right = word.length()-1;
        while(left < right)
        {
            if(word.charAt(left) != word.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int countNumberOfPalindromeWords(String s) 
	{
        if(s.length() == 0)
        {
            return 0;
        }
        int count = 0;
        String[] wordsArray = s.toLowerCase().trim().split("\\s+");
        for(String word : wordsArray)
        {
            if(isPalindrome(word))
            {
                count++;
            }
        }
        return count;
    }
}