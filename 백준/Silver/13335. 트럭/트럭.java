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
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int L = Integer.parseInt(s[2]);

        String[] t = br.readLine().split(" ");
        Queue<Integer> bridge = new LinkedList<>();
        Queue<Integer> trucks = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            trucks.add(Integer.parseInt(t[i]));
        }

        int time = 0;
        int weightSum = 0;

        // 다리 큐는 항상 w길이를 유지해야 한다
        for (int i = 0; i < w; i++) {
            bridge.offer(0); // 초기엔 빈 다리
        }

        while (!bridge.isEmpty()) {
            time++;
            weightSum -= bridge.poll(); // 한 칸 이동 (맨 앞 트럭 내림)

            if (!trucks.isEmpty()) {
                int nextTruck = trucks.peek();
                if (weightSum + nextTruck <= L) {
                    bridge.offer(nextTruck);
                    weightSum += nextTruck;
                    trucks.poll();
                } else {
                    bridge.offer(0); // 무게 초과면 다음 트럭 못 올라옴
                }
            }
        }

        sb.append(time).append("\n");
    }

    void print() {
        System.out.println(sb);
    }
}
