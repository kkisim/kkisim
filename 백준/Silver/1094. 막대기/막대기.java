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
    	int count = 0;
    	for(int i = 7 ; i >=0; i--) {
    		if( num <=64 && num >=Math.pow(2, i)) {
    			num -= Math.pow(2, i);
    			count++;
    		}
    		if(num == 0) {
    			break;
    		}
    	}
    	sb.append(count);
      
    }

    

    void print() {
        System.out.print(sb);
    }
}
