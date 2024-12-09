import java.util.*;
public class rev2d{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }
    System.out.println("Before reverse");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }System.out.println("After reverse");
    for(int i=0;i<r;i++)
    {
      for(int j=(c-1);j>=0;j--)
      {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}