import java.util.*;

public class DutyRosterRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++)
            names[i] = sc.next();

        int k = sc.nextInt() % n;
        String[] result = new String[n];

        for (int i = 0; i < n; i++)
            result[(i + k) % n] = names[i];

        System.out.println(Arrays.toString(result));
    }
}
