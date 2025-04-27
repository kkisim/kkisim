import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();

        double k = Math.sqrt((double)(D * D) / (H * H + W * W));

        int height = (int)(k * H);
        int width = (int)(k * W);

        System.out.println(height + " " + width);
    }
}
