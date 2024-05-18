class fibo_mem {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        fib(n, dp);
        for (int j = 0; j <= n; j++) {
            System.out.println(dp[j]);
        }
    }

    static int fib(int n, int[] dp) {

        if (dp[n] != 0) {
            return dp[n];
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

    }
}