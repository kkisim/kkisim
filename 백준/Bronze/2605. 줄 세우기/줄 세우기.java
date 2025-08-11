import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws Exception {
        int n = Integer.parseInt(br.readLine().trim());
        String[] s = br.readLine().split(" ");

        List<Integer> line = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(s[i]);   
            int pos = line.size() - x;       
            line.add(pos, i + 1);             
        }

        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(line.get(i));
        }
    }

    void print() {
        System.out.println(sb);
    }
}
