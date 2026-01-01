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
    Student[] arr;
   
    void setting() throws NumberFormatException, IOException {
    	 br = new BufferedReader(new InputStreamReader(System.in));
         sb = new StringBuilder();

         int N = Integer.parseInt(br.readLine());
         arr = new Student[N];

         for (int i = 0; i < N; i++) {
             StringTokenizer st = new StringTokenizer(br.readLine());
             String name = st.nextToken();
             int kor = Integer.parseInt(st.nextToken());
             int eng = Integer.parseInt(st.nextToken());
             int math = Integer.parseInt(st.nextToken());

             arr[i] = new Student(name, kor, eng, math);
         }
         Arrays.sort(arr, new Comparator<Student>() {
             @Override
             public int compare(Student a, Student b) {
                 if (a.kor != b.kor) {
                     return b.kor - a.kor;
                 }
                 if (a.eng != b.eng) {
                     return a.eng - b.eng;
                 }
                 if (a.math != b.math) {
                     return b.math - a.math;
                 }
                 return a.name.compareTo(b.name);
             }
         });

         for (Student s : arr) {
             sb.append(s.name).append('\n');
         }
     }

    
    void print() {
        System.out.print(sb.toString());
    }
    class Student {
        String name;
        int kor, eng, math;

        Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
}
}

