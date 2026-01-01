import java.io.BufferedReader;
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

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());

        int[] cnt = {
                11, // 1
                9,  // 2
                9,  // 3
                9,  // 4
                8,  // 5
                8,  // 6
                8,  // 7
                8,  // 8
                8,  // 9
                8   // 10
        };

        String[] solved = {
                "A B C D E F G H J L M", // 1
                "A C E F G H I L M",     // 2
                "A C E F G H I L M",     // 3
                "A B C E F G H L M",     // 4
                "A C E F G H L M",       // 5
                "A C E F G H L M",       // 6
                "A C E F G H L M",       // 7
                "A C E F G H L M",       // 8
                "A C E F G H L M",       // 9
                "A B C F G H L M"        // 10
        };

        sb.append(cnt[N - 1]).append('\n');
        sb.append(solved[N - 1]).append('\n');
    }

    void print() {
        System.out.print(sb.toString());
    }
}
