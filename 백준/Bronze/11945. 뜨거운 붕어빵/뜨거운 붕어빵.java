import java.io.*;

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

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        int[][] arr = new int[N][M];

        // 입력 받으면서 좌우 반전해서 저장
        for (int i = 0; i < N; i++) {
            String line = br.readLine(); // 공백 없이 "0101..." 형태로 들어옴
            for (int j = 0; j < M; j++) {
                arr[i][M - 1 - j] = line.charAt(j) - '0';
            }
        }

        // 출력 만들기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
    }

    void print() {
        System.out.print(sb);
    }
}
