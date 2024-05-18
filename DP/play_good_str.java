import java.util.Scanner;

public class play_good_str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int max = 0;
        int c = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                c++;
                max = Math.max(max, c);

            } else {
                c = 0;
            }

        }

        System.out.println(max);

        s.close();

    }
}
