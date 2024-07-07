package klinikKecantikan;

//inheritance
public class ClientDetail extends Client {
    //overriding
    public ClientDetail(String nama, String member) {
        super(nama, member);
    }
    
    public int getMasaBerlaku() {
        return Integer.parseInt(getMember().substring(3,5)) + 2000;
    }
    
    public String getDokter() {
        String kodeDok = getMember().substring(1,3);
        //seleksi if
        if(kodeDok.equals("11")) {
            return "dr.Dewi Sophia";
        } else {
            return "Dokter sedang cuti";
        }
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo() {
        return super.displayInfo()+
                "\nMasa Berlaku: "+getMasaBerlaku()+
                "\nDokter: "+getDokter();
    }
}

