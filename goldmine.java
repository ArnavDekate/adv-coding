public class goldmine {
    public static void main(String[] args) {
        int[][] map = { { 1, 2, 3, 0, 2 }, { 2, 1, 2, 7, 6 }, { 5, 2, 8, 3, 1 }, { 4, 3, 2, 0, 0 }, { 8, 0, 1, 1, 0 } };
        int[][] dp = new int[map.length][map[0].length];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }

        for (int j = dp[0].length - 1; j >= 0; j--) {

            for (int i = dp.length - 1; i >= 0; i--) {
                // case1
                if (j == dp[0].length - 1) {
                    dp[i][j] = map[i][j];
                }

                // case 2
                else if (i == 0) {
                    dp[i][j] = map[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                }

                // case 3
                else if (i == dp.length - 1) {
                    dp[i][j] = map[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                }

                // case 4
                else {
                    dp[i][j] = map[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));

                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();

        }

    }
}
