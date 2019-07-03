import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
		  // Type your code here
          Scanner in = new Scanner(System.in);
          int n1 = in.nextInt();
          int third_digit = n1 % 10;
          int first_digit = (n1/10)/10;
          int sum = first_digit + third_digit;
          System.out.println(sum);
          
	}
}