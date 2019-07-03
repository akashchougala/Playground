import java.util.Scanner;
class Main
{
     public static int greatest_of_two_num(int n1, int n2, int n3)
     {
          int result = 0;
          int temp = 0;
          if(n1 > n2)
          {
               temp = n1;
          }
          else
          {
               temp = n2;
          }
       
          if(temp > n3)
          {
              result = temp;
          }
          else
          {
               result = n3;
          }
          return result;
     }
  
     public static void main (String[] args)
     {
	      // Type your code here
          Scanner in = new Scanner(System.in);
          int n1 = in.nextInt();
          int n2 = in.nextInt();
          int n3 = in.nextInt();
          int result = greatest_of_two_num(n1,n2,n3);
          System.out.println(result);
     }
          
}
