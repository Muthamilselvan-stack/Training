import java.util.*;
public class Bubblesort1{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i=0;i<n-1;i++) 
        {
            for(int j=0;j<n-i-1;j++)
            { 
                if(arr[j]>arr[j+1]) 
                { 
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.print("Final sorted Array: ");
        for(int j=0;j<n;j++) { 
            System.out.print(arr[j] + " "); 
        }
    }
}
