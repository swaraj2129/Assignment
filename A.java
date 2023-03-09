package sol;

import static java.lang.Math.max;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A {

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = readInt();
        for (int i = 0; i < n; i++) {
            int x = readInt();
            if (x < a[i]) {
                b[i] = a[i];
                a[i] = x;
            } else
                b[i] = x;
        }
        long max = Integer.MIN_VALUE;
        long min = Long.MIN_VALUE;
        for (int i = 0; i < n; i++)
            max = max(a[i], max);
        for (int j = 0; j < n; j++)
            min = max(min, b[j]);
        out.println(min * max);
        out.close();
    }

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

    public static long readLong() throws IOException {
        return Long.parseLong(read());
    }
}