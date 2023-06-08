package kegiatan1_datapraktikan;


import java.util.Scanner;

public class Kegiatan1_DataPraktikan {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int login;
        boolean result, ulang = true;
        String nimPraktikan, namaAsisten;
        Scanner s = new Scanner(System.in);
        DataPraktikan dp = new DataPraktikan();
        Login l = new Login();
        
        do{
        System.out.println("Masukan Email: ");
        String email = s.next();
        System.out.println("Masukan Password: ");
        String password = s.next();
        
        result = l.sesiLogin(email, password);
        
        if(result){
            while (ulang){
            System.out.println("\nMenu Pilihan :");
            System.out.println("1. Tambah praktikan baru");
            System.out.println("2. Tampilkan praktikan");
            System.out.println("3. List nim praktikan");
            System.out.println("4. List nama asisten");
            System.out.println("5. Total Data");
            System.out.println("6. Hapus Data");
            System.out.println("7. Edit Data");
            System.out.println("8. Logout");

            System.out.print("Pilihan: ");
            int pilihan = s.nextInt();
            
          
            switch(pilihan){
                case 1:
                    System.out.println("Masukan NIM: ");
                    nimPraktikan = s.next();
                    System.out.println("Masukan Nama Asisten: ");
                    namaAsisten = s.next();
                    result = dp.tambahData(nimPraktikan, namaAsisten);
                    if(result){
                        System.out.println("data berhasil ditambahkan");
                    }else{
                        System.out.println("data gagal ditambahkan");
                    }
                    break;
                case 2:
                    dp.tampil();
                    break;
                case 3:
                    dp.listNimPraktikan();
                    break;
                case 4:
                    dp.listNamaPraktikan();
                    break;
                case 5:
                    int total = dp.TotalData();
                    System.out.println("total data: "+total);
                    break;
                case 6:
                    System.out.println("Masukan NIM: ");
                    nimPraktikan = s.next();
                    System.out.println("Masukan Nama Asisten: ");
                    namaAsisten = s.next();
                    result = dp.Hapusdata(nimPraktikan, namaAsisten);
                    if(result){
                        System.out.println("data berhasil dihapus");
                    }else{
                        System.out.println("data gagal dihapus");
                    }
                    break;
                case 7:
                    System.out.println("Masukan NIM: ");
                    nimPraktikan = s.next();
                    System.out.println("Masukan Nama Asisten: ");
                    namaAsisten = s.next();
                    result = dp.EditData(nimPraktikan, namaAsisten);
                    if(result){
                        System.out.println("data berhasil diedit");
                    }else{
                        System.out.println("data gagal diedit");
                    }
                    break;
                case 8:
                    System.out.println("Anda Logout");
                    ulang = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            }
          }else{
              System.out.println("Gagal Login");  
        }
            System.out.println("Apakah anda ingin login lagi ? 1/2");
            login = s.nextInt();
            
        }while (login == 1);
        
        }
          
    }
