
import java.io.*;
import java.util.*;

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
    	int x = Integer.parseInt(br.readLine());
    	int remain = x%21;
    	
    	sb.append(remain);
      
    }

    

    void print() {
        System.out.print(sb);
    }
}
