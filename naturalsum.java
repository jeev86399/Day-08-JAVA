import java.util.*;
public class naturalsum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int p=0,k=0;
        for(int i=1;i<=n;i++)
        {
            p+=i;
            arr[k]=p;
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }
}