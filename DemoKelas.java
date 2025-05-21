public class DemoKelas {
    public static void main(String[] args) {
        Siswa endy = new Siswa("Endy");

        Kelas k = new Kelas(endy);

        Siswa fikri = new Siswa("Fikri");
        k.tambahDiBelakang(fikri);
        k.tambahDiBelakang(new Siswa("Naufal"));
        k.tambahDiBelakang(new Siswa("Azmi"));
        k.tambahDiBelakang(new Siswa("Rahma"));
        k.tampilkanSemua();

        System.out.println("Data awal");
        k.tampilkanSemua();

        System.out.println("\nJumlah siswa : "+ k.jumlahSiswa());
        System.out.println("Siswa di index 2 :"+ k.ambilDi(2).nama);
        System.out.println("Urutan Michael : "+ k.urutan("Fikri"));

        System.out.println("\nMenambah 'Akmal' di depan...");
        k.tambahDiDepan(new Siswa("Akmal"));
        k.tampilkanSemua();

        System.out.println("\nMenambah 'Ojan' setelah 'Naufal'...");
        k.tambahSetelah("Naufal", new Siswa("Ojan"));
        k.tampilkanSemua();

        System.out.println("\nMenghapus 'Naufal'..");
        k.hapus("Naufal");
        k.tampilkanSemua();

        System.out.println("\nMenghapus 'Malphite'..");
        k.hapus("Malphite");
        k.tampilkanSemua();

        System.out.println("\nJumlah Siswa sekarang"+ k.jumlahSiswa());
    }
}
