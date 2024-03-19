import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputDataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan jenis kelaminmu(L/P): ");
        String gender = scanner.nextLine();
        String genderDisplay = (gender.equalsIgnoreCase("P")) ? "Perempuan" : "Laki-laki";

        System.out.print("Masukkan tanggal lahir (dd/MM/yyyy): ");
        LocalDate dob = LocalDate.parse(scanner.nextLine(), formatter);

        LocalDate now = LocalDate.now();
        Period age = Period.between(dob, now);

        System.out.println("\n====== Input Data Diri ======");
        System.out.println("Nama: " + name);
        System.out.println("Jenis kelamin: " + genderDisplay);
        System.out.println("Umur: " + age.getYears() + " tahun");
    }
}