
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
    	Map<String, Integer> map = new HashMap<>();
    	String [] s = br.readLine().split(" ");
    	int num = Integer.parseInt(s[0]);
    	int len = Integer.parseInt(s[1]);
    	
    	for(int i = 0; i<num; i++) {
    		String str = br.readLine();
    		if(str.length()>=len) {
    			 map.put(str, map.getOrDefault(str, 0) + 1);
    		}
    	}
    	 List<String> list = new ArrayList<>(map.keySet());
    	 Collections.sort(list, new Comparator<String>() {
             
             public int compare(String k1, String k2) {
                 if (!map.get(k1).equals(map.get(k2))) {
                     return map.get(k2) - map.get(k1); 
                 } else if (k1.length() != k2.length()) {
                     return k2.length() - k1.length(); 
                 } else {
                     return k1.compareTo(k2); 
                 }
             }
         });
    	 for (String str : list) {
             sb.append(str).append('\n');
         }
    	
    	
    	
    }
   

    void print() {
        System.out.print(sb);
    }
}