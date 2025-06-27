
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

    void setting() throws IOException {
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int sum = 0;

            for (int j = 1; j <= n; j++) { 
                sum += Integer.parseInt(s[j]);
            }

            float avg = (float) sum / n;
            int count = 0;

            for (int j = 1; j <= n; j++) { 
                if (Integer.parseInt(s[j]) > avg) {
                    count++;
                }
            }

            float ratio = (float) count / n * 100;
            sb.append(String.format("%.3f", ratio)).append("%\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
