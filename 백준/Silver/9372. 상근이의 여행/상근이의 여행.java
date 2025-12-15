
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
        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 국가 수
            int M = Integer.parseInt(st.nextToken()); // 비행기(간선) 수

            // 간선 정보는 문제 풀이상 필요 없지만 입력은 읽어야 함
            for (int i = 0; i < M; i++) {
                br.readLine();
            }

            sb.append(N - 1).append('\n');
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
