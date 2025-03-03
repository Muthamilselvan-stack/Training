public class AddinglongString
{
    public static void main(String t[])
    {
        String a="9999999999";
        String b="44444444";
        StringBuilder scan = new StringBuilder();
        int i = a.length()-1,j=b.length()-1,carry=0;
        
        while(i>=0 || j>=0 || carry>0)
        {
            int d1=(i>=0)? a.charAt(i) - '0' : 0;
            int d2=(j>=0)? b.charAt(j) - '0' : 0;
            
            int sum = d1+d2+carry;
            carry = sum/10;
            scan.append(sum%10);
            i--;
            j--;
            System.out.println(scan);
        }
        System.out.println("Sum Of Strings :"+scan.reverse());
    }
}