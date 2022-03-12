import java.util.LinkedList;

public class zidan{
public static void main(String[] args) {

    LinkedList <String> No_BP = new LinkedList<String>();
    LinkedList <String> Nama_Mahasiswa = new LinkedList<String>();
    LinkedList <String> Alamat = new LinkedList<String>();

    No_BP.add("2111521023");
    Nama_Mahasiswa.add("Darma Zidane Gusnambi");
    Alamat.add("Bengkulu");
    
    System.out.println("No_BP\t:"+No_BP);
    System.out.println("Nama\t:"+Nama_Mahasiswa);
    System.out.println("Alamat\t:"+Alamat);

    //Fungsi add
    System.out.println("");
    System.out.println("Daftar Mahhasiswa:");
    No_BP.add("2111521095");
    No_BP.add("2111521098");
    No_BP.add("2111521099");
    Nama_Mahasiswa.add("Sofia");
    Nama_Mahasiswa.add("Juna");
    Nama_Mahasiswa.add("Annisa");
    Alamat.add("Jakarta");
    Alamat.add("Medan");
    Alamat.add("Sulawesi");
    System.out.println("Nama\t:"+Nama_Mahasiswa);
    System.out.println("Alamat\t:"+Alamat);
    System.out.println("No_BP\t:"+No_BP);

    //Fungsi Size
    System.out.println("");
    System.out.println("Ukuran dari LinkedList:");
    System.out.println("Ukuran Nama\t:"+Nama_Mahasiswa.size());
    System.out.println("Ukuran Alamat\t:"+Alamat.size());
    System.out.println("Ukuran No_BP\t:"+No_BP.size());

    //Fungsi set
    System.out.println("");
    System.out.println("Daftar Mahasiswa:");
    No_BP.set(2,"2111521097");
    Nama_Mahasiswa.set(2,"Kevin");
    Alamat.set(2,"Palembang");
    System.out.println("Nama\t:"+Nama_Mahasiswa);
    System.out.println("Alamat\t:"+Alamat);
    System.out.println("No_BP\t:"+No_BP);

    //fungsi remove
    System.out.println("");
    System.out.println("Daftar Mahasiswa:");
    No_BP.remove(3);
    Nama_Mahasiswa.remove(3);
    Alamat.remove(3);
    System.out.println("Nama\t:"+Nama_Mahasiswa);
    System.out.println("Alamat\t:"+Alamat);
    System.out.println("No_BP\t:"+No_BP);

    //Fungsi Push
    System.out.println("");
    System.out.println("Daftar Mahasiswa:");
    No_BP.push("2111520021");
    No_BP.push("2111520019");
    No_BP.push("2111520017");
    Nama_Mahasiswa.push("Sarah");
    Nama_Mahasiswa.push("Naurah");
    Nama_Mahasiswa.push("Teguh");
    Alamat.push("Jambi");
    Alamat.push("Lampung");
    Alamat.push("Solo");
    System.out.println("Nama\t:"+Nama_Mahasiswa);
    System.out.println("Alamat\t:"+Alamat);
    System.out.println("No_BP\t:"+No_BP);

    //Fungsi POP
    System.out.println("");
    System.out.println("Daftar Mahasiswa:");
    No_BP.pop();
    Nama_Mahasiswa.pop();
    Alamat.pop();
    System.out.println("Nama\t:"+Nama_Mahasiswa);
    System.out.println("Alamat\t:"+Alamat);
    System.out.println("No_BP\t:"+No_BP);

    //Fungsi get
    System.out.println("");
    System.out.println("Mahasiswa Ditemukan:");
    System.out.println("Nama\t:"+Nama_Mahasiswa.get(3));
    System.out.println("Alamat\t:"+Alamat.get(3));
    System.out.println("No_BP\t:"+No_BP.get(3));

    //Fungsi indexOf
    System.out.println("");
    System.out.println("Mahasiswa Ditemukan:");
    System.out.println("Nama\t:"+Nama_Mahasiswa.indexOf("Naurah"));
    System.out.println("Alamat\t:"+Alamat.indexOf("Jakarta"));
    System.out.println("No_BP\t:"+No_BP.indexOf("2111521023"));


}    
}