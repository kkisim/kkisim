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

    void setting() throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S1 = Integer.parseInt(st.nextToken());
        int S2 = Integer.parseInt(st.nextToken());
        int S3 = Integer.parseInt(st.nextToken());

        int maxSum = S1 + S2 + S3;
        int[] cnt = new int[maxSum + 1];

        for (int a = 1; a <= S1; a++) {
            for (int b = 1; b <= S2; b++) {
                for (int c = 1; c <= S3; c++) {
                    cnt[a + b + c]++;
                }
            }
        }

        int bestSum = 3;     // 최소 합
        int bestFreq = 0;
        for (int s = 3; s <= maxSum; s++) {
            if (cnt[s] > bestFreq) {
                bestFreq = cnt[s];
                bestSum = s;
            }
        }
        sb.append(bestSum);
    }

    void print() {
        System.out.println(sb.toString());
    }
}
