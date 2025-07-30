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
        String s = br.readLine();
        int zeroGroup = 0;
        int oneGroup = 0;

        char prev = s.charAt(0);
        if (prev == '0') zeroGroup++;
        else oneGroup++;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != prev) {
                if (s.charAt(i) == '0') zeroGroup++;
                else oneGroup++;
                prev = s.charAt(i);
            }
        }

        sb.append(Math.min(zeroGroup, oneGroup));
    }

    void print() {
        System.out.println(sb);
    }
}
