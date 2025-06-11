public class DemoAntrian {
    public static void main(String[] args) {
        Antrian a = new Antrian();

        System.out.println("Antrian Kosong?"+ a.habiskah());

        Pembeli Fathi = new Pembeli("Fathi");
        Pembeli Dante = new Pembeli("Dante");
        Pembeli Dodit = new Pembeli("Dodit");
        Pembeli Faker = new Pembeli("Faker");

        a.mengantri(Fathi);
        a.mengantri(Dante);
        a.mengantri(Dodit);
        a.mengantri(Faker);

        System.out.println("----------");
        System.out.println("Antrian Kosong?"+ a.habiskah());

        while(a.adaOrangnya()) {
            System.out.println("Ambil paling depan :"+ a.layani().nama);
        }

        System.out.println("Sudah kosong");
    }
}
