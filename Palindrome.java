public class Palindrome
{
    public static void checkPalindromeUsingString(String str)
    {
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed)) 
        {
            System.out.println(str + " is a palindrome");
        } 
        else 
        {
            System.out.println(str + " is NOT a palindrome");
        }
    }
    public static void checkPalindromeUsingStringBuilder(String str) 
    {
        StringBuilder sb = new StringBuilder(str);
        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) 
        {
            System.out.println(str + " is a palindrome");
        } 
        else
        {
            System.out.println(str + " is NOT a palindrome");
        }
    }
    
    public static void checkPalindromeUsingStringBuffer(String str) 
    {
        StringBuffer sb = new StringBuffer(str);
        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) 
        {
            System.out.println(str + " is a palindrome");
        } else 
        {
            System.out.println(str + " is NOT a palindrome");
        }
    }
    public static void checkPalindromeWithoutBuiltin(String str) 
    {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                System.out.println(str + " is NOT a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str + " is a palindrome");
    }
    public static void main(String[] args) 
    {
        String testString = "Madam";  
        System.out.println("Checking palindrome for: " + testString);
        checkPalindromeUsingString(testString);
        checkPalindromeUsingStringBuilder(testString);
        checkPalindromeUsingStringBuffer(testString);
        checkPalindromeWithoutBuiltin(testString);
    }
}
