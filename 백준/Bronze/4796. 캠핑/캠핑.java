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
        int caseNum = 1;
        while (true) {
            String[] s = br.readLine().split(" ");
            int L = Integer.parseInt(s[0]);
            int P = Integer.parseInt(s[1]);
            int V = Integer.parseInt(s[2]);
            
            if (L == 0 && P == 0 && V == 0) break;
            
            int result = (V / P) * L + Math.min(V % P, L);
            sb.append("Case ").append(caseNum++).append(": ").append(result).append("\n");
        }
    }
    
    void print() {
        System.out.println(sb);
    }
}
