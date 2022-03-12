package Tutorial1;

//class tanpa konstruktor
class polos {
    String datastring;
    int dataint;
}
//class dengan konstruktor
class Mahasiswa {
    String nama;
    String NIM ;
    String jurusan;
    
    // Mahasiswa(){
    //     System.out.println(" Ini adalah construktor");
    // }
    Mahasiswa(String inputnama){
        nama = inputnama;
    }
}

public class Main {
    public static void main(String[] args) {
        // new Mahasiswa();
        Mahasiswa mhs = new Mahasiswa("Qintari");
        System.out.println(mhs.nama);

        // System.out.println("Hello World");
        // polos datapolos = new polos();
        // datapolos.datastring ="haiii ";
        // datapolos.dataint = 4 ;
        // System.out.println(" ");
        // System.out.println(datapolos.datastring);
        // System.out.println(datapolos.dataint);
    }
}
