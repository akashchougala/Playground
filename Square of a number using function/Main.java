import java.util.Scanner;
class Main
{
	public static int square(int n)
    {
        int square_val = n * n;
        return square_val;
    }
  
    public static void main (String[] args)
    {
	    // Type your code here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int square_value = square(num);
      System.out.println(square_value);
	} 
}