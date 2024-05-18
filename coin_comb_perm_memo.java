public class coin_comb_perm_memo {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int t = 7;

        int dp[] = new int[t + 1];
        int x = solve(t, arr, dp);
        System.out.println(x);
    }

    static int solve(int t, int[] arr, int[] dp) {

        if (t == 0)
            return 1;

        if (t < 0)
            return 0;

        if (dp[t] != 0) {
            return dp[t];
        }

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {

            ans += solve(t - arr[i], arr, dp);

        }
        dp[t] = ans;

        return ans;
    }
}
