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

         int x = Integer.parseInt(br.readLine());
         if(x % 3 ==0) {
        	 sb.append("S");
         }else if (x % 3 ==1) {
        	 sb.append("U");
         }else if (x % 3 ==2) {
        	 sb.append("O");
         }
     }

    
    void print() {
        System.out.print(sb.toString());
    }
   
}

