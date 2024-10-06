public class Solution {
    public static boolean isSpecialCharacter(char ch) {
        return (ch >= 33 && ch <= 47) || 
               (ch >= 58 && ch <= 64) || 
               (ch >= 91 && ch <= 96) || 
               (ch >= 123 && ch <= 126);
    }

	public static boolean isValid(String str) {
		if(str.length() < 8 || str.length() > 15)
        {
            return false;
        }

        boolean hasdigit = false;
        boolean haslower = false;
        boolean hasupper = false;
        boolean hasspecial = false;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                hasdigit = true;
            }
            else if(Character.isLowerCase(ch))
            {
                haslower = true;
            }
            else if(Character.isUpperCase(ch))
            {
                hasupper = true;
            }
            else if(isSpecialCharacter(ch))
            {
                hasspecial = true;
            }
            else if(Character.isWhitespace(ch))
            {
                return false;
            }
        }
        return hasdigit && haslower && hasupper && hasspecial;
	}
}

