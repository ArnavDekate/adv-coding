import java.util.Scanner;

public class max_profit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements in array : ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter of elements in array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println(max - min);

        s.close();

    }
}
