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
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(" ");
            int N = Integer.parseInt(s[0]);
            int S = Integer.parseInt(s[1]);
            int result = S / (N + 1);
            sb.append(result).append('\n');
        }
    }

    void print() {
        System.out.print(sb);
    }
}
