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
    	String m []  = br.readLine().split(" ");
    	String s []  = br.readLine().split(" ");
    	int num1 = 0;
    	int num2 = 0;
    	
    	for(int i = 0; i<m.length; i++) {
    		num1 += Integer.parseInt(m[i]);
    	}
    	for(int i =0; i< s.length; i++) {
    		num2 += Integer.parseInt(s[i]);
    	}
    	
    	if(num2 > num1 ) {
    		sb.append(num2);
    	}else {
    		sb.append(num1);
    	}
      
    }

    

    void print() {
        System.out.print(sb);
    }
}
