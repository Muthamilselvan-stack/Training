import java.util.*;
public class Bubblesort
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter the number of elements:");
     int n =scan.nextInt();
     int []arr = new int[n];
     System.out.println("Enter the elements:");
     for(int i=0;i<n;i++)
     {
        arr[i]=scan.nextInt();
     }
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            int temp = 0;
            if(arr[i]>arr[j])
            {
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
     }
     System.out.print("Final sorted Array:");
     for(int j=0;j<n;j++)
     {
        System.out.print(arr[j] +" ");
     }
    }
}
