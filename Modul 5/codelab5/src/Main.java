import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaMahasiswa = new ArrayList<>();

        int i = 1;
        while (true) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String nama;
            try {
                nama = scanner.nextLine();
                if (nama.isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan nama yang benar!");
                scanner.next();
                continue;
            }

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            namaMahasiswa.add(nama);
            i++;
        }

        System.out.println("\nDaftar mahasiswa yang diinputkan:");
        for (String nama : namaMahasiswa) {
            System.out.println("- " + nama);
        }
    }
}