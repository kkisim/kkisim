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
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (isHansu(i)) {
                count++;
            }
        }
        sb.append(count);
    }

    boolean isHansu(int num) {
        if (num < 100) return true; 
        int a = num / 100;          
        int b = (num / 10) % 10;    
        int c = num % 10;            
        return (a - b) == (b - c);   
    }

    void print() {
        System.out.print(sb);
    }
}
