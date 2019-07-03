import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
        int largest = 0;
        if(arr[0] > arr[1])
        {
            largest = arr[0];
        }
        else
        {
             largest = arr[1];
        }
        for(int idx = 2; idx< arr_size; idx++)
        {
             if(largest > arr[idx])
             {
                  largest = largest;
             }
             else 
             {
                  largest = arr[idx];
             }
        }
      System.out.println(largest);
    }
}