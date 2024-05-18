public class climbvariable_tab {
    public static void main(String[] args) {
        int n = 6;
        int[] j = { 2, 3, 0, 2, 2, 3 };

        int[] dp = new int[n + 1];
        dp[n] = 1;

        for (int i = n - 1; i >= 0; i--) {
            int val = j[i];
            for (int k = 1; k <= val && i + k <= n; k++) {

                dp[i] += dp[i + k];

            }
        }
        System.out.println(dp[0]);
    }
}
