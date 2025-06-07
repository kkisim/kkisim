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
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int r1 = Integer.parseInt(input[2]);
            int x2 = Integer.parseInt(input[3]);
            int y2 = Integer.parseInt(input[4]);
            int r2 = Integer.parseInt(input[5]);

            int dx = x2 - x1;
            int dy = y2 - y1;
            int distSq = dx * dx + dy * dy;
            int rsum = r1 + r2;
            int rdiff = Math.abs(r1 - r2);

            if (distSq == 0 && r1 == r2) {
                sb.append(-1).append("\n"); // 무한대
            } else if (distSq == rsum * rsum || distSq == rdiff * rdiff) {
                sb.append(1).append("\n"); // 접함
            } else if (rdiff * rdiff < distSq && distSq < rsum * rsum) {
                sb.append(2).append("\n"); // 두 점에서 만남
            } else {
                sb.append(0).append("\n"); // 만나지 않음
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
