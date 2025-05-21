public class Kelas {
    Siswa pertama;

    public Kelas(Siswa x){
        pertama = x;
    }

    public Siswa ambilDi(Integer index){
        Siswa sekarang = pertama; //dimulai dari node pertama
        int i = 0; //menghitung posisi index
        while (sekarang !=null) {
            if (i == index) {
                return sekarang;
            }
            sekarang = sekarang.berikutnya;
            i++;
        }
        return null; //kalau indexnya lebih dari jumlah siswa, biar balik ke awal
    }
    
    public Integer urutan(String nama){
        Siswa sekarang = pertama;
        int i = 0;
        while (sekarang != null) {
            if (sekarang.nama.equals(nama)) {
                return i;
            }
            sekarang = sekarang.berikutnya;
            i++;
        }
        return null; //kalau tidak ketemu urutannya
    }

    public Integer jumlahSiswa(){
        Siswa sekarang = pertama;
        int jumlah = 0;
        while (sekarang != null) {
            jumlah++;
            sekarang = sekarang.berikutnya;
        }
        return jumlah;
    }

    public void tambahDiDepan(Siswa s) {
        s.berikutnya = pertama;
        pertama = s;
    }

    public void tambahSetelah(String nama, Siswa s){
        Siswa sekarang = pertama;
        while (sekarang != null) {
            if (sekarang.nama.equals(nama)){
                s.berikutnya = sekarang.berikutnya;
                sekarang.berikutnya = s;
                break;
            }
            sekarang = sekarang.berikutnya;
        }
    }

    public void hapus(String nama){
        if (pertama == null) return;

        if (pertama.nama.equals(nama)) {
            pertama = pertama.berikutnya;
            return;
        }

        Siswa sekarang = pertama;
        while (sekarang.berikutnya != null) {
            if (sekarang.berikutnya.nama.equals(nama)) {
                sekarang.berikutnya = sekarang.berikutnya.berikutnya;
                return;
            }
            sekarang = sekarang.berikutnya;
        }
    }

    public void tambahDiBelakang(Siswa s){
        Siswa terakhir = cariTerakhir();
        terakhir.berikutnya = s;
    }

    public void tampilkanSemua(){
        Integer urutan = 0;
        System.out.println("Sekarang urutan ke :"+urutan);

        Siswa sekarang = pertama; //endy
        System.out.println("Siswa swkarang :"+sekarang.nama);

        while(sekarang.berikutnya != null) {
            urutan++;
            System.out.println("Sekarang urutan ke :"+urutan);
            //pindah ke record berikutnya
            sekarang = sekarang.berikutnya;
            System.out.println("Siswa sekarang :"+sekarang.nama);

        }
    }

    private Siswa cariTerakhir(){
        Siswa sekarang = pertama;
        while(sekarang.berikutnya != null) {
            sekarang = sekarang.berikutnya;
        }
        return sekarang;
    }
}