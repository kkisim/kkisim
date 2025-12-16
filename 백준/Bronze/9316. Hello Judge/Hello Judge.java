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

        int T = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < T; t++) {
        	sb.append("Hello World, Judge ").append(t+1).append("!").append("\n");
            
        
        }
    }

    void print() {
        System.out.print(sb);
    }
}


