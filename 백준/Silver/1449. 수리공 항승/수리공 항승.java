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

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] leak = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) leak[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(leak);

        int cnt = 0;
        int cover = -1; // 현재 테이프가 커버하는 "마지막 누수 위치(정수)"

        for (int i = 0; i < N; i++) {
            if (leak[i] > cover) {          // 아직 못 덮으면 새 테이프
                cnt++;
                cover = leak[i] + L - 1;    // 여기까지(정수 위치) 커버 가능
            }
        }

        sb.append(cnt);
    }

    void print() {
        System.out.print(sb.toString());
    }
}
