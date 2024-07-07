package klinikKecantikan;

import java.util.Scanner;

public class Reservasi {
    public static void main(String[] args) {
        //objek
        //Client clnt = new Client ("Natasya Deviana","N1125");
        
        //System.out.println(clnt.displayInfo());
        //System.out.println(clnt.displayInfo("Konsultasi"));
        
        //IO sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        ClientDetail[] clnt = new ClientDetail[2];
        
        for(int i=0; i<clnt.length; i++) {
            System.out.println("Masukkan nama Client "+(i+1)+ ": ");
            String nama = scanner.nextLine();
            System.out.println("Masukkan member client "+(i+1+": "));
            String member = scanner.nextLine();
        
            //object
            clnt[i] = new ClientDetail(nama, member);
        }
        for(ClientDetail data: clnt){
            System.out.println("===================");
            System.out.println("Data Clieny: ");
            System.out.println(data.displayInfo());
        }
    }
}
