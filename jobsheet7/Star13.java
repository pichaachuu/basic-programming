import java.util.Scanner;
public class Star13 {

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input13.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
        input13.close();
    }
}