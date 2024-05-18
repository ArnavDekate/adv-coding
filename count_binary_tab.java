public class count_binary_tab {
    public static void main(String[] args) {
        int n = 4;

        int dp[][] = new int[2][n];

        dp[0][0] = 1;
        dp[1][0] = 1;

        System.out.println(dp.length);

        for (int j = 1; j < dp[0].length; j++) {
            for (int i = 0; i < dp.length; i++) {
                if (i == 0) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                }
            }
        }

        for (int j = 0; j < dp[0].length; j++) {
            for (int i = 0; i < dp.length; i++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(dp[0][n - 1] + dp[1][n - 1]);
    }
}
