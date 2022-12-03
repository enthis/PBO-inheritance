import java.time.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pegawai p1 = new Pegawai("P01", "Rosihan Ari", 2, LocalDate.of(1979, 9, 1));
        p1.printPegawai();
        // contoh obyek data pegawai dosen
        Dosen p2 = new Dosen("P02", "Dwi Amalia Fitriani", 1, LocalDate.of(1979, 9, 1),"1234");
        p2.printPegawai();
        // contoh obyek data pegawai nondosen
        NonDosen p3 = new NonDosen("P03", "Faza Fauzan K", 1, LocalDate.of(2008, 1, 2));
        p3.printPegawai();
    }
}
