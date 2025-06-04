public class Siswa {
    String nama;
    Siswa berikutnya;

    // karena kita buat constructor sendiri,
    // maka default constructtor tidak dibuatkan oleh JVM
    /* 
    public Siswa(){
    
    }
    */

    public Siswa(String x){
        nama = x;
    }
}
