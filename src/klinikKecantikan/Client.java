package klinikKecantikan;

//class
public class Client {
    //atribut dan encapsulation
    private String nama;
    private String member;
    
    //constructor
    public Client(String nama, String member) {
        this.nama = nama;
        this.member = member;
    }
    
    //mutator(setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHari(String member) {
        this.member = member;
    }
    
    //accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getMember() {
        return member;
    }
    
    public String displayInfo() {
        return "Nama: "+getNama() + "\nMember: "+getMember();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String Keperluan) {
        return displayInfo() + "\nKeperluan: "+Keperluan;
    }
}

