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
    int n;

    void setting() throws IOException {
        n = Integer.parseInt(br.readLine());
        

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                sb.append(" ");
            }
            for (int j = 0; j < (2 * n - 1) - (2 * i); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        

        for (int i = n - 2; i >= 0; i--) {
            for (int k = 0; k < i; k++) {
                sb.append(" ");
            }
            for (int j = 0; j < (2 * n - 1) - (2 * i); j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
