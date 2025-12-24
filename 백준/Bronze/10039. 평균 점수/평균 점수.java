import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
   
    void setting() throws NumberFormatException, IOException {
    	int T = 5;
    	int a [] = new int [5];
    	int sum =0;
    	for(int i =0; i<5; i++ ) {
    		a[i] = Integer.parseInt(br.readLine());
    		if(a[i] <40) {
    			a[i] = 40;
    		}
    		sum += a[i];
    	}
    	int result = sum /5;
    	sb.append(result);
    }
    void print() {
        System.out.print(sb.toString());
    }
}
