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

    int N;
    int[] T, P;
    int[] dp;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine().trim());
        T = new int[N + 2]; // 1~N 사용, N+1은 경계
        P = new int[N + 2];
        dp = new int[N + 3]; // dp[i+T] 접근 여유

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        // dp[N+1] = 0 (퇴사날 이후 수익은 0)
        for (int i = N; i >= 1; i--) {
            int nextDay = i + T[i];

            // 1) 상담 안 함
            dp[i] = dp[i + 1];

            // 2) 상담 함 (가능할 때만)
            if (nextDay <= N + 1) {
                dp[i] = Math.max(dp[i], P[i] + dp[nextDay]);
            }
        }

        sb.append(dp[1]);
    }

    void print() {
        System.out.print(sb.toString());
    }
}
