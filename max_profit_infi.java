import java.util.Scanner;

public class max_profit_infi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements in array : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter of elements in array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int profit = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                profit += arr[i + 1] - arr[i];
            }
            System.out.println(profit);
        }

        System.out.println(profit);

        s.close();
    }
}
