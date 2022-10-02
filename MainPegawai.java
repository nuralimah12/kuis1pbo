/**
 * MainPegawai
 */
import java.util.Scanner;
public class MainPegawai {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("|NIM   : 21417620004|");
        System.out.println("|NAMA  : NUR ALIMAH |");
        System.out.println("|KELAS : SIB2E      |");
        System.out.println();
        System.out.println("********SISTEM PENGGAJIAN KARYAWAN PT XYZ*******");
        System.out.println("Masukan Nama Pegawai");
        String nama = sc.nextLine();
        System.out.println("Masukan NIP Pegawai");
        String nip = sc.next();
        System.out.print("Masukan jumlah Jam Kerja");
        int jumlahJamKerja = sc.nextInt();
        Pegawai pegawai1 = new Pegawai(nama,nip);
        pegawai1.setJamKerja(jumlahJamKerja);
        pegawai1.hitungGajiHarian(); 
        pegawai1.cetakPenghasilan();
        
    }
}