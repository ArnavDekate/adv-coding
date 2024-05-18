public class coin_comb_dp {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int target = 10;

        int dp[] = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= target; j++) {
                if (arr[i] <= j) {
                    dp[j] += dp[j - arr[i]];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i] + " ");

        }

        System.out.println(dp[target]);

        // int dp[][] = new int[arr.length + 1][target + 1];

        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // if (j == 0) {
        // dp[i][j] = 1;
        // } else if (i == 0) {
        // dp[i][j] = 0;
        // } else {
        // if (arr[i - 1] <= j) {
        // dp[i][j] = dp[i - 1][j] + dp[i][j - arr[i - 1]];
        // } else {
        // dp[i][j] = dp[i - 1][j];
        // }

        // }

        // }
        // }

        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // System.err.print(dp[i][j] + " ");

        // }
        // System.out.println();
        // }

    }
}
