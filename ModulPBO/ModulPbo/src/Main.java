
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner saya = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        String nama = saya.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelaminInput = saya.nextLine();

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = saya.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        LocalDate now = LocalDate.now();
        long tahun = ChronoUnit.YEARS.between(tanggalLahir, now);
        long bulan = ChronoUnit.MONTHS.between(tanggalLahir.plusYears(tahun), now);

        System.out.println("\nOutput:");
        System.out.println("Nama: " + nama);

        if (jenisKelaminInput.equalsIgnoreCase("L") || jenisKelaminInput.equalsIgnoreCase("l")){
            System.out.println("Jenis kelamin : Jenis kelamin anda laki laki");
        }
        else if (jenisKelaminInput.equalsIgnoreCase("P") || jenisKelaminInput.equalsIgnoreCase("p")){
            System.out.println("Jenis kelamin : Jenis kelamin anda perempuan");
        }
        else {
            System.out.println("InputAN tIDAK valid");
        }
        System.out.println("Umur Anda: " + tahun + " tahun " + bulan + " bulan");
    }
}
