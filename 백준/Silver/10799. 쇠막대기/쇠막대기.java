import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

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

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String s = br.readLine();
        ArrayDeque<Character> st = new ArrayDeque<>();

        long ans = 0; // 최대 길이 100,000이라 int도 되지만 안전하게 long

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(ch);
            } else { // ')'
                st.pop(); // 일단 '(' 하나를 닫는다 (레이저든 막대끝이든)
                if (i > 0 && s.charAt(i - 1) == '(') {
                    // 레이저 "()"
                    ans += st.size();
                } else {
                    // 막대 끝
                    ans += 1;
                }
            }
        }

        sb.append(ans);
    }

    void print() {
        System.out.print(sb);
    }
}
