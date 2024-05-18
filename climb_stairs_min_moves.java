public class climb_stairs_min_moves {
    public static void main(String[] args) {
        int n = 10;
        int[] jump = { 3, 2, 4, 2, 0, 2, 3, 1, 2, 2 };

        int dp[] = new int[n + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            int val = jump[i];
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= val && i + j <= n; j++) {
                if (dp[i + j] < min) {
                    min = dp[i + j];
                }

            }
            if (min != Integer.MAX_VALUE)
                dp[i] = min + 1;

        }

        for (int i = 0; i <= n; i++) {
            System.out.println(dp[i]);
        }
    }
}
