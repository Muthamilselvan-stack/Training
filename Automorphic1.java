import java.util.Scanner;
public class Automorphic1 {
    public static void main(String[] args)
    {
       System.out.println("Automorphic range between 1 to 1000:");
       for(int num=1;num<=1000;num++)
       {
         int s=num*num;
         int temp=num;
       while(temp>0)
       {
        if(s%10!=temp%10)
        {
            break;
        }
        s/=10;
        temp/=10;
       }
       if(temp==0)
       {
        System.out.println(num+" ");
       }
    }
 }
}
