import java.util.*;
public class Pertanyaan1 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int N;

        System.out.print("Masukkan jumlah N = ");
        N = input13.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j<=N;j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(" " + N);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        input13.close();
    }
}