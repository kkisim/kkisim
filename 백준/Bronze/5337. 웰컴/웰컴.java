

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
        sb.append(".  .   .\n");
        sb.append("|  | _ | _. _ ._ _  _\n");
        sb.append("|/\\|(/.|(_.(_)[ | )(/.");
    }

    void print() {
        System.out.println(sb);
    }
}
