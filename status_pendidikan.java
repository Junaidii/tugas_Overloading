package tugas_Overloading;

public class status_pendidikan {

    String status ="Aktif";

    status_pendidikan(String paranstatus){
        this.status = paranstatus;
    }

    void cetakstatus_pendidikan(String status){
        System.out.println("Status = "+ status);
    }
}
