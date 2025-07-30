import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws IOException {
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        long[] x = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = Long.parseLong(s[i]);
        }

        Arrays.sort(x);

        long total = 0;
        long prefixSum = 0;

        for (int i = 0; i < n; i++) {
            total += x[i] * i - prefixSum;
            prefixSum += x[i];
        }

        total *= 2; 

        sb.append(total);
    }

    void print() {
        System.out.println(sb);
    }
}
