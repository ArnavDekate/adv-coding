public class dp_2d {
    public static void main(String[] args) {
        int[][] map = { { 1, 2, 2, 10, 20 }, { 20, 3, 0, 1, 3 }, { 4, 30, 2, 0, 1 }, { 1, 0, 3, 2, 5 } };
        int[][] dp = new int[4][5];

        System.out.println(map.length);

        System.out.println(map[0].length);

        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {

                if (j == dp[0].length - 1 && i == dp.length - 1)
                    dp[i][j] = map[i][j];

                else if (j == dp[0].length - 1)
                    dp[i][j] = dp[i + 1][j] + map[i][j];

                else if (i == dp.length - 1)
                    dp[i][j] = dp[i][j + 1] + map[i][j];

                else
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + map[i][j];

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
