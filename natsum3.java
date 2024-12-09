import java.util.*;
public class natsum3{
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
        for(int i=0;i<n;i+=3)
        {
        System.out.println(arr[i]+" ");
        }
    }
}