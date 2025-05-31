import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int N;
    int[] S;

    void setting() throws IOException {
        N = Integer.parseInt(br.readLine());
        S = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(getMaxLen()).append("\n");
    }

    int getMaxLen() {
        int[] count = new int[10]; 
        int left = 0;
        int kind = 0;
        int maxLen = 0;

        for (int right = 0; right < N; right++) {
            if (count[S[right]] == 0) kind++;
            count[S[right]]++;

            while (kind > 2) {
                count[S[left]]--;
                if (count[S[left]] == 0) kind--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    void print() {
        System.out.print(sb);
    }
}
