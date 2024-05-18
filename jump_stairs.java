public class jump_stairs {
    public static void main(String[] args) {
        int n = 6;
        int[] j = { 2, 3, 0, 2, 2, 3 };
        int x = climb(n, j, 0, 0);
        System.out.println(x);
    }

    static int climb(int n, int[] jump, int c, int idx) {
        if (n == 0) {
            return c + 1;
        }
        if (n < 0 || idx >= jump.length) {
            return c;
        }

        int ways = 0;
        for (int i = idx; i < jump.length; i++) {
            ways += climb(n - jump[i], jump, c, i + 1);
        }

        return ways;
    }
}
