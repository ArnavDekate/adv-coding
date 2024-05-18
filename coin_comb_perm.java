public class coin_comb_perm {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };
        int t = 7;
        int[] dp = new int[t + 1];

        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j])
                    dp[i] += dp[i - arr[j]];
            }

        }

        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }

    }

}
