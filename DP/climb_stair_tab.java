public class climb_stair_tab {
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
    }
}
