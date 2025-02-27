import java.util.Scanner;
public class lcm {
    public static void main(String[] args)
    {
        System.out.print("Enter the Number: ");
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        System.out.print("Enter the divided number:");
        int b=in.nextInt();
        if(b!=2)
        {
            if(b!=8)
            {
                if(b!=16)
                {
                    System.out.println("Invalid");
                }
            }

        }
        else{
        String string=" ";
        while(a>0)
        {
            int d=a%2;
            string=d+string;
            a/=2;

        }
        System.out.println("The value is:"+" "+string);
        }
    }
}
