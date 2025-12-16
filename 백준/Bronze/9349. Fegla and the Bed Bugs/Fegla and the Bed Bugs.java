import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    void setting() throws Exception {
        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int minCellDist = (N - 1) / (K - 1);   // 버그-버그 사이 최소 "칸 거리" 최댓값
            int answer = minCellDist - 1;          // 빈 칸 수로 변환

            if (answer < 0) answer = 0;

            sb.append(answer);
            if (tc + 1 < T) sb.append('\n');
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
