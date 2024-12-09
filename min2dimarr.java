import java.util.*;
public class min2dimarr{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int min=arr[0][0];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                    if (arr[i][j]<min)
                    min=arr[i][j];
            }
        }
        System.out.println("Min element:"+min);
    }
} 