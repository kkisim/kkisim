import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br;
    StringBuilder sb;
    StringTokenizer st;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());

        long minVal = Long.MAX_VALUE;
        long best = 0;

        for (int i = 0; i < N; i++) {
            long x = Long.parseLong(st.nextToken());

            if (minVal == Long.MAX_VALUE) {
                // 첫 원소
                minVal = x;
                best = 0;
            } else {
                best = Math.max(best, x - minVal);
                minVal = Math.min(minVal, x);
            }

            if (i > 0) sb.append(' ');
            sb.append(best);
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
