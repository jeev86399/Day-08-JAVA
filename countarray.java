import java.util.*;
public class countarray{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=s.nextInt();
        Arrays.sort(arr);
        int max=arr[n-1];
        int c[]=new int[max+1];
        for(int i=0;i<n;i++)
        c[arr[i]]++;
        System.out.println(Arrays.toString(c));
    }
}