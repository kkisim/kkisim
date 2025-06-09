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
    int N;
    int[] A;
    int[] P;

    void setting() throws IOException {
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        P = new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(input[i]);
        }

        // (값, 원래 인덱스) 쌍 저장
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(new int[]{A[i], i});
        }

        // 값 기준 정렬, 값이 같으면 인덱스 오름차순
        list.sort((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            else return Integer.compare(a[1], b[1]);
        });

        for (int i = 0; i < N; i++) {
            int originalIndex = list.get(i)[1];
            P[originalIndex] = i;
        }

        for (int i = 0; i < N; i++) {
            sb.append(P[i]).append(" ");
        }
    }

    void print() {
        System.out.println(sb);
    }
}
