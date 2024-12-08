import java.util.Scanner;
public class Pertanyaan2 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("=======Daftar Nama Atlet Terbaik Politeknik se-Indonesia=======");
        System.out.println("Cabang Olahraga");
        System.out.println("1. Badminton");
        System.out.println("2. Tenis Meja");
        System.out.println("3. Basket");
        System.out.println("4. Bola Voly");
        System.out.println();
        
        int i, j;
        String namaAtlet;

        i = 1;
        while (i <= 4) {
            System.out.println("Cabang Olahraga ke-" + i);
            for (j=1; j<=5; j++) {
                System.out.print(j + ".");
                namaAtlet = input13.nextLine();
            }
            i++;
        }
        input13.close();
    }
}
