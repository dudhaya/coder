import java.util.Scanner;
 public class Sort
{
    public static void main(String[] args)
    {
        int n,i,j,temp;
      Scanner Sc=new Scanner(System.in);
      n=Sc.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
          a[i]=Sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
          for(j=i+1;j<n;j++)
          {
              if(a[i]>a[j])
              {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          }
      }
              for(i=0;i<n;i++)
              {
                  System.out.println(a[i]);
              }
    }
}
