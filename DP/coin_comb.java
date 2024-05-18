public class coin_comb {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int t = 7;
        solve(arr, t, 0, 0);
    }

    public static int solve(int[] arr, int t, int idx, int c) {

        if (t == 0) {
            c++;
            return 1;
        }

        if (t < 0) {
            return 0;
        }

        for (int i = idx; i < arr.length; i++) {
            solve(arr, t - arr[i], i, c);
        }

        return c;
    }

}
