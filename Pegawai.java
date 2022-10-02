public class Pegawai{
    
        private String nama, nip;
        private double uangMakan = 3500;
        private double transport = 4000;
        private int gajiPokok;
        private double lembur;
        private double jumlahGaji;
        private int jumlahJamKerja;

        public Pegawai(String nama, String nip){
            this.nama = nama;
            this.nip = nip;
        }
        public void setJamKerja(int jumlahJamKerja){
            this.jumlahJamKerja = jumlahJamKerja;
        }

        public int getJamKerja(){
            return jumlahJamKerja;
        }

        public void hitungGajiHarian(){
            if(jumlahJamKerja >= 7 && jumlahJamKerja < 8){
                gajiPokok = 2000*jumlahJamKerja;
                lembur = (1.5*gajiPokok)-gajiPokok;
                jumlahGaji = gajiPokok+lembur;
            }
            else if (jumlahJamKerja >= 8 && jumlahJamKerja < 9){
                gajiPokok = 2000*jumlahJamKerja;
                lembur = (1.5*gajiPokok)-gajiPokok;
                jumlahGaji = gajiPokok + lembur+ uangMakan ;
            }
            else if(jumlahJamKerja >= 9){
                gajiPokok = 2000*jumlahJamKerja;
                lembur = (1.5*gajiPokok)-gajiPokok;
                jumlahGaji = gajiPokok+uangMakan+transport+lembur;
            }
            else{
            gajiPokok = 2000*jumlahJamKerja;
            jumlahGaji = 2000*jumlahJamKerja;
            }
        }

        public void cetakPenghasilan(){
            if(jumlahJamKerja >= 7 && jumlahJamKerja < 8){
                
               System.out.println("============== NOTA GAJI PT XYZ===================");
                System.out.println("NIP : "+nip);
                System.out.println("Nama : "+nama);
                System.out.println("Gaji Pokok : Rp "+gajiPokok);
                System.out.println("Lembur : Rp "+lembur);
                System.out.println("Uang Makan : Rp 0");
                System.out.println("Uang Transport : Rp 0");
                System.out.println("Total Gaji diterima : Rp "+jumlahGaji);
                System.out.println("=================================================");
            }
            else if (jumlahJamKerja >= 8 && jumlahJamKerja < 9){
                
                System.out.println("============== NOTA GAJI PT XYZ===================");
                System.out.println("NIP : "+nip);
                System.out.println("Nama : "+nama);
                System.out.println("Gaji Pokok : Rp "+gajiPokok);
                System.out.println("Lembur : Rp "+lembur);
                System.out.println("Uang Makan : Rp "+uangMakan);
                System.out.println("Uang Transport : Rp 0");
                System.out.println("Total Gaji diterima : Rp "+jumlahGaji);
                System.out.println("=================================================");
            
        }
            else if(jumlahJamKerja >= 9){
               
                System.out.println("============== NOTA GAJI PT XYZ===================");
                System.out.println("NIP : "+nip);
                System.out.println("Nama : "+nama);
                System.out.println("Gaji Pokok : Rp "+gajiPokok);
                System.out.println("Lembur : Rp "+lembur);
                System.out.println("Uang Makan : Rp "+uangMakan);
                System.out.println("Uang Transport : Rp "+transport);
                System.out.println("Total Gaji diterima : Rp "+jumlahGaji);
                System.out.println("=================================================");
            
            }
            else{ 
               System.out.println("============== NOTA GAJI PT XYZ===================");
                System.out.println("NIP : "+nip);
                System.out.println("Nama : "+nama);
                System.out.println("Gaji Pokok : Rp "+gajiPokok);
                System.out.println("Lembur : Rp 0");
                System.out.println("Uang Makan : Rp 0");
                System.out.println("Uang Transport : Rp 0");
                System.out.println("Total Gaji diterima : Rp "+jumlahGaji);
                System.out.println("=================================================");
            }

        }
    
}
