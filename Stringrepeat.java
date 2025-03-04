import java.util.Scanner;
class Stringrepeat
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the Words:");
       String a = scan.nextLine();
       String reversed = "";
       String[] word =a.trim().split(" \\s+");
       for(int i=word.length-1;i>=0;i--)
       {
           reversed+=word[i];
           reversed+= " ";
       }
       System.out.print(reversed);
     }
  }