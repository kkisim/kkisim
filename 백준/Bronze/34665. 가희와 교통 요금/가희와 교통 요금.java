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

         String A = br.readLine();
         String B = br.readLine();
         
         if (A.equals(B)) {
        	 sb.append(0);
         }else {
        	 sb.append(1550);
         }
         
     }

    
    void print() {
        System.out.print(sb.toString());
    }
   
}

