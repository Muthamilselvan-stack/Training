import java.util.Arrays;
public class occurance {
    public static void main(String[] args) {
        int[] a = {3, 2, 3, 1, 2, 9}; int count;
        for(int i=0;i<a.length;i++)
        {
            count = 1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {    a[j] = -1;
                    count += 1;
                }
            }
            if(a[i]!=-1)
                System.out.println(a[i] + " " + count  );
        }
    }
}
   