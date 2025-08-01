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
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");

        int A = Integer.parseInt(first[0]);
        int B = Integer.parseInt(first[1]);
        int C = Integer.parseInt(second[0]);
        int D = Integer.parseInt(second[1]);

        int move1 = B + C; 
        int move2 = A + D; 

        sb.append(Math.min(move1, move2)).append("\n");
    }

    void print() {
        System.out.println(sb);
    }
}
