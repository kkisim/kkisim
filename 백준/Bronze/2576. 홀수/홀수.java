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
    	int sum = 0; 
    	int min = Integer.MAX_VALUE;
    	for(int i = 0 ; i < 7; i ++) {
    		int num = Integer.parseInt(br.readLine());
    		if(num %2 == 1) {
    			sum += num;
    			min = Math.min(min, num);
    		}
    	}
    	if( sum !=0) {
    		sb.append(sum).append("\n");
        	sb.append(min);
    	}else {
    		sb.append(-1);
    	}
      
    }

    

    void print() {
        System.out.print(sb);
    }
}
