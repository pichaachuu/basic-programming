import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner pln = new Scanner(System.in);
        int penggunaanListrik, hargaListrik = 1500, jumlahTagihan, ambangBatas = 500;

        System.out.println("Masukkan jumlah penggunaan listrik dalam kWh: ");
        penggunaanListrik = pln.nextInt();

        jumlahTagihan = penggunaanListrik * hargaListrik;
        System.out.println("jumlah tagihan anda sebesar " + jumlahTagihan);
        System.out.println("Apakah penggunaan listrik di atas ambang batas? " + (penggunaanListrik > ambangBatas));
        
        pln.close();
    }
}
