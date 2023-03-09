package sol;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class E {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    static StringTokenizer st = new StringTokenizer("");

    static String read() throws IOException {
        while (!st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public static int readInt() throws IOException {
        return Integer.parseInt(read());
    }

    public static void main(String[] args) throws IOException {
        int intToTest = readInt();
        if (isPerfect(intToTest))
            System.out.println(intToTest + " is a perfect number");
        else {
            System.out.println(intToTest + " is not a perfect number");
        }
    }

    static boolean isPerfect(int n) {

        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    sum = sum + i + n / i;
                else
                    sum = sum + i;
            }
        }
        if (sum == n && n != 1)
            return true;

        return false;
    }
}
