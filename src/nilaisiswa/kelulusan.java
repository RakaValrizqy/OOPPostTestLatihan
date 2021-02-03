package nilaisiswa;

public class kelulusan {

    public static void main(String[] args) {
    //object
        siswa pelajar = new siswa();

    //pengisian Atribut 
        pelajar.nama= "Anya";
        pelajar.nilai= 80;

    //menjalankan    method
        pelajar.cetaknilai();

    //menentukan lulus 
        if(pelajar.lulus()){
        System.out.println("selamat anda lulus");
        }
        else if(pelajar.tidaklulus()){
        System.out.println("Anda harus belajar lebih giat lagi");
        }

    }
    
}
