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
        String line;
        while ((line = br.readLine()) != null) {
            String s = line.trim();
            if (s.equals("0")) break;

            int width = 2;                
            width += s.length() - 1;      

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '1') width += 2;
                else if (c == '0') width += 4;
                else width += 3;           
            }
            sb.append(width).append('\n');
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
