public class count_binary_str {
    public static void main(String[] args) {
        int n = 4;
        int[][] dp = new int[2][n + 1];
        int x = solve(n, dp);
        System.out.println(x);

    }

    static int solve(int n, int[][] dp) {
        int ans = 0;
        ans += helper(n - 1, 0, dp);

        ans += helper(n - 1, 1, dp);

        return ans;
    }

    static int helper(int n, int prev, int dp[][]) {

        int ans = 0;

        if (n == 0) {
            return 1;
        }
        if (dp[prev][n] != 0) {
            return dp[prev][n];
        }

        if (prev == 0) {
            ans += helper(n - 1, 1, dp);

        }

        else {
            ans += helper(n - 1, 0, dp);
            ans += helper(n - 1, 1, dp);
        }

        dp[prev][n] = ans;

        return ans;

    }

}
