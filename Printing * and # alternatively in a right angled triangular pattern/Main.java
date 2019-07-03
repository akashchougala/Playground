import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n = in.nextInt();
      int turn = 0;
      for(int row_num = 1; row_num <= n; row_num++)
      {
           for(int col_num = 1; col_num <= row_num; col_num++)
           {
                if(turn == 0)
                {
                     System.out.print("*");
                     turn = 1;
                }
                else
                {
                      System.out.print("#");
                      turn = 0;
                }
           }
        System.out.println("");
      }
    }
}