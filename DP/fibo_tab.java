public class fibo_tab {
    public static void main(String[] args) {
        int n = 7;
        int[] dp = new int[7 + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];
        }

        for (int j = 0; j <= n; j++) {
            System.out.println(dp[j]);
        }

    }
}
