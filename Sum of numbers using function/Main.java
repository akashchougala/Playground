import java.util.Scanner;
class Main
{
     public static int sum_num(int n)
     {
          int sum = 0;
          for(int i = 1; i <= n; i++)
          {
               sum= sum + i;
          }
          return sum;
     }
	
  
  
  
    public static void main (String[] args)
    {
	     // Type your code here
         Scanner in = new Scanner(System.in);
         int num = in.nextInt();
         int sum = sum_num(num);
         System.out.println(sum);
	}
}