public class target_sum_subset {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 7, 1, 3 };
        int target = 10;

        System.out.println(solve(arr, target, 0, 0));
    }

    static boolean solve(int[] arr, int target, int sum, int idx) {

        if (sum == target) {
            return true;
        }

        boolean x = false;

        if (idx < arr.length) {
            x = solve(arr, target, sum + arr[idx], idx + 1) || solve(arr, target, sum, idx + 1);

        }

        return x;

    }
}
