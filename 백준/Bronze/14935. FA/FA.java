import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        new C().solve();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> visited = new HashSet<>();

    void solve() throws IOException {
        String x = br.readLine();

        while (true) {
            if (visited.contains(x)) {
                System.out.println("FA");
                return;
            }
            visited.add(x);
            x = F(x);
        }
    }

    String F(String s) {
        char firstDigitChar = s.charAt(0);
        int firstDigit = firstDigitChar - '0';
        int length = s.length();
        int result = firstDigit * length;
        return String.valueOf(result);
    }
}
