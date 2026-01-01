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

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        long a = Long.parseLong(br.readLine().trim());

        double ans = 4.0 * Math.sqrt((double)a);

        // 소수 출력은 넉넉히 (절대/상대오차 1e-6 만족)
        sb.append(String.format(java.util.Locale.US, "%.10f", ans));
    }

    void print() {
        System.out.print(sb.toString());
    }
}
