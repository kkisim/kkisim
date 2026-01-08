import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br;
    StringBuilder sb;

    int N;
    int[] T, P;
    int[] dp;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        
        
        String s [] = br.readLine().split(" ");
        
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        int a [][] = new int [n+1][n+1]; 
        
        for (int i = 0; i <= n; i++) a[i][0] = 1;
        
        if (n >= 1) a[1][1] = 1;
        if (n >= 2) {
            a[2][1] = 1;
            a[2][2] = 1;
        }
    	for(int i = 3; i < n+1;i++) {
    		a[i][1] = 1;
    		a[i][i] = 1;
    		for(int j = 2; j<i;j++) {
    			a[i][j] = a[i-1][j-1]+a[i-1][j];
    		}
        }
        
        sb.append(a[n][k]);
    }

    void print() {
        System.out.print(sb.toString());
    }
}
