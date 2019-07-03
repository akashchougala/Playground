import java.util.Scanner;
class Main 
{
	public static void main (String[] args)
    {
	      // Type your code here
          Scanner in = new Scanner(System.in);
          int num = in.nextInt();
          int result = 0;
          while(num > 10)
          {
               result = result + (num % 10);
               num = num / 10;
          }
         
          int final_result = num + result;
          System.out.println(final_result);
	}
}