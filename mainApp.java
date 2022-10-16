package tugas_Overloading;

public class mainApp {
    public static void main(String[]args){

        karyawan karyawan=new karyawan("Junaedy", "Pengoros", "087816998100");

        penggajian penggajian=new penggajian("Rp.3.000.000", "Rp.2.500.000","Rp.5.000.000");

        status_pendidikan   status_pendidikan=new   status_pendidikan("Aktif");

        jabatan jabatan=new jabatan("Admin");


        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }


}
