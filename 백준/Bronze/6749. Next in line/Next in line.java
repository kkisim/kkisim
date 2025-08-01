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

    int Y, M;

    void setting() throws IOException {
        Y = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        int O = 2 * M - Y;
        sb.append(O).append("\n");
    }

    void print() {
        System.out.println(sb);
    }
}
