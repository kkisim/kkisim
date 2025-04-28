
import java.util.*;
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
    int n, m;
    int[] arr;
    boolean[] visited;
    
    void setting() throws IOException {
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new int[m];
        visited = new boolean[n + 1];
        dfs(1, 0);
    }
    
    void dfs(int start, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        
        for (int i = start; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }

    void print() {
        System.out.print(sb);
    }
}
