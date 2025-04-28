
import java.util.*;
import java.io.*;

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
    
    void setting() throws NumberFormatException, IOException {
    	HashSet<String> list = new HashSet<>();
    	int cnt = 0;
    	int num = Integer.parseInt(br.readLine());
    	for(int i = 0; i < num; i++) {
    		String s = br.readLine();
    		if (s.equals("ENTER")) {

    			list.clear();
    		}else if(!list.contains(s)){
    			list.add(s);
    			cnt ++;
    		}else {
    			list.add(s);
    		}
    		
    	}
    	sb.append(cnt);
    	
    }
   

    void print() {
        System.out.print(sb);
    }
}