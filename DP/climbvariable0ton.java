public class climbvariable0ton {

    public static void main(String[] args) {
        int n = 6;
        int[] j = { 2, 3, 0, 2, 2, 3 };
        int x = climb(n, 0, j);
        System.out.println(x);

    }

    static int climb(int n, int curr, int[] jump) {

        if (curr == n) {
            return 1;
        }

        if (curr > n) {
            return 0;
        }

        int val = jump[curr];
        int c = 0;

        for (int i = 1; i <= val; i++) {
            c += climb(n, curr + i, jump);
        }

        return c;

    }

}
