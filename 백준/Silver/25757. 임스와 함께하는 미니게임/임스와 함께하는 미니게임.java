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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine().trim());
        }

        int need; // 임스 제외, 한 판에 필요한 추가 인원
        if (game == 'Y') need = 1;
        else if (game == 'F') need = 2;
        else need = 3; // 'O'

        int U = set.size();
        sb.append(U / need);
    }

    void print() {
        System.out.print(sb.toString());
    }
}
