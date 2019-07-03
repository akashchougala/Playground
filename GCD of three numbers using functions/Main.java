import java.util.Scanner;
public class Main
{
     public static int gcd(int n1, int n2, int n3)
     {
          int result = 0;
          int temp = 0;
          int b = 0;
          int a = (n1+n2)/2;
          for(int i = a; i >= 1; i--)
          {
               if((n1%i==0)&&(n2%i==0))
               {
                    temp = i;
                    break;
               }
          }
          b = (temp+n3)/2;
          for(int j =b; j >= 1; j--)
          {
               if((temp%j==0) && (n3%j==0))
               {
                    result = j;
                    break;
               }
          }
       return result;
     }
     public static void main(String args[])
     {
          Scanner in = new Scanner(System.in);
          int n1 = in.nextInt();
          int n2 = in.nextInt();
          int n3 = in.nextInt();
          int result = gcd(n1,n2,n3);
          System.out.println(result);
     }
}
       
          