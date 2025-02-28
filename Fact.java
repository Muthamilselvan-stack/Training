import java.util.Scanner;
class Fact{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the number:");
       int n =scan.nextInt();
       int a= n;
       int s=0;
       while(n>0)
       {
        int d=n%10;
        int f=1;
        for(int i =1;i<=d;i++) 
        {
            f*=i;
        }  
        s+=f;
        n/=10;
    }
    if(s==a)
    {
        System.out.println("factorial is strong number");
    }
    else{
        System.out.println("factorial is not strong number");
    }
 }
}