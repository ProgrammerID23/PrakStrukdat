package kegiatan1_datapraktikan;

import java.util.HashMap;

public class Login {
     private final HashMap<String, String> tabelData;

    public Login() {
        tabelData = new HashMap<>();
        tabelData.put("nopal@umm.ac.id", "nopal");
        
    }
     
     public boolean sesiLogin(String email, String password){
        if(tabelData.containsKey(email) && tabelData.get(email).equals(password)){
            if(email.endsWith("@umm.ac.id")){
            System.out.println("Login Berhasil");
            return true;
        }else{ 
            System.out.println("Gagal Login. Email tidak menggunakan domain @umm.ac.id");
            return false;
            }
        } else{
            System.out.println("Gagal Login. Email atau password salah");
            return false;
        }
    } 
}
