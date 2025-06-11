public class Antrian {
    
    Pembeli palingDepan;
    Pembeli palingBelakang;

    //push atau nambah pembeli ke antrian (enqueue)
    public void mengantri(Pembeli p){
        if(habiskah()){     //jika antrian kosong, elemen pertama adalah paling depan dan paling belakang
            palingDepan = p;
            palingBelakang = p;
        } 
        
        else {              //jika kosong, tambahkan ke belakangnya
            palingBelakang.diBelakangnya = p;
            palingBelakang = p;
        }
    }

    //pop atau mengurangi pembeli dari antrian (dequeue)
    public Pembeli layani(){
        if(habiskah()){     
            return null;    //atau bisa pakai throw exception kalau antriannya kosong
        }
        
        Pembeli depan = palingDepan;
        palingDepan = depan.diBelakangnya;
        if(palingDepan == null){    //jika antrian menjadi kosong setelah dilayani
            palingBelakang = null;
        }
        return depan;
    }

    //peek
    public Pembeli terdepan(){
        return palingDepan;
    }

    //Is Empty
    public Boolean habiskah(){
        return palingDepan == null;
    }

    public Boolean adaOrangnya(){
        return !habiskah();
    }
}
