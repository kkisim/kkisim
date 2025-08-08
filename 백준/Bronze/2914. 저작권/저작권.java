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
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]); 
        int I = Integer.parseInt(s[1]); 

        int result = (I - 1) * A + 1;
        sb.append(result);
    }

    void print() {
        System.out.println(sb);
    }
}
