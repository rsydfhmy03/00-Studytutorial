package Tutorial;

class Mahasiswa {
    String nama;
    String Nim;
    int umur;
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world !!");
        Mahasiswa mhs = new Mahasiswa();
        mhs.Nim = "E41212200";
        System.out.println(mhs.nama);
        System.out.println(mhs.Nim);
        System.out.println(mhs.umur);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama ="Fahmy Rosyadi";
        mhs2.Nim = "E41212254";
        mhs2.umur = 19;
        System.out.println(mhs2.nama);
        System.out.println(mhs2.Nim);
        System.out.println(mhs2.umur);
    }
}
