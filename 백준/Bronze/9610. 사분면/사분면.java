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

    	int num = Integer.parseInt(br.readLine());
    	int Q[] = new int[5];
    	for(int i = 0; i < num ; i++) {
    		String s [] = br.readLine().split(" ");
    		int x = Integer.parseInt(s[0]);
    		int y = Integer.parseInt(s[1]);
    		if(x > 0 && y >0) {
    			Q[0]++;
    		}else if(x <0 && y>0) {
    			Q[1]++;
    		}else if(x <0 && y<0) {
    			Q[2]++;
    		}else if(x >0 && y <0 ) {
    			Q[3]++;
    		}else {
    			Q[4]++;
    		}
    	}
    	for(int i = 0 ; i < 5; i++) {
    		if( i < 4) {
    		sb.append("Q").append(i+1).append(": ").append(Q[i]).append("\n");}
    		else {
    			sb.append("AXIS: ").append(Q[i]);
    		}
    	}
    }

    

    void print() {
        System.out.print(sb);
    }
}
