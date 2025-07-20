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
        int n = Integer.parseInt(br.readLine());
        int cute = 0;
        int notCute = 0;

        for (int i = 0; i < n; i++) {
            int vote = Integer.parseInt(br.readLine());
            if (vote == 1) {
                cute++;
            } else {
                notCute++;
            }
        }

        if (cute > notCute) {
            sb.append("Junhee is cute!");
        } else {
            sb.append("Junhee is not cute!");
        }
    }

    void print() {
        System.out.println(sb);
    }
}
