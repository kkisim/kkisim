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
         
         String A[] = br.readLine().split("");
         int count =0;
         
         for(int i = 0; i <A.length;i++) {
        	 if(A[i].equals("a")) {
        		 count++;
        	 }else if (A[i].equals("e")) {
        		 count++;
        	 }else if (A[i].equals("i")){
        		 count++;
        	 }else if (A[i].equals("o")) {
        		 count++;
        	 }else if (A[i].equals("u")) {
        		 count++;
        	 }
        	 
         }
         sb.append(count);
       
     }

    
    void print() {
        System.out.print(sb.toString());
    }
   
}

