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
        int[] c = new int[26];

        for (int i = 0; i < num; i++) {
            String s = br.readLine();
            char firstChar = s.charAt(0);
            c[firstChar - 'a']++;
        }

        boolean found = false;

        for (int i = 0; i < 26; i++) {
            if (c[i] >= 5) {
                sb.append((char) (i + 'a'));
                found = true;
            }
        }

        if (!found) {
            sb.append("PREDAJA");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
