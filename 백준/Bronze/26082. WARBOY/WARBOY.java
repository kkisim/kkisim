import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


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

    void setting() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String[] T = br.readLine().split(" ");
        int a = Integer.parseInt(T[0]);
        int b = Integer.parseInt(T[1]);
        int c = Integer.parseInt(T[2]);
        
        int ab = b/a;
        
        int result = ab*c*3;
        sb.append(result);

        
    }

    void print() {
        System.out.print(sb);
    }
}


