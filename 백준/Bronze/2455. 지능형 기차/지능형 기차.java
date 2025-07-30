import java.io.*;

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
        int now = 0;
        int max = 0;

        for (int i = 0; i < 4; i++) {
            String[] s = br.readLine().split(" ");
            int out = Integer.parseInt(s[0]);
            int in = Integer.parseInt(s[1]);

            now -= out;
            now += in;

            if (now > max) {
                max = now;
            }
        }

        sb.append(max);
    }

    void print() {
        System.out.println(sb);
    }
}
