import java.util.Scanner;
public class RataNilai13 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        int i , j;
        float nilai, totalNilai, rataNilai;

        System.out.print("Masukkan jumlah mahasiswa = ");
        int jmlMhs = input13.nextInt();

        i = 1;
        while (i<=jmlMhs) {
            System.out.println("Input Nilai Mahasiswa ke-" + i);
            totalNilai = 0;
            for (j=1;j<=5;j++) {
                System.out.print("Nilai ke-" + j + " = " );
                nilai = input13.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
            i++;
        }
        input13.close();
    }
}
