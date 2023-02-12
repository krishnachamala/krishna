import java.util.Scanner;

public class sum1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, x[], y[], c = 0;
        n = sc.nextInt();
        x = new int[n];
        for (i = 0; i < n; i++)
            x[i] = sc.nextInt();
        int a = 0;
        a = x[n - 1];
        y = new int[a];
        for (i = 0; i < a; i++) {
            y[i] = i + 1;

        }
        for (i = 0; i < a; i++) {
            for (j = 0; j < n; j++) {
                if (x[j] == y[i])
                    c++;
            }
            if (c == 0)
                System.out.println(y[i]);
            c = 0;

        }

    }
}