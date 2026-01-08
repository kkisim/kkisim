import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br;
    StringBuilder sb;

    int N;
    int[] T, P;
    int[] dp;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        
        String s [] = br.readLine().split(",");
        
        sb.append(s.length);
    }

    void print() {
        System.out.print(sb.toString());
    }
}
