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
    	 br = new BufferedReader(new InputStreamReader(System.in));
         sb = new StringBuilder();
         
         String s = br.readLine();
         int T = Integer.parseInt(br.readLine());
         int count = 0;
         
         for(int i = 0 ; i <T; i++) {
        	 String a = br.readLine();
        	 if(s.equals(a)) {
        		 count++;
        	 }
         }
         sb.append(count);
     }
    
    void print() {
        System.out.print(sb.toString());
    }
   
}

