import java.util.HashSet;

public class random {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4 };
        int ar[] = { 1, 1, 1, 1 };

        System.out.println(solve(arr));
        System.out.println(solve(ar));
    }

    public static int solve(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int subarrayCount = 0;

        for (int num : arr) {
            if (set.contains(num)) {
                subarrayCount++;
                set.clear();
            }
            set.add(num);
        }

        if (!set.isEmpty()) {
            subarrayCount++;
        }

        return subarrayCount;
    }
}
